package com.sell.enums;

import lombok.Getter;

/**
 * @Auther: CRJ
 * @Date: 2019-01-23 15:09
 * @Description:
 */
@Getter
public enum ProductStatusEnum {
    UP(0,"在架"),
    DOWN(1,"下架")
    ;

    private Integer code;
    private String message;

    ProductStatusEnum(Integer code, String message) {
        this.code = code;
        this.message = message;
    }
}
