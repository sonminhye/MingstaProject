package com.mingsta.user.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mingsta.user.service.UserInfoService;
import com.mingsta.user.vo.UserInfo;

@RestController
public class UserInfoController {

	@Autowired
	public UserInfoService userInfoService;
	
	@GetMapping(value="/login")
	public List<UserInfo> selectUserInfo(){
		return userInfoService.selectUserInfo();
	}
	
	@GetMapping(value="/another")
	public String selectUserInfoDetail() {
		return "디테일";
	}
}
