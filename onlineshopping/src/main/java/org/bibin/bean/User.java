package org.bibin.bean;

public class User {
	
	String name;
	String mailId;
	String password;
	Number phoneno;
	public String getName() {
		return name;
	}
	public String getMailId() {
		return mailId;
	}
	public String getPassword() {
		return password;
	}
	public Number getPhoneno() {
		return phoneno;
	}
	public void setName(String name) {
		this.name = name;
	}
	public void setMailId(String mailId) {
		this.mailId = mailId;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public void setPhoneno(Number phoneno) {
		this.phoneno = phoneno;
	}

}
