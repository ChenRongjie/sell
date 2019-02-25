package com.sell.VO;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;

import java.math.BigDecimal;

/**
 * @Auther: CRJ
 * @Date: 2019-01-27 15:16
 * @Description: 商品详情
 */
@Data
public class ProductInfoVO {

    @JsonProperty("id")
    private String productId;

    @JsonProperty("name")
    private String productName;

    @JsonProperty("price")
    private BigDecimal productPrice;

    @JsonProperty("description")
    private String productDescription;

    @JsonProperty("icon")
    private String productIcon;

}
