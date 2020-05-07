package com.example.demo.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.example.demo.entity.UserInfo;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月6日 下午4:17:36
* 
*/

@Repository
public interface UserRepository extends JpaRepository<UserInfo, Long > {
	public UserInfo findByname(String name);
	public UserInfo save(UserInfo userInfo);
}
