package com.apigee.restapi.ABC.Service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.parsing.EmptyReaderEventListener;
import org.springframework.stereotype.Service;

import com.apigee.restapi.ABC.entity.Employ;

/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月11日 下午4:09:11
* 
*/
public interface EmployService {
	public Employ getEmployById(int id);
	public Employ updateEmployById(int id,String name,String city,int age);
	public void deleteEmployById(int id);
	public Employ addEmploy(int id,String name,String city,int age);
	public List<Employ> getEmploys();

}
