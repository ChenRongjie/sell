package com.sell.repository;

import com.sell.dataobject.OrderMaster;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;

import static org.junit.Assert.*;

/**
 * @Auther: CRJ
 * @Date: 2019-02-05 12:10
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderMasterRepositoryTest {
    private final String OPENID = "123456";

    @Autowired
    private OrderMasterRepository repository;

    @Test
    public void save(){

        OrderMaster orderMaster = new OrderMaster();
        orderMaster.setOrderId("1234");
        orderMaster.setBuyerOpenid(OPENID);
        orderMaster.setBuyerAddress("adress");
        orderMaster.setBuyerIphone("134 000 0000");
        orderMaster.setBuyerName("name_1");
        orderMaster.setOrderAmount(new BigDecimal(2));

        OrderMaster save = repository.save(orderMaster);
        System.out.println(save);

    }

    @Test
    public void findByBuyerOpenid() {

        PageRequest pageRequest = PageRequest.of(0, 2);
        Page<OrderMaster> result = repository.findByBuyerOpenid(OPENID, pageRequest);
        System.out.println(result);

    }
}