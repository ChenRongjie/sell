package com.sell.exception;

import com.sell.enums.ResultEnum;

/**
 * @Auther: CRJ
 * @Date: 2019-02-13 22:01
 * @Description:
 */
public class SellException extends RuntimeException{

    private Integer code;

    public SellException(ResultEnum resultEnum){
        super(resultEnum.getMessage());
        this.code = resultEnum.getCode();
    }

    public SellException(Integer code,String message){
        super(message);
        this.code = code;
    }
}
