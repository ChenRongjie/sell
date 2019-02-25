package com.sell.service;

import com.sell.dataobject.ProductCategory;

import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-22 14:55
 * @Description:
 */
public interface CategoryService {

    ProductCategory findById(Integer categoryId);

    List<ProductCategory> findall();

    List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList);

    ProductCategory save(ProductCategory productCategory);

}
