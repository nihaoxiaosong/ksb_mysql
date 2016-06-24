package com.hx.dao.impl.system;

import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import org.springframework.jdbc.core.RowCallbackHandler;
import org.springframework.stereotype.Repository;

import com.hx.dao.base.BaseDao;
import com.hx.dao.system.ModuleDao;
import com.hx.model.system.Module;

@Repository("moduleDao")
public class ModuleDaoImpl extends BaseDao implements ModuleDao {

	@Override
	public List<Module> findByParentCode(String parentCode) {
		StringBuffer sql = new StringBuffer();
		sql.append("select id,code,name,url,parent_code,seq from module where parent_code = '"+parentCode+"' order by seq ");
		final List<Module> list = new ArrayList<Module>();
		jdbcTemplate.query(sql.toString(), new Object[] {}, new RowCallbackHandler() {
			@Override
			public void processRow(ResultSet rs) throws SQLException {
				Module module = new Module();
				module.setId(rs.getString("id"));
				module.setCode(rs.getString("code"));
				module.setName(rs.getString("name"));
				module.setUrl(rs.getString("url"));
				module.setParentCode(rs.getString("parent_code"));
				module.setSeq(rs.getInt("seq"));
				list.add(module);
			}
		});
		return list;
	}

	@Override
	public void deleteById(String id) {
		StringBuffer sql = new StringBuffer();
		sql.append("delete from module where id=?");
		jdbcTemplate.update(sql.toString(), new Object[]{id});
	}

}
