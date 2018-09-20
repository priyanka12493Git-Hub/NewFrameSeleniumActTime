package com.actTime.genericLib;

import java.util.Properties;
import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.AfterClass;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterSuite;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.BeforeSuite;
import com.actTime.objectRepository.CommonPage;
import com.actTime.objectRepository.LoginPage;

public abstract class BaseClass 
{
	public static WebDriver driver;
	FileUtils fLib = new FileUtils();
	
	@BeforeSuite
	public void configBS()
	{
		System.out.println("Connect to Database");
	}
	@BeforeClass
	public void configBC() throws Throwable
	{
		System.out.println("Launch the Browser");
		Properties pObj = fLib.getPropertyFileObject();
		String BROWSER = pObj.getProperty("browser");
		if(BROWSER.equals("firefox"))
		  {
			driver = new FirefoxDriver();
		}else if(BROWSER.equals("chrome"))
		  {
			System.setProperty("webdriver.chrome.driver", "./Resource/chromedriver.exe");
			driver = new ChromeDriver();
		}else if(BROWSER.equals("ie"))
		  {
			System.setProperty("webdriver.ie.driver", "./Resource/IEDriverServer.exe");
			driver = new InternetExplorerDriver();
		  }
		driver.manage().timeouts().implicitlyWait(2, TimeUnit.MINUTES);
	}
	@BeforeMethod
	   public void confiqBM() throws Throwable
	   {
		   Properties pObj = fLib.getPropertyFileObject();
		   String USERNAME =pObj.getProperty("username");
		   String PASSWORD =pObj.getProperty("password");
		   String URL =pObj.getProperty("url");
           System.out.println("login");
           driver.get(URL);
    	   driver.manage().window().maximize();
           LoginPage lp = PageFactory.initElements(driver, LoginPage.class);
           lp.loginToApp(USERNAME,PASSWORD);
	   }
	   
	@AfterMethod
	    public void confiqAM()
	   {
		CommonPage cp = PageFactory.initElements(driver, CommonPage.class);
		cp.logout();
	   }
	  
    @AfterClass
	  public void confiqAC()
	  {
		  System.out.println("-----Close the browser-----");
		  driver.close();
	  }
	  
	@AfterSuite
	   public void confiqAS()
	   {
		  System.out.println("Disconnect to Database");
	   }

}
