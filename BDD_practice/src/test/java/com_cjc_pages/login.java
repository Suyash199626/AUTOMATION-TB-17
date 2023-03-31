package com_cjc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class login 
{
	WebDriver driver;

	public login(WebDriver driver)
	
	{
		super();
		this.driver = driver;
		
	}
	
	
	@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[2]/table/tbody/tr[2]/td/table/tbody/tr/td[1]/a")
	WebElement clk;
	
	@FindBy(name = "userName")
	WebElement uname;
	
	@FindBy(name = "password")
	WebElement pass;
	
	@FindBy(name="submit")
	WebElement sub;
	
	

}
