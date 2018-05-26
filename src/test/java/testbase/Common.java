package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import configFile.ImportConfigFile;
import dataSource.ImportData;


public class Common {

	public WebDriver driver;
	public ImportData im;
	public ImportConfigFile impo;
	public String Urladdress;
	public String ChromeDriver;
	public String Excelpath;
	public String browser;
	
	public Common() {
		 impo=new ImportConfigFile("./Config/config.property");
		 
		 Urladdress=impo.getConfigData("url");
		 ChromeDriver=impo.getConfigData("Chromedriver");
		 Excelpath=impo.getConfigData("excel");
		 browser=impo.getConfigData("browser");
		 
		 switch(browser) {
		 case "firefox":
		 driver=new FirefoxDriver();
		 break;
		 case "chrome":
			 System.setProperty("webdriver.chrome.driver",ChromeDriver);
			 driver=new ChromeDriver();
			 break;
			 
		 default :
			 System.out.println("abc");
		 }
		 
		 driver.manage().window().maximize();
		 driver.get(Urladdress);
		 im=new ImportData(Excelpath);
		 
	}
}
