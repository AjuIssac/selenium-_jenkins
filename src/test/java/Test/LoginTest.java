package Test;

import org.testng.annotations.Test;

import Base.BaseTest;
import Pages.LoginPage;

public class LoginTest extends BaseTest {
	
	@Test

	public void testValidLogin() {
		
		LoginPage x=new LoginPage(driver);
		
		x.enteruname();
		x.enterpass();
		x.clciklogin(); 
	
	}
	
	
}
