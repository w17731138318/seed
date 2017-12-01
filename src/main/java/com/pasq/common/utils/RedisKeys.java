package com.pasq.common.utils;

/**
 * Redis所有Keys
 *
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
public class RedisKeys {

    public static String getSysConfigKey(String key){
        return "sys:config:" + key;
    }
}
