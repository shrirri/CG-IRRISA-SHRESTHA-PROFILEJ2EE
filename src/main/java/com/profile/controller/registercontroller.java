package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.profile.service.RegisterBusiness;


@Controller
@Scope("prototype")
public class registercontroller {
	@Autowired
	RegisterBusiness rb;
	
	
	@GetMapping({"/register"})
	public String reg(@RequestParam String fname,@RequestParam String lname,@RequestParam String pnum,@RequestParam String email,@RequestParam String dob,@RequestParam String uid,@RequestParam String pwd) {
		System.out.println("in controller");
		System.out.println(fname+lname+pnum+email+dob+uid+pwd);
		boolean res=rb.register(fname,lname,pnum,email,dob,uid, pwd);
		System.out.println("back in controller");
		if(res==true)
			return "registersuccess";
		else
			return "failure";
		
		}
	
}

//fname,lname,pnum,email,dob,uid,pwd
