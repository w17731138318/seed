package com.pasq.modules.custom.dao;

import com.pasq.modules.custom.entity.TestEntity;
import com.pasq.modules.sys.dao.BaseDao;
import org.apache.ibatis.annotations.Mapper;

/**
 * 
 * 
 * @author 王伟鑫
 * @version 0.1v
 * @email wangweixin@pasq.com
 * @create 2017-12-02 15:01:46
 */
@Mapper
public interface TestDao extends BaseDao<TestEntity> {
	
}
