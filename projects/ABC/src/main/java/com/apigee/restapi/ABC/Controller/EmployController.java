package com.apigee.restapi.ABC.Controller;

import java.util.ArrayList;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

import com.apigee.restapi.ABC.Service.EmployService;
import com.apigee.restapi.ABC.entity.Employ;

import antlr.collections.List;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月11日 下午5:00:35
* 
*/
@RestController
@RequestMapping(path = "/service")
public class EmployController {
	@Autowired
	EmployService employService;

	@GetMapping()
	public java.util.List<Employ> getEmploys() {
		return employService.getEmploys();
	}
	
	@GetMapping(path="{id}")
	public Employ getEmployById (@PathVariable int id) {
		return this.employService.getEmployById(id);
	}

	
	@PutMapping(path="{id}")
	public String updateEmployById(@PathVariable int id) throws Exception{
		String name="小明";
		String city="深圳";
		int age=50;
		String msg=null;
		if(this.employService.getEmployById(id)!=null){
			this.employService.updateEmployById(id, name, city, age);
			msg="Put Successful";

		}else {
			msg="id not found: id=" +id;
		}

		return msg;
	}
	@PostMapping()
	public Employ addEmploy(@RequestBody Employ employ) throws Exception{
		int id=employ.getId();
		String name=employ.getName();
		String city=employ.getCity();
		int age=employ.getAge();
		return this.employService.addEmploy(id, name, city, age);
		
	}
	
	@DeleteMapping(path="{id}")
	public void deleteEmployById(@PathVariable int id) throws Exception{
		
		this.employService.deleteEmployById(id);
	}
}
