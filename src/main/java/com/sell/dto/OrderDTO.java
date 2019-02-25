package com.sell.dto;

import com.fasterxml.jackson.databind.annotation.JsonSerialize;
import com.sell.dataobject.OrderDetail;
import com.sell.utils.serializer.Date2LongSerializer;
import lombok.Data;

import java.math.BigDecimal;
import java.util.Date;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-13 00:21
 * @Description:
 */
@Data
public class OrderDTO {

    private String orderId;

    private String buyerName;

    private String buyerIphone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus;

    private Integer payStayus;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date createTime;

    @JsonSerialize(using = Date2LongSerializer.class)
    private Date updateTime;

    List<OrderDetail> orderDetailList;
}
