package com.profile.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;

import mvc.dataAccessLayer.UserRepository;
import mvc.dataAccessLayer.UsersEntity;

@Service
@Scope("prototype")
public class DeleteBusiness {

@Autowired
UserRepository ur;
public boolean delete(String uid) {
		System.out.println("in service delete");
		int result=ur.checkUidInDB(uid);
		if (result==0) {
			System.out.println("uid  "+uid+"  does not exist");
			return false;
		}	
		else {
			ur.deleteById(uid);
			System.out.println("uid---"+uid+"---is deleted");
			return true;
		}
	}
}