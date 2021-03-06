package com.pasq.modules.sys.service;

import java.util.List;



/**
 * 角色与菜单对应关系
 * 
 * @author wwx
 * @email wangweixin@pasq.com
 * @date 2017年11月29日
 */
public interface SysRoleMenuService {
	
	void saveOrUpdate(Long roleId, List<Long> menuIdList);
	
	/**
	 * 根据角色ID，获取菜单ID列表
	 */
	List<Long> queryMenuIdList(Long roleId);
	
}
