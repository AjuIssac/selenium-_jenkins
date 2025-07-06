package Base;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.BeforeMethod;

public class BaseClass {

	WebDriver driver;
	@BeforeMethod
	
	public void setup() {
		//WebDriverManager.chromedriver().setup();
		driver=new ChromeDriver();
		driver.get("https://www.google.com/");
	}
	
	@AfterMethod
	
	public void teardown() {
		
		driver.close();
	
		
	}
}
