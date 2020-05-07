package com.example.demo.controller;

import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.swing.JOptionPane;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.service.UserInfoService;
import com.sun.java.swing.plaf.windows.resources.windows;
import com.sun.org.apache.bcel.internal.generic.RETURN;

@RestController
public class RegisterController {
	@Autowired
	private UserInfoService userInfoService;
	@GetMapping("/registration")
	public String login(HttpServletRequest request, HttpServletResponse response) {
		String username = request.getParameter("Username");
        String Password = request.getParameter("Password");
        String mail=request.getParameter("mail");
        String name=request.getParameter("name");
        String meg=new String();
                
        try {
        	if(userInfoService.findByname(username)!=null) {
        		JOptionPane.showMessageDialog(null, "username Already Exist", "Title",JOptionPane.ERROR_MESSAGE);
        		meg="registration";
        	}else  {
        		userInfoService.insertUserInfo(name, Password, mail, username);
				meg="login";
			}
		} catch (Exception e) {
			
			e.printStackTrace();
		}
	}
		
	return meg;
 
}
