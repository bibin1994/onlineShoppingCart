package org.bibin.dao;

import java.sql.ResultSet;
import java.sql.SQLException;

import org.bibin.bean.Forgot;
import org.bibin.bean.JavaMail;
import org.bibin.bean.Mailmim;
import org.bibin.bean.RestPsw;
import org.bibin.bean.User;
import org.springframework.expression.common.TemplateAwareExpressionParser;
import org.springframework.jdbc.core.JdbcTemplate;
import org.springframework.jdbc.core.RowMapper;

public class UserDao {
	
JdbcTemplate template;
static JavaMail jv=null;
	
public void setTemplate(JdbcTemplate template) {
	this.template = template;
}



	public boolean login(User u)
	{
		String querey="select password from customer_tbl where mailId='"+u.getMailId() +"' ";
		
		
		
		return false;
		
	}
	public static  String send(Forgot u)
	{
	String msg	=jv.sendMail(u.getMailId());
	return msg;
	}
	
	public void pasUpdate(RestPsw res)
	{
		String querey="update customer_tbl set password='"+res.getNewPassword() +"' where mailid='"+ res.getMailId()+"' ";
		template.update(querey);
	}

}






//final User user = new User();
//String querey="select * from customer_tbl where mailId='"+u.getMailId()+"'";
//template.query(querey,new RowMapper<User> (){
//public User mapRow(ResultSet rs, int arg1) throws SQLException {
//
//user.setPhoneno(rs.getInt("phoneno"));
//user.setMailId(rs.getString("mailid"));
//user.setPassword(rs.getString("password"));
//user.setName(rs.getString("name"));
//return user;
//}
//});

