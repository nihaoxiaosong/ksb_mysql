package com.hx.dao.system;

import java.util.List;

import com.hx.model.common.PageParam;
import com.hx.model.system.Role;

public interface RoleDao {
	/**
	 * 新增
	 * @param role
	 */
	public void insert(Role role);
	/**
	 * 根据关键字查询
	 * @param keyWord
	 * @return
	 */
	public List<Role> findByKeyWord(String keyWord, PageParam pageParam);
	/**
	 * 计数
	 * @param keyWord
	 * @return
	 */
	public int count(String keyWord);
}
