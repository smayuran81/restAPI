package com.example.restapi.web.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.ResponseStatus;
import org.springframework.web.bind.annotation.RestController;

import com.example.restapi.persistence.model.Role;
import com.example.restapi.persistence.repository.RoleRepository;

@RestController
@RequestMapping(value="roles")
public class RoleController {
	
	@Autowired
	RoleRepository roleRepository;
	
	@RequestMapping(value ="/findAll",method = RequestMethod.GET)
	public final List<Role> findAllRole(final HttpServletRequest httpServletRequest) {
		
		return (List<Role>) roleRepository.findAll();
		
	}
	
	@RequestMapping(value="/create",method = RequestMethod.GET)
    @ResponseStatus(HttpStatus.CREATED)
	//@RequestBody final Role resource
	public void create() {
		
		System.out.println("Test");
		//roleRepository.save(resource);
	}
	
	 	    
}
