package com.sell.service.impl;

import com.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.util.Arrays;
import java.util.List;

import static org.junit.Assert.*;

/**
 * @Auther: CRJ
 * @Date: 2019-01-22 15:10
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class CategoryServiceImplTest {

    @Autowired
    private CategoryServiceImpl categoryService;

    @Test
    public void findById() {
        ProductCategory productCategory = categoryService.findById(1);
        Assert.assertEquals(new Integer(1),productCategory.getCategoryId());
    }

    @Test
    public void findall() {
        List<ProductCategory> productCategoryList=categoryService.findall();
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void findByCategoryTypeIn() {
        List<ProductCategory> productCategoryList=categoryService.findByCategoryTypeIn(Arrays.asList(0,1,2));
        Assert.assertNotEquals(0,productCategoryList.size());
    }

    @Test
    public void save() {
        ProductCategory productCategory = new ProductCategory("必选", 6);
        ProductCategory result = categoryService.save(productCategory);
        Assert.assertNotNull(result);

    }
}