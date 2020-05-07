package com.example.demo.util;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.security.crypto.password.PasswordEncoder;

import com.example.demo.entity.UserInfo;
import com.example.demo.service.UserInfoService;




/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月6日 下午4:37:39
* 
*/

public class CustomUserDetailsService implements UserDetailsService{
	
	@Autowired
	private UserInfoService userInfoService;
	@Autowired
	private PasswordEncoder passwordEncoder;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException{
		UserInfo userInfo=userInfoService.findByname(username);
		
		if(userInfo == null) {
			throw new UsernameNotFoundException("username not found");
		}
		List<GrantedAuthority> authorities=(List) new ArrayList<GrantedAuthority>();
		authorities.add(new SimpleGrantedAuthority("ROLE_"+userInfo.getRole()));
		User userdetails=new User(userInfo.getName(),passwordEncoder.encode(userInfo.getPasword()),authorities );
		return userdetails;
	}

}
