package com.sell.repository;

import com.sell.dataobject.ProductInfo;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-22 16:46
 * @Description:
 */
public interface ProductInfoRepository extends JpaRepository<ProductInfo,String> {

    List<ProductInfo> findByProductStatus(Integer productStatus);
}
