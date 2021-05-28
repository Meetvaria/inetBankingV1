package com.inetbanking.pageObjects;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.CacheLookup;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

public class AddCustomerPage {

WebDriver ldriver;
	
	public AddCustomerPage(WebDriver rdriver)
	{
		ldriver = rdriver;
		PageFactory.initElements(rdriver, this);
	}
	@FindBy(how = How.XPATH, using="//a[contains(text(),'New Customer')]")
	@CacheLookup
	WebElement lnkAddNewCustomer;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[4]/td[2]/input[1]")
	@CacheLookup
	WebElement txtCustomerName;
	
	@FindBy(how = How.NAME, using="rad1")
	@CacheLookup
	WebElement rdGender;
	
	@FindBy(how = How.XPATH, using="//input[@id='dob']")
	@CacheLookup
	WebElement txtdob;
	
	@FindBy(how = How.XPATH, using="//textarea[@rows='5']")
	@CacheLookup
	WebElement txtaddress;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[8]/td[2]/input[1]")
	@CacheLookup
	WebElement txtcity;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[9]/td[2]/input[1]")
	@CacheLookup
	WebElement txtstate;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[10]/td[2]/input[1]")
	@CacheLookup
	WebElement txtpinno;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[11]/td[2]/input[1]")
	@CacheLookup
	WebElement txttelephoneno;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[12]/td[2]/input[1]")
	@CacheLookup
	WebElement txtemailid;
	
	@FindBy(how = How.XPATH, using="//tbody/tr[13]/td[2]/input[1]")
	@CacheLookup
	WebElement txtpassword;
	
	@FindBy(how = How.XPATH, using="//input[@type='submit']")
	@CacheLookup
	WebElement btnSubmit;
		
	public void clickAddNewCustomer() {
		lnkAddNewCustomer.click();
			
	}

	public void custName(String cname) {
		txtCustomerName.sendKeys(cname);
		
	}

	public void custgender(String cgender) {
		rdGender.click();
	}

	public void custdob(String mm,String dd,String yy) {
		txtdob.sendKeys(mm);
		txtdob.sendKeys(dd);
		txtdob.sendKeys(yy);
		
	}

	public void custaddress(String caddress)
	{
		txtaddress.sendKeys(caddress);
	}

	public void custcity(String ccity)
	{
		txtcity.sendKeys(ccity);
	}

	public void custstate(String cstate)
	{
		txtstate.sendKeys(cstate);
	}

	public void custpinno(String cpinno)
	{
		txtpinno.sendKeys(String.valueOf(cpinno));
	}

	public void custtelephoneno(String ctelephoneno)
	{
		txttelephoneno.sendKeys(ctelephoneno);
	}

	public void custemailid(String cemailid) 
	{
		txtemailid.sendKeys(cemailid);
	}

	public void custpassword(String cpassword) 
	{
		txtpassword.sendKeys(cpassword);
	}

	public void custsubmit() {
		btnSubmit.click();
	}
}
