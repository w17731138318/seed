package com.pasq.modules.sys.service;

import com.pasq.modules.sys.entity.SysUserEntity;
import com.pasq.modules.sys.entity.SysUserTokenEntity;

import java.util.Set;

/**
 * shiro相关接口
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
public interface ShiroService {
    /**
     * 获取用户权限列表
     */
    Set<String> getUserPermissions(long userId);

    SysUserTokenEntity queryByToken(String token);

    /**
     * 根据用户ID，查询用户
     * @param userId
     */
    SysUserEntity queryUser(Long userId);
}
