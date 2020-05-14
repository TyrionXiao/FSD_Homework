package com.apigee.restapi.ABC.Service;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.apigee.restapi.ABC.dao.EmployRepository;
import com.apigee.restapi.ABC.entity.Employ;

import antlr.collections.List;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月11日 下午4:48:40
* 
*/
@Service
public class EmployServiceImpl implements EmployService {
	
	@Autowired
	EmployRepository employRepository;

	@Override
	public Employ getEmployById(int id) {
		return employRepository.getById(id);
	}

	@Override
	public Employ updateEmployById(int id, String name, String city, int age) {
		Employ employ=employRepository.getById(id);
		employ.setAge(age);
		employ.setCity(city);
		employ.setName(name);
		employRepository.saveAndFlush(employ);
		return employ;
	}

	@Override
	public void deleteEmployById(int id) {
		// TODO Auto-generated method stub
		employRepository.deleteById(id);
	}

	@Override
	public Employ addEmploy(int id, String name, String city, int age) {
		Employ employ=new Employ(id, name, city, age);
		employRepository.saveAndFlush(employ);
		return employ;
	}
	@Override
	public java.util.List<Employ> getEmploys() {
		
		return employRepository.findAll();
	}

}
