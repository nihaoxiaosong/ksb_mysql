package com.hx.dao.base;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.namedparam.NamedParameterJdbcTemplate;

/**
 * jdbcTemplate
 * @author song
 * @date 2016年6月22日下午8:26:25
 */
public class BaseDao {
	/**
	 * the jdbcTemplate
	 */
	@Autowired(required = false)
	@Qualifier("jdbcTemplate")
	protected JdbcTemplate jdbcTemplate;

	/**
	 * namedParameterJdbcTemplate 带name参数的jdbcTemplate
	 */
	@Autowired(required = false)
	@Qualifier("namedParameterJdbcTemplate")
	protected NamedParameterJdbcTemplate namedParameterJdbcTemplate;
}
