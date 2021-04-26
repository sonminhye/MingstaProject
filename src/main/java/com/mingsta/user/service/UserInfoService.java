package com.mingsta.user.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.mingsta.user.dao.CommonDAO;
import com.mingsta.user.vo.UserInfo;

@Service
public class UserInfoService {
	
	@Autowired
	public CommonDAO commonDao;
	
	public List<UserInfo> selectAllInfo(){
		return (List<UserInfo>) commonDao.selectAll();
	}
	
	public List<UserInfo> selectUserInfo(){
		return (List<UserInfo>) commonDao.selectUserInfo();
	}
	
}
