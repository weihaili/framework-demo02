package cn.kkl.action;


import javax.annotation.Resource;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;

import cn.kkl.pojo.User;
import cn.kkl.service.UserService;

@RequestMapping(value="/user.do")
@Component
public class UserController{
	
	@Resource
	private UserService userService;

	public UserService getUserService() {
		return userService;
	}

	public void setUserService(UserService userService) {
		this.userService = userService;
	}
	
	@RequestMapping(params="method=reg")
	public String register(User user) {
		System.out.println("*****UserController.register()*******"+user.getUname());
		userService.add(user.getUname());
		return "success";
	}


}
