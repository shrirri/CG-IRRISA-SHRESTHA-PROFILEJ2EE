package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import mvc.dataAccessLayer.UserRepository;
import mvc.dataAccessLayer.UsersEntity;


@Service
@Scope("prototype")
public class RegisterBusiness {
	@Autowired
	UserRepository ur;
	
public boolean register(String fname,String lname,String pnum,String email,String dob,String uid, String pwd) {
		System.out.println("in service register");
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ue.setPwd(pwd);
		ue.setFname(fname);
		ue.setLname(lname);
		ue.setPhonenum(pnum);
		ue.setEmail(email);
		ue.setDoB(dob);
		ur.save(ue);
		System.out.println(ue);
		System.out.println("exiting from service register");
		return true;
	}



}
