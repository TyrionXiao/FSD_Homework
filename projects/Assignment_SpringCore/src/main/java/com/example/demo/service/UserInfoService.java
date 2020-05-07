package com.example.demo.service;

import javax.management.relation.Role;

import com.example.demo.entity.UserInfo;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月6日 下午4:31:32
* 
*/

public interface UserInfoService {
	public UserInfo findByname(String name);
	public UserInfo updateUserInfo(String name,String password,String role);
	public UserInfo insertUserInfo(String name,String password,String mail,String Username);
}
