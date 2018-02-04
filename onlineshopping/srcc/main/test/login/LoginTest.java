package login;
import static org.junit.Assert.assertEquals;

import org.bibin.bean.*;
import org.bibin.dao.*;
import org.junit.Test;

public class LoginTest {
@Test
public void check()
{
	Forgot fo= new Forgot();
	fo.setMailId("bibinmsr");
	assertEquals("bibinmsr",UserDao.send(fo));															
}
}
