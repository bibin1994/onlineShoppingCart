package org.bibin.bean;

public class RestPsw {
	
private	String mailId;
private String newPassword;
private String conformPswd;
private String otp;
public String getOtp() {
	return otp;
}
public void setOtp(String otp) {
	this.otp = otp;
}
public String getMailId() {
	return mailId;
}
public String getNewPassword() {
	return newPassword;
}
public String getConformPswd() {
	return conformPswd;
}
public void setMailId(String mailId) {
	this.mailId = mailId;
}
public void setNewPassword(String newPassword) {
	this.newPassword = newPassword;
}
public void setConformPswd(String conformPswd) {
	this.conformPswd = conformPswd;
}
	

}
