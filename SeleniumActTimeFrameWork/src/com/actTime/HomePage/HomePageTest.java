package com.actTime.HomePage;

import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.actTime.genericLib.BaseClass;

public class HomePageTest extends BaseClass
{
  @Test
  public void verifyHomepageTest()
  {
	  String expData = "TIME-TRACK";
	  String actData = driver.getTitle();
	  
	  Assert.assertEquals(actData, expData); //verify the Homepage
  }
  
  @Test
  public void verifyLogoImageInHomePageTest()
  {
	  boolean imgStatus = driver.findElement(By.xpath("//td[@id='logoContainer']/div[1]/img")).isDisplayed();
	  
	  Assert.assertTrue(imgStatus); //verify the Homepage
  }
	
}
