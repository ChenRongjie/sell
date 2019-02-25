package com.sell.converter;

import com.sell.dataobject.OrderMaster;
import com.sell.dto.OrderDTO;
import org.springframework.beans.BeanUtils;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-14 22:46
 * @Description: OrderMaster转化OrderDTO
 */
public class OrderMaster2OrderDTOConverter {

    public static OrderDTO convert(OrderMaster orderMaster){

        OrderDTO orderDTO = new OrderDTO();
        BeanUtils.copyProperties(orderMaster,orderDTO);
        return orderDTO;

    }

    public static List<OrderDTO> convert(List<OrderMaster> orderMasterList){

        List<OrderDTO> orderDTOList = new ArrayList<>();
        for (OrderMaster orderMaster : orderMasterList){
            orderDTOList.add(convert(orderMaster));
        }

        return orderDTOList;

    }


}
