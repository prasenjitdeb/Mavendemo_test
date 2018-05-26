package mainProgram;




import org.testng.Assert;
import org.testng.annotations.Test;

import pageObjectModel.loginPage;
import testbase.Common;



public class NewTest extends Common {
	
	
	String Email;
	String Password;
	loginPage log;
	
	

@Test
	
  public void f() throws Exception  {
	  
	Email=im.getData(0,1,0);
	Password=im.getData(0,1,1);
	  
	log =new loginPage(driver);
	log.login(Email,Password);
	  
	Thread.sleep(20000);

	String newurl=driver.getCurrentUrl();
	Assert.assertEquals(newurl, "https://www.facebook.com/");
	   	  
  }
}




 