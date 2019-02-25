package com.sell.service;

import com.sell.dto.OrderDTO;

/**
 * @Auther: CRJ
 * @Date: 2019-02-18 18:42
 * @Description:
 */
public interface BuyerService {

    //查询一个订单
    OrderDTO findOrderOne(String openid, String orderId);

    //取消订单
    OrderDTO cancelOrder(String openid,String orderid);
}
