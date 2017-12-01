package com.pasq.modules.oss.dao;

import com.pasq.modules.oss.entity.SysOssEntity;
import com.pasq.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 文件上传
 * 
 * @author wwx
 * @email wangweixin@pasq.com
 */
@Mapper
public interface SysOssDao extends BaseDao<SysOssEntity> {
	
}
