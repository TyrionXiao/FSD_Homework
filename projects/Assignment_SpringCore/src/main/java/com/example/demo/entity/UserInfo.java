package com.example.demo.entity;

import javax.management.relation.Role;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.EnumType;
import javax.persistence.Enumerated;
import javax.persistence.Id;
import javax.persistence.Table;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月6日 下午4:06:55
* 
*/
@Entity
@Table(name="T_UserInfo")
public class UserInfo {
	@Id
	@Column(name="id")
	private Integer id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="user_name")
	private String username;
	
    public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	@Column(name = "email")
    private String email;

    @Column(name = "password")
    private String password;

    @Enumerated(EnumType.STRING)
    private String role;
    
    public enum Role{
	    admin,normal
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPasword(String pasword) {
		this.password = password;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role2) {
		this.role = role2;
	}

	public UserInfo(Integer id, String name, String username, String email, String password, String role) {
		super();
		this.id = id;
		this.name = name;
		this.username = username;
		this.email = email;
		this.password = password;
		this.role = role;
	}



}
