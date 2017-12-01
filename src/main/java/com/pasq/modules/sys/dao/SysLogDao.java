package com.pasq.modules.sys.dao;

import com.pasq.modules.sys.entity.SysLogEntity;
import org.apache.ibatis.annotations.Mapper;

/**
 * 系统日志
 * 
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
@Mapper
public interface SysLogDao extends BaseDao<SysLogEntity> {
	
}
