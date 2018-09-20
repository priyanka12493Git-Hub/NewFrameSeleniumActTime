package com.actTime.genericLib;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class WebDriverCommonLib
{
	public void waitForPageToLoad() 
	{
		BaseClass.driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}
    public void alertHandle()
    {
    	BaseClass.driver.switchTo().alert().accept();
    }
    public void alertCancel()
    {
    	BaseClass.driver.switchTo().alert().dismiss();
    }
    public void select(WebElement swb, String option)
    {
    	Select sel = new Select(swb);
    	sel.selectByVisibleText(option);
    }
}
