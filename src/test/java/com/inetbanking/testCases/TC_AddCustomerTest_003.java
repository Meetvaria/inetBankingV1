package com.inetbanking.testCases;

import java.io.IOException;

import org.testng.Assert;
import org.testng.annotations.Test;

import com.inetbanking.pageObjects.AddCustomerPage;
import com.inetbanking.pageObjects.LoginPage;

public class TC_AddCustomerTest_003 extends BaseClass 
{
	
    @Test
	public void addNewCustomer() throws InterruptedException, IOException
	{
		LoginPage lp = new LoginPage(driver);
		lp.setUserName(username);
		logger.info("Username is provided"+ "--->" + username);
		lp.setPassword(password);
		logger.info("Username is provided"+ "--->" + password);
		lp.ClickSubmit();
		
		Thread.sleep(3000);
		
		AddCustomerPage addcust = new AddCustomerPage(driver);
		
		addcust.clickAddNewCustomer();
		
		logger.info("Providing customer details...");
		
		addcust.custName("Meet");
		addcust.custgender("Male");
		addcust.custdob("07", "05", "1992");
		Thread.sleep(5000);
		addcust.custaddress("India");
		addcust.custcity("Vadodara");
		addcust.custstate("Gujarat");
		addcust.custpinno("390019");
		addcust.custtelephoneno("9033707203");
		
		String email=randomestring()+"@gmail.com";
		addcust.custemailid(email);
		addcust.custpassword("abcdef");
		addcust.custsubmit();
		
		Thread.sleep(3000);
		
		logger.info("Validation started...");
		
		boolean res = driver.getPageSource().contains("Customer Registered Successfully!!!");

		if(res==true)
		{
			Assert.assertTrue(true);
			logger.info("Test Case is passed...");
		}
		else
		{
			CaptureScreen(driver,"addNewCustomer");
			Assert.assertTrue(false);
			logger.info("Test Case is failed...");
		}
	}
    
}
