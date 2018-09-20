package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class HomePage 
{
	@FindBy(xpath = "//div[text()='Tasks']/..")
	  private WebElement taskImg;
	  
	  @FindBy(xpath = "//div[text()='Users']/..")
	  private WebElement userImg;
	  
	  @FindBy(xpath = "//div[text()='Reports']/..")
	  private WebElement reportImg;
	  
	  public void navigateToTaskPage()
	  {
		  taskImg.click();  
	  }
	  public void navigateToUserPage()
	  {
		  userImg.click();  
	  }
	  public void navigateToReportsPage()
	  {
		  reportImg.click();  
	  }
}
