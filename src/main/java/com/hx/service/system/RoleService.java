package com.hx.service.system;

import java.util.List;

import com.hx.model.system.Role;

public interface RoleService {
	/**
	 * 新增
	 * 
	 * @param role
	 */
	public void insert(Role role);

	/**
	 * 根据关键字查询
	 * 
	 * @param keyWord
	 * @return
	 */
	public List<Role> findByKeyWord(String keyWord);
}
