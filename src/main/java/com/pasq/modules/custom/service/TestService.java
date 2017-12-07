package com.pasq.modules.custom.service;

import com.pasq.modules.custom.entity.TestEntity;

import java.util.List;
import java.util.Map;

/**
 * 
 * 
 * @author 王伟鑫
 * @version 0.1v
 * @email wangweixin@pasq.com
 * @create 2017-12-02 15:01:46
 */
public interface TestService {
	
	TestEntity queryObject(Long id);
	
	List<TestEntity> queryList(Map<String, Object> map);
	
	int queryTotal(Map<String, Object> map);
	
	void save(TestEntity test);
	
	void update(TestEntity test);
	
	void delete(Long id);
	
	void deleteBatch(Long[] ids);
}
