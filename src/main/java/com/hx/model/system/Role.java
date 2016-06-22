package com.hx.model.system;
/**
 * 角色表
 * @author song
 * @date 2016年6月22日下午8:58:37
 */
public class Role {
	/**
	 * id主键
	 */
	private String id;
	/**
	 * 代码
	 */
	private String code;
	/**
	 * 名称
	 */
	private String name;
	/**
	 * 是否启用
	 * 0不启用
	 * 1启用
	 */
	private int enable;
	public String getId() {
		return id;
	}
	public void setId(String id) {
		this.id = id;
	}
	public String getCode() {
		return code;
	}
	public void setCode(String code) {
		this.code = code;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getEnable() {
		return enable;
	}
	public void setEnable(int enable) {
		this.enable = enable;
	}
	
}
