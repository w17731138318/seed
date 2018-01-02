package com.pasq.modules.sys.redis;


import com.pasq.modules.sys.entity.SysConfigEntity;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

/**
 * 系统配置Redis
 *
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
@Component
public class SysConfigRedis {

//    public void saveOrUpdate(SysConfigEntity config) {
//        if(config == null){
//            return ;
//        }
//        String key = RedisKeys.getSysConfigKey(config.getKey());
//        redisUtils.set(key, config);
//    }
//
//    public void delete(String configKey) {
//        String key = RedisKeys.getSysConfigKey(configKey);
//        redisUtils.delete(key);
//    }
//
//    public SysConfigEntity get(String configKey){
//        String key = RedisKeys.getSysConfigKey(configKey);
//        return redisUtils.get(key, SysConfigEntity.class);
//    }
}
