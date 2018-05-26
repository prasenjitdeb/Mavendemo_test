package pageObjectModel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;



public class loginPage {
	
	WebDriver driver;
	By email=By.name("email");
	By password=By.name("pass");
	By Login=By.name("login");
	
	
	
	 public loginPage(WebDriver driver) {
		this.driver=driver;
	}
	
	public void login(String Email,String Password)	{
		driver.findElement(email).sendKeys(Email);
		driver.findElement(password).sendKeys(Password);
		driver.findElement(Login).click();
		
	}
}
