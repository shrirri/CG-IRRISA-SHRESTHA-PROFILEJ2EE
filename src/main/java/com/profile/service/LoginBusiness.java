package com.profile.service;



import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserRepository;
import mvc.dataAccessLayer.UsersEntity;

@Service
@Scope("prototype")
public class LoginBusiness {
@Autowired
UserRepository ur;
	
public boolean checkuidpwd(String uid, String pwd) {
		System.out.println("in service checking uid pwd");
			int res=ur.checkUidPwdInDB(uid, pwd);
			if(res==0) {
				System.out.println("login fail");
				return false;
			}
			else {
				System.out.println("login success");
				return true;
			}
		}

}
