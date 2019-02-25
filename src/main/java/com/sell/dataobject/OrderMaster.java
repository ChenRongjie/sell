package com.sell.dataobject;

import com.sell.enums.OrderStatusEnum;
import com.sell.enums.PayStatusEnum;
import lombok.Data;
import org.hibernate.annotations.DynamicUpdate;

import javax.persistence.Entity;
import javax.persistence.Id;
import java.math.BigDecimal;
import java.util.Date;

/**
 * @Auther: CRJ
 * @Date: 2019-02-04 16:00
 * @Description:
 */
@Entity
@Data
@DynamicUpdate
public class OrderMaster {

    @Id
    private String orderId;

    private String buyerName;

    private String buyerIphone;

    private String buyerAddress;

    private String buyerOpenid;

    private BigDecimal orderAmount;

    private Integer orderStatus = OrderStatusEnum.NEW.getCode();

    private Integer payStayus = PayStatusEnum.WAIT.getCode();

    private Date createTime;

    private Date updateTime;


}
