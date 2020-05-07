package com.example.demo.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.kafka.KafkaProperties.Admin;
import org.springframework.stereotype.Service;

import com.example.demo.dao.UserRepository;
import com.example.demo.entity.UserInfo;
import com.example.demo.entity.UserInfo.Role;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月6日 下午4:32:57
* 
*/
@Service
public class UserInfoServiceImpl implements UserInfoService {

	@Autowired
	private  UserRepository userRepository;

	@Override
	public UserInfo findByname(String name) {
		return userRepository.findByname(name);
	}
	
	@Override
	public UserInfo updateUserInfo(String name,String password,String role) {
		
		UserInfo userInfo=userRepository.findByname(name);
		userInfo.setPasword(password);
		userInfo.setRole(role);
		userRepository.save(userInfo);
		
		return userInfo;
	}

	@Override
	public UserInfo insertUserInfo(String name, String password, String mail, String Username) {
		UserInfo userInfo=userRepository.findByname(name);
		userInfo.setPasword(password);
		userInfo.setEmail(mail);
		userInfo.setName(name);
		userInfo.setRole(null);
		userRepository.save(userInfo);
		return userInfo;
	}

}
