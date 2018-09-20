package com.actTime.objectRepository;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class LoginPage 
{
	@FindBy(name="username")
	  private WebElement usernameEdit;
	  
	  @FindBy(name="pwd")
	  private WebElement passwordEdit;
	  
	  @FindBy(id="loginButton")
	  private WebElement loginBtn;
	  
	  @FindBy(xpath = "//span[contains(text(),'invalid')]")
	  private WebElement errorMsg;
	  
	   //getters(only for read access)  Rule:5

	   public WebElement getUsernameEdit() 
	   {
		  return usernameEdit;
	   }

	   public WebElement getPasswordEdit() {
		return passwordEdit;
	   }

	   public WebElement getLoginBtn() {
		return loginBtn;
	   }

	   public WebElement getErrorMsg() {
		return errorMsg;
	   }
	  //Re usable business Methods for Utilization  Rule:3
	   public void loginToApp()
	   {
		   usernameEdit.sendKeys("admin");
		   passwordEdit.sendKeys("manager");
		   loginBtn.click();
	   }
	   
	   public void loginToApp(String username, String password)
	   {
		   usernameEdit.sendKeys(username);
		   passwordEdit.sendKeys(password);
		   loginBtn.click();
	   }

}
