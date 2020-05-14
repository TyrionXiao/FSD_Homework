package com.apigee.restapi.ABC.dao;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.stereotype.Repository;

import com.apigee.restapi.ABC.entity.Employ;
import org.springframework.transaction.annotation.Transactional;


/**
* @author Tyrion Xiao
* @version 创建时间：2020年5月11日 下午4:31:19
* 
*/
@Repository
public interface EmployRepository extends JpaRepository<Employ,Integer> {
	public Employ getById(int id);
	@Modifying
	@Transactional
	public void deleteById(int id);
	public Employ saveAndFlush(Employ employ);

}
