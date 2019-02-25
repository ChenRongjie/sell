package com.sell.repository;

import com.sell.dataobject.OrderDetail;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-05 13:09
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class OrderDetailRepositoryTest {

    @Autowired
    private OrderDetailRepository repository;
    
    @Test
    public void save(){
        OrderDetail orderDetail = new OrderDetail();
        orderDetail.setDetailId("123456");
        orderDetail.setOrderId("123456");
        orderDetail.setProductId("12347");
        orderDetail.setProductName("pname");
        orderDetail.setProductIcon("http://xxx.jpg");
        orderDetail.setProductPrice(new BigDecimal(3.2));
        orderDetail.setProductQuantity(0);

        OrderDetail save = repository.save(orderDetail);
        System.out.println(save);
    }
    
    @Test
    public void findByOrderId() {
        List<OrderDetail> result = repository.findByOrderId("123456");
        System.out.println(result);
    }
}