package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class ActiveProjectAndCustomerPage 
{
	@FindBy(xpath = "//input[@value='Create New Customer']")
	  private WebElement createCustomerBtn;
	   
	  public void navigateToCustomerPage() throws Throwable
	  {
		  Thread.sleep(2000);
		  createCustomerBtn.click();
	  }

}
