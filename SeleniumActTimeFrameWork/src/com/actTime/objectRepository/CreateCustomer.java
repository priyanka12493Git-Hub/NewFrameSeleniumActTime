package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CreateCustomer 
{
	@FindBy(name="name")
	  private WebElement customerNameEdit;
	  
	  @FindBy(name="description")
	  private WebElement customerDescEdit;
	  
	  @FindBy(name="createCustomerSubmit")
	  private WebElement createCustomerBtn;
	  
	  public void createCustomer(String custName)
	  {
		  customerNameEdit.sendKeys(custName);
		  createCustomerBtn.click();
	  }
	  
	  public void createCustomer(String custName, String custDesp)
	  {
		  customerNameEdit.sendKeys(custName);
		  customerNameEdit.sendKeys(custDesp);
		  createCustomerBtn.click();
	  }
}
