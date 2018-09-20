package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class CommonPage 
{
	@FindBy(linkText="Logout")
	private WebElement logoutLink;
	
	public void logout() 
	{
		logoutLink.click();	
	}

}
