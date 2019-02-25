package com.sell.dto;

import lombok.Data;

/**
 * @Auther: CRJ
 * @Date: 2019-02-14 01:39
 * @Description:
 */
@Data
public class CartDTO {

    private String productId;

    private Integer productQuantity;

    public CartDTO(String productId, Integer productQuantity) {
        this.productId = productId;
        this.productQuantity = productQuantity;
    }
}
