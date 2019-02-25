package com.sell.VO;

import lombok.Data;

/**
 * @Auther: CRJ
 * @Date: 2019-01-25 16:52
 * @Description:
 */
@Data
public class ResultVO<T> {

    /** 错误码 */
    private Integer code;

    /** 提示信息 */
    private String msg;

    /** 具体信息 */
    private T data;
}
