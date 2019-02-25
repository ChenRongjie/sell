package com.sell.repository;

import com.sell.dataobject.ProductCategory;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import javax.transaction.Transactional;
import java.util.Arrays;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-20 21:00
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductCategoryRepositoryTest {

    @Autowired
    private ProductCategoryRepository repository;

    @Test
    public void findOneTest(){
        ProductCategory productCategory = repository.findById(1).get();
        System.out.println(productCategory.toString());

        /*String s = repository.findById(1).toString();
        System.out.println(s);*/
    }

    @Test
    public void saveInsertTest(){
        ProductCategory productCategory = new ProductCategory("热榜",4);
        //productCategory.setCategoryId(2); //自增

        repository.save(productCategory);

    }

    @Test
    @Transactional
    public void saveUpdateTest(){
        ProductCategory category = new ProductCategory("男生最爱",16);

        ProductCategory result = repository.save(category);
        Assert.assertNotNull(result);
        Assert.assertNotEquals(null,result);
        System.out.println(result);

    }

    @Test
    public void findByCategoryTypeInTest(){
        List<Integer> list = Arrays.asList(2,3,2);
        List<ProductCategory> result = repository.findByCategoryTypeIn(list);
        for(ProductCategory productCategory : result){
            System.out.println(productCategory);
        }
        Assert.assertNotEquals(0,result.size());

    }






}