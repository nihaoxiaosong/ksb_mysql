package com.hx.dao.impl.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;
import org.springframework.util.StringUtils;

import com.hx.dao.base.BaseDao;
import com.hx.dao.system.RoleDao;
import com.hx.model.common.PageParam;
import com.hx.model.system.Role;

@Repository("roleDao")
public class RoleDaoImpl extends BaseDao implements RoleDao {

	@Override
	public void insert(Role role) {
		StringBuffer sql = new StringBuffer();
		sql.append("insert into role(id,code,name,enable) values(?,?,?,?)");
		jdbcTemplate.update(sql.toString(), new Object[] { role.getId(), role.getClass(), role.getName(), role.getEnable() });
	}

	@Override
	public List<Role> findByKeyWord(String keyWord, PageParam pageParam) {
		StringBuffer sql = new StringBuffer();
		sql.append("select id,code,name,enable from role where enable = 1 ");
		if (!StringUtils.isEmpty(keyWord)) {
			sql.append(" and name like '%" + keyWord + "%' ");
		}
		if(pageParam!=null){
			sql.append(" limit "+pageParam.getStartIndex()+","+pageParam.getPageSize());
		}
		final List<Role> list = new ArrayList<Role>();
		jdbcTemplate.query(sql.toString(), new Object[] {}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Role role = new Role();
				role.setId(rs.getString("id"));
				role.setCode(rs.getString("code"));
				role.setName(rs.getString("name"));
				role.setEnable(rs.getInt("enable"));
				list.add(role);
			}
		});
		return list;
	}

	@Override
	public int count(String keyWord) {
		StringBuffer sql = new StringBuffer();
		sql.append("select count(1) from role where enable = 1 ");
		if (!StringUtils.isEmpty(keyWord)) {
			sql.append(" and name like '%" + keyWord + "%' ");
		}
		return jdbcTemplate.queryForObject(sql.toString(), Integer.class);
	}

}
