package com.yyl.sms.controller;

import javax.annotation.Resource;
import javax.servlet.http.HttpServletRequest;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import com.yyl.sms.pojo.User;
import com.yyl.sms.service.IUserService;

@Controller
@RequestMapping("/user")
public class UserController {

	@Resource
	private IUserService userService;
	@RequestMapping("/userlist")
	public String toIndex(HttpServletRequest request, Model model) {
		
		String str = request.getParameter("id");
		int userId = Integer.valueOf(str);
		
		User user = this.userService.getUserById(userId);
		model.addAttribute("user", user);
		return "userlist";
	}
	
}
