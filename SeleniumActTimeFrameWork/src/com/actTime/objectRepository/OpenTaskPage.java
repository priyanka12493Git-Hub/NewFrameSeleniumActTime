package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class OpenTaskPage 
{
	@FindBy(linkText="Projects & Customers")
	  private WebElement ProjAndCustLink;
	  
	  public void navigateToProjAndCustomerPage()
	  {
		  ProjAndCustLink.click();
	  }

}
