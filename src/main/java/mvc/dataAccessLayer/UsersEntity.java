package mvc.dataAccessLayer;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="users")
public class UsersEntity {

	@Id
	@Column(name="userid")
	String Uid;
	@Column(name="password")
	String Pwd;	
	@Column(name="firstname")
	String Fname;
	@Column(name="lastname")
	String Lname;
	@Column(name="phone")
	String Phonenum;
	@Column(name="emailid")
	String Email;
	@Column(name="dob")
	String DoB;

	public String getUid() {
		return Uid;
	}
	public void setUid(String uid) {
		this.Uid = uid;
	}
	public String getPwd() {
		return Pwd;
	}
	public void setPwd(String pwd) {
		this.Pwd = pwd;
	}
	public String getFname() {
		return Fname;
	}
	public void setFname(String fname) {
		this.Fname = fname;
	}
	public String getLname() {
		return Lname;
	}
	public void setLname(String lname) {
		this.Lname = lname;
	}
	public String getPhonenum() {
		return Phonenum;
	}
	public void setPhonenum(String pnum) {
		this.Phonenum = pnum;
	}
	public String getEmail() {
		return Email;
	}
	public void setEmail(String email) {
		this.Email = email;
	}
	public String getDoB() {
		return DoB;
	}
	public void setDoB(String dob) {
		this.DoB = dob;
	}
	
}
