package com.pasq.modules.custom.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Map;

import com.pasq.modules.custom.dao.TestDao;
import com.pasq.modules.custom.entity.TestEntity;
import com.pasq.modules.custom.service.TestService;



@Service("testService")
public class TestServiceImpl implements TestService {
	@Autowired
	private TestDao testDao;
	
	@Override
	public TestEntity queryObject(Long id){
		return testDao.queryObject(id);
	}
	
	@Override
	public List<TestEntity> queryList(Map<String, Object> map){
		return testDao.queryList(map);
	}
	
	@Override
	public int queryTotal(Map<String, Object> map){
		return testDao.queryTotal(map);
	}
	
	@Override
	public void save(TestEntity test){
		testDao.save(test);
	}
	
	@Override
	public void update(TestEntity test){
		testDao.update(test);
	}
	
	@Override
	public void delete(Long id){
		testDao.delete(id);
	}
	
	@Override
	public void deleteBatch(Long[] ids){
		testDao.deleteBatch(ids);
	}
	
}
