package Pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class LoginPage {
	
	private WebDriver driver;
	
	private By uname=By.name("email");
	private By pass=By.name("password");
	private By login=By.name("login");
	
	public LoginPage(WebDriver driver)
	{
		this.driver =driver;
	}
	
	public void enteruname() {
		driver.findElement(uname).sendKeys("info@cloudlumen.com");
	}
	
	public void enterpass() {
		driver.findElement(pass).sendKeys("12345678");
	
	}
	
	public void clciklogin() {
		
		driver.findElement(login).click();
	}
}
