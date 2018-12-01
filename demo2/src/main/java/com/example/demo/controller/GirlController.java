package com.example.demo.controller;

import java.util.List;

import javax.persistence.EntityManager;
import javax.persistence.EntityManagerFactory;
import javax.persistence.Persistence;
import javax.persistence.Query;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GirlController {
	@Autowired
	private GirlRepository girlRepository;
	
	@GetMapping(value = "/girls")
	public List<Girl> girlList(){
		
		
		return girlRepository.findAll();
		
	}
	
	@GetMapping(value = "/girls3")
	public List<Girl> girlList3(){
		Girl girl = new Girl();
		girl.setAge(5);
		Example<Girl> example = Example.of(girl);
		
		return girlRepository.findAll(example);
		
	}
	
	@GetMapping(value = "/girls2")
	public String girlList2(){
		return "sky test";
		
	}
	
	@GetMapping(value = "/girls4")
	public List<Girl> girlList4(){
		EntityManagerFactory emf = Persistence.createEntityManagerFactory("myJPA");
		EntityManager em = emf.createEntityManager();
        //定义SQL
        String sql = "SELECT * FROM girl";
        //创建原生SQL查询QUERY实例,指定了返回的实体类型
        Query query =  em.createNativeQuery(sql,Girl.class);
        //执行查询，返回的是实体列表,
        List<Girl> userList = query.getResultList();
         
        em.close();
		
		return userList;
		
	}
	
	@GetMapping(value = "/girls5")
	public List<Girl> girlList5(){
		
		return girlRepository.findByAgeLarge(4);
		
	}


}
