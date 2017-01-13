package com.yyl.sms.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import com.yyl.sms.dao.IUserDao;
import com.yyl.sms.pojo.User;
import com.yyl.sms.service.IUserService;

@Service("userService")
public class UserServiceImpl implements IUserService {

	@Resource
	private IUserDao userDao;

	public User getUserById(int userId) {
		return this.userDao.getUserById(userId);
	}
 
}
