package com.sell.converter;

import com.google.gson.Gson;
import com.google.gson.reflect.TypeToken;
import com.sell.dataobject.OrderDetail;
import com.sell.dto.OrderDTO;
import com.sell.enums.ResultEnum;
import com.sell.exception.SellException;
import com.sell.form.OrderForm;
import lombok.extern.slf4j.Slf4j;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-17 21:29
 * @Description:
 */
@Slf4j
public class OrderForm2OrderDTOConverter {

    public static OrderDTO convert(OrderForm orderForm){

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName(orderForm.getName());
        orderDTO.setBuyerIphone(orderForm.getPhone());
        orderDTO.setBuyerAddress(orderForm.getAddress());
        orderDTO.setBuyerOpenid(orderForm.getOpenid());

        List<OrderDetail> orderDetailList = new ArrayList<>();
        Gson gson = new Gson();
        try {
            orderDetailList = gson.fromJson(orderForm.getItems(),new TypeToken<List<OrderDetail>>(){}.getType());
        }catch (Exception e){
            log.error("【对象转换】 错误, string={}" ,orderForm.getItems());
            throw new SellException(ResultEnum.PARAM_ERROR);
        }
        orderDTO.setOrderDetailList(orderDetailList);

        return orderDTO;

    }

}
