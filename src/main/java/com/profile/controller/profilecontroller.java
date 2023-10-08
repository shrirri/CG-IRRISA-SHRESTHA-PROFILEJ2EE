package com.profile.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.profile.service.DeleteBusiness;
import com.profile.service.LoginBusiness;
import com.profile.service.RegisterBusiness;
import com.profile.service.UpdateBusiness;

@Controller
@Scope("prototype")
public class profilecontroller {
	@Autowired
	RegisterBusiness rb;

	@GetMapping({"/register"})
	public String reg(@RequestParam String fname,@RequestParam String lname,@RequestParam String pnum,@RequestParam String email,@RequestParam String dob,@RequestParam String uid,@RequestParam String pwd) {
		System.out.println("in controller to register");
		System.out.println(fname+lname+pnum+email+dob+uid+pwd);
		boolean res=rb.register(fname,lname,pnum,email,dob,uid, pwd);
		if(res==true)
			return "registersuccess";
		else
			return "registererror";
		
		}
	
	@Autowired
	LoginBusiness lb;
		@GetMapping({"/auth"})
		public String reg(@RequestParam String uid,@RequestParam String pwd) {
			System.out.println("in login controller");
			System.out.println(uid+pwd);
			boolean res=lb.checkuidpwd(uid, pwd);
			if(res==true)
				return "loginsuccess";
			else
				return "failure";
		}
			
		
		@Autowired
		UpdateBusiness ub;
			@GetMapping({"/changepassword"})
			public String changepw(@RequestParam String uid,@RequestParam String pwd) {
				System.out.println("in controller to change password");
				System.out.println("userid="+uid+" AND new password="+pwd);
				boolean res=ub.changepwd(uid, pwd);
				if(res==true)
					return "pwsuccess";
				else
					return "failure";
			}
			
			@GetMapping({"/updateprofile"})
			public String changepw(@RequestParam String uid,@RequestParam String email,@RequestParam String pnum) {
				System.out.println("in controller to change password");
				System.out.println("new email="+email+" AND new phone="+pnum);
				boolean res=ub.changeprofile(uid,email,pnum);
				if(res==true)
					return "pwsuccess";
				else
					return "failure";
			}
			
			@Autowired
			DeleteBusiness db;
			@RequestMapping("/del")
			public String del(@RequestParam String uid) {
				System.out.println("in controller to delete user");
				boolean res=db.delete(uid);
				if(res==true)
					return "delsuccess";
				else
					return "nouserid";
			}
}


