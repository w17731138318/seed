package com.pasq.modules.custom;/**
 * Created by Administrator on 2017/12/1.
 */

/**
 * AA
 *
 * @author 王伟鑫
 * @version 0.1v
 * @create 2017-12-01 11:15
 * @see
 **/
public class AAA {
	private Long id;

	/*
	* 私有构造器
    */
	private AAA() {
	}

	/*
    * 构建新实例
    */
	public static AAA newInstance() {
		return new AAA();
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}
}
