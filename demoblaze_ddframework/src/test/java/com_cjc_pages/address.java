package com_cjc_pages;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

import com_cjc_utility.Commons;

public class address
{
	WebDriver driver;

	public address(WebDriver driver)
	{
		super();
		this.driver = driver;
	}
	
	@FindBy(css="#name")
	WebElement name;

	@FindBy(css="#country")
	WebElement cntry;

	@FindBy(xpath="//*[@id=\"city\"]")
	WebElement cty ;

	@FindBy(xpath="//*[@id=\"card\"]")
	WebElement cc ;

	@FindBy(xpath ="//*[@id=\"month\"]")
	WebElement month ;

	@FindBy(xpath = "//*[@id=\"year\"]")
	WebElement yr ;

	@FindBy(css="#orderModal > div > div > div.modal-footer > button.btn.btn-primary")
	WebElement clickonpurchase;


	@FindBy(xpath ="//*[@id=\"orderModal\"]/div/div/div[3]/button[2]")
	WebElement clickokbutton;


	public void name() throws IOException
	{
		String a=Commons.name();
		System.out.println(a);
		
	       name.sendKeys(a);

	}

	public void country() throws IOException
	{
		String b=Commons.country();
		System.out.println(b);
		
	      cntry.sendKeys(b);

	}

	public void city() throws IOException
	{
		String c=Commons.city();
		System.out.println(c);
		
	       cty.sendKeys(c);

	}

	
	public void creditcard() throws IOException
	{
		String e=Commons.creditcard();
		System.out.println(e);
		
	     cc.sendKeys(e);

	}
	public void month() throws IOException
	{
		String d=Commons.month();
		System.out.println(d);
		
		
	       month.sendKeys(d);

	}


	public void year() throws IOException
	{
		String f=Commons.year();
		System.out.println(f);
		
		
	        yr.sendKeys(f);

	}

	public void clickpurchase()
	{
		
	    clickonpurchase.click();

	}


	public void okbutton()
	{
		
	    clickokbutton.click();

	}




	
	
	
	

}
