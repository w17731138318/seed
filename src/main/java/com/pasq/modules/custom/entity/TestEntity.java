package com.pasq.modules.custom.entity;

import com.pasq.common.utils.ToStringUtils;

import java.io.Serializable;


/**
 * 
 * @author 王伟鑫
 * @version 0.1v
 * @email wangweixin@pasq.com
 * @create 2017-12-02 15:01:46
 */
public class TestEntity implements Serializable {
	private static final long serialVersionUID = 1L;
	
	//ID
	private Long id;
	//姓名
	private String name;
	//年龄
	private Integer age;
	/*
     * 私有构造器
     */
	private TestEntity() {
	}

	/*
    * 构建新实例
    */
	public static TestEntity newInstance() {
		return new TestEntity();
	}
	/**
	 * 设置：ID
	 */
	public void setId(Long id) {
		this.id = id;
	}
	/**
	 * 获取：ID
	 */
	public Long getId() {
		return id;
	}
	/**
	 * 设置：姓名
	 */
	public void setName(String name) {
		this.name = name;
	}
	/**
	 * 获取：姓名
	 */
	public String getName() {
		return name;
	}
	/**
	 * 设置：年龄
	 */
	public void setAge(Integer age) {
		this.age = age;
	}
	/**
	 * 获取：年龄
	 */
	public Integer getAge() {
		return age;
	}
	@Override
	public String toString() {
		return ToStringUtils.toSimpleString(this);
	}
}
