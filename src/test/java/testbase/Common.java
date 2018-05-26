package testbase;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import configFile.ImportConfigFile;
import dataSource.ImportData;


public class Common {

	public WebDriver driver;
	public ImportData im;
	public ImportConfigFile impo;
	public String Urladdress;
	public String ChromeDriver;
	public String Excelpath;
	
	public Common() {
		 impo=new ImportConfigFile("./Config/config.property");
		 
		 Urladdress=impo.getConfigData("url");
		 ChromeDriver=impo.getConfigData("Chromedriver");
		 Excelpath=impo.getConfigData("excel");
		 System.setProperty("webdriver.chrome.driver",ChromeDriver);
		 driver=new ChromeDriver();
		 driver.manage().window().maximize();
		 driver.get(Urladdress);
		 im=new ImportData(Excelpath);
		 
	}
}
