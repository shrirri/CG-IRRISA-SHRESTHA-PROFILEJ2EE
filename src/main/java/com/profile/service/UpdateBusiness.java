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
		int result=ur.checkUidInDB(uid);
		if (result==1) {
			ue.setPwd(pwd);
			ur.updatePwd(uid,pwd);
			System.out.println("password changed");
			return true;
		}
		else {
			System.out.println("uid does not exists");
			return false;
		}
	}
	
	public boolean changeprofile(String uid,String email,String pnum) {
		System.out.println("in service to update profile");
		UsersEntity ue=new UsersEntity();
		ue.setUid(uid);
		int result=ur.checkUidInDB(uid);
		if (result==1) {	
			ue.setEmail(email);
			ue.setPhonenum(pnum);
			ur.updateProfile(uid,email,pnum);
			System.out.println("profile updated");
			return true;
		}
		else {
			System.out.println("uid  does not exists");
			return false;
		}
			
	}
}
