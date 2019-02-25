package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-20 20:56
 * @Description:
 */
public interface ProductCategoryRepository extends JpaRepository<ProductCategory,Integer> {

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

}
