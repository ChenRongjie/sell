package com.sell.repository;

import com.sell.dataobject.ProductInfo;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

import java.math.BigDecimal;
import java.util.List;

/**
 * @Auther: CRJ
 * @Date: 2019-01-22 21:12
 * @Description:
 */
@RunWith(SpringRunner.class)
@SpringBootTest
public class ProductInfoRepositoryTest {

    @Autowired
    private ProductInfoRepository repository;

    @Test
    public void save(){
        ProductInfo productinfo = new ProductInfo();
        productinfo.setProductId("123456");
        productinfo.setProductName("皮蛋粥");
        productinfo.setProductPrice(new BigDecimal(3.2));
        productinfo.setProductStock(100);
        productinfo.setProductDescription("很好吃的粥");
        productinfo.setProductIcon("http://xxx.jpg");
        productinfo.setProductStatus(0);
        productinfo.setCategoryType(2);

        ProductInfo result = repository.save(productinfo);
        Assert.assertNotNull(result);

    }


    @Test
    public void findByProductStatus() {

        List<ProductInfo> productInfoList = repository.findByProductStatus(0);
        System.out.println(productInfoList);

    }
}