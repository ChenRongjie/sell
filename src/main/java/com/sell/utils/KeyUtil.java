package com.sell.utils;

import java.util.Random;

/**
 * @Auther: CRJ
 * @Date: 2019-02-14 00:53
 * @Description:
 */
public class KeyUtil {

    /**
     * 生成唯一的主键
     * 格式：时间(毫秒)+随机数
     * @return
     */
    public static  synchronized String genUniqueKey(){

        Random random = new Random();
        Integer number = random.nextInt(900000) + 100000;
        return System.currentTimeMillis()+String.valueOf(number);
    }

}
