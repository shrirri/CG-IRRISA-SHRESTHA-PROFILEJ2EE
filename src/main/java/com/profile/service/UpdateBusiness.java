package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserRepository;
import mvc.dataAccessLayer.UsersEntity;


@Service
@Scope("prototype")
public class UpdateBusiness {
	@Autowired
	UserRepository ur;
	
	public boolean changepwd(String uid,String pwd) {
		System.out.println("in service to change password");
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ue.setPwd(pwd);
		ur.save(ue);
		//ur.updatePwd(uid,pwd);
		return true;
	}
	
	public boolean changeprofile(String uid,String email,String pnum) {
		System.out.println("in service to update profile");
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		ue.setEmail(email);
		ue.setPhonenum(pnum);
		ur.save(ue);
		//ur.updateProfile(uid,email,pnum);
		return true;
	}
}
