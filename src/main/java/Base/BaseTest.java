package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseTest {
	
	protected WebDriver driver;
	 
	@BeforeMethod
	public void setup() {
		
		driver=new ChromeDriver();
		
		driver.get("https://piettro.cloudmlmdemo.com/auth/login");
	}
	
	 @AfterMethod
	 
	 public void tear() {
		 if(driver!=null) {
			 driver.quit();
		 }
	 }

}
