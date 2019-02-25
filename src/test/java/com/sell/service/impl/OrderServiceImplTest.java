package com.sell.service.impl;

import com.sell.dataobject.OrderDetail;
import com.sell.dto.OrderDTO;
import com.sell.enums.OrderStatusEnum;
import com.sell.enums.PayStatusEnum;
import lombok.extern.slf4j.Slf4j;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.ArrayList;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-14 15:58
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
@Slf4j
public class OrderServiceImplTest {

    @Autowired
    private OrderServiceImpl orderService;

    private final String BUYER_OPENID = "1101130";

    private final String ORDER_ID = "1550139375293664153";

    @Test
    public void create() {

        OrderDTO orderDTO = new OrderDTO();
        orderDTO.setBuyerName("测试人员");
        orderDTO.setBuyerAddress("测试地址");
        orderDTO.setBuyerIphone("测试电话123");
        orderDTO.setBuyerOpenid(BUYER_OPENID);

        //购物车
        List<OrderDetail> orderDetailList = new ArrayList<>();

        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setProductId("123453");
        orderDetail.setProductQuantity(1);
        orderDetailList.add(orderDetail);
        orderDTO.setOrderDetailList(orderDetailList);

        OrderDTO result = orderService.create(orderDTO);
        log.info("【创建订单】 result = {}", result);
    }

    @Test
    public void findOne() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        log.info("【查询单个订单】 result ={}",orderDTO);
        Assert.assertEquals(ORDER_ID,orderDTO.getOrderId());
    }

    @Test
    public void findList() {
        PageRequest request = PageRequest.of(0, 2);
        Page<OrderDTO> orderDTOPage = orderService.findList(BUYER_OPENID, request);
        log.info("【查询订单列表】 result ={}",orderDTOPage );
    }

    @Test
    public void cancel() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.cancel(orderDTO);
        Assert.assertEquals(OrderStatusEnum.CANCEL.getCode(),result.getOrderStatus());

    }

    @Test
    public void finish() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.finish(orderDTO);
        Assert.assertEquals(OrderStatusEnum.FINISHED.getCode(),result.getOrderStatus());
    }

    @Test
    public void paid() {
        OrderDTO orderDTO = orderService.findOne(ORDER_ID);
        OrderDTO result = orderService.paid(orderDTO);
        Assert.assertEquals(PayStatusEnum.SUCCESS.getCode(),result.getPayStayus());
    }
}