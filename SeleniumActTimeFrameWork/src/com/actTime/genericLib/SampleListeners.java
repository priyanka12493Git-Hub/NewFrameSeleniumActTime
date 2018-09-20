package com.actTime.genericLib;

import java.io.File;
import java.io.IOException;
import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.ITestContext;
import org.testng.ITestListener;
import org.testng.ITestResult;

public class SampleListeners implements ITestListener
{
	@Override
	public void onTestFailure(ITestResult result) 
	{
		String tName = result.getMethod().getMethodName();
		EventFiringWebDriver edriver = new EventFiringWebDriver(BaseClass.driver);
		File srcFile = edriver.getScreenshotAs(OutputType.FILE);
		File dstFile = new File("./Screenshot/" +tName+ ".png");
		try
		{
			FileUtils.copyFile(srcFile, dstFile);
		}
		catch(IOException e)
		{
			
		}	
	}
	@Override
	public void onFinish(ITestContext arg0) {

	}

	@Override
	public void onStart(ITestContext arg0) {
	
	}

	@Override
	public void onTestFailedButWithinSuccessPercentage(ITestResult arg0) {
		
	}

	@Override
	public void onTestSkipped(ITestResult arg0) {
	
	}

	@Override
	public void onTestStart(ITestResult arg0) {
		
	}

	@Override
	public void onTestSuccess(ITestResult arg0) {
	
	}


}
