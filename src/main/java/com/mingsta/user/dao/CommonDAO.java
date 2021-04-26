package com.mingsta.user.dao;

import java.util.List;

import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface CommonDAO {
	public List<?> selectAll();
	public List<?> selectUserInfo();
}
