package com.pasq.datasources;

import com.pasq.datasources.annotation.DataSource;
import com.pasq.modules.api.entity.UserEntity;
import com.pasq.modules.api.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * 测试
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
@Service
public class DataSourceTestService {
    @Autowired
    private UserService userService;

    public UserEntity queryObject(Long userId){
        return userService.queryObject(userId);
    }

    @DataSource(name = DataSourceNames.SECOND)
    public UserEntity queryObject2(Long userId){
        return userService.queryObject(userId);
    }
}
