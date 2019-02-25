package com.sell.repository;

import com.sell.dataobject.OrderDetail;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-02-05 12:07
 * @Description:
 */
public interface OrderDetailRepository extends JpaRepository<OrderDetail,String> {

    List<OrderDetail> findByOrderId(String orderId);
}
