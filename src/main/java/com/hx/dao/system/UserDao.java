package com.hx.dao.system;

import java.util.List;

import com.hx.model.system.User;

public interface UserDao {
	public void insert(User user);
	public List<User> findByKeyWord(String keyWord);
	
}
