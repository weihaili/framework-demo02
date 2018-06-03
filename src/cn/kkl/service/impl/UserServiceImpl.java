package cn.kkl.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import cn.kkl.dao.UserDao;
import cn.kkl.pojo.User;
import cn.kkl.service.UserService;
@Service
public class UserServiceImpl implements UserService {
	
	@Resource
	private UserDao userDao;

	public UserDao getUserDao() {
		return userDao;
	}

	public void setUserDao(UserDao userDao) {
		this.userDao = userDao;
	}

	@Override
	public void add(String uname) {
		System.out.println("*****UserServiceImpl.add()******"+uname);
		User user = new User();
		if(!uname.isEmpty()) {
			user.setUname(uname);
		}else {
			user.setUname("liweihai"+(int)Math.ceil(Math.random()*1000));
		}
		user.setUpassword("123456");
		user.setGender('M');
		userDao.add(user);
	}

}
