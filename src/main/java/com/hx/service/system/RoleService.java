package com.hx.service.system;

import com.hx.model.common.PageParam;
import com.hx.model.common.Pager;
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
	 * @param keyWord
	 * @param pageParam
	 * @return
	 */
	public Pager<Role> findByKeyWord(String keyWord, PageParam pageParam);
}
