package com.sell.service.impl;

import com.sell.dataobject.ProductCategory;
import com.sell.repository.ProductCategoryRepository;
import com.sell.service.CategoryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-22 15:05
 * @Description:
 */
@Service
public class CategoryServiceImpl implements CategoryService {

    @Autowired
    ProductCategoryRepository repository;

    @Override
    public ProductCategory findById(Integer categoryId) {
        return repository.findById(categoryId).get();
    }

    @Override
    public List<ProductCategory> findall() {
        return repository.findAll();
    }

    @Override
    public List<ProductCategory> findByCategoryTypeIn(List<Integer> categoryTypeList) {
        return repository.findByCategoryTypeIn(categoryTypeList);
    }

    @Override
    public ProductCategory save(ProductCategory productCategory) {
        return repository.save(productCategory);
    }
}


