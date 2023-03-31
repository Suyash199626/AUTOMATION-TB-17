package com_cjc_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Registration 
{
	
WebDriver driver;
Properties pro=new Properties();

public Registration(WebDriver driver) {
	super();
	this.driver = driver;
		
}
	
	@FindBy(css="#signin2")
	WebElement regsignlink;

	@FindBy(css="#sign-username")
	WebElement regusername;

	@FindBy(css="#sign-password")
	WebElement regpass;

	@FindBy(css="#signInModal > div > div > div.modal-footer > button.btn.btn-primary")
	WebElement signupbutton;

	public void signlink() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\demoblaze_ddframework\\src\\test\\resources\\abc.propertiese");
		pro.load(fis);
		
		regsignlink.click();
	}

	public void reguser() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\demoblaze_ddframework\\src\\test\\resources\\abc.propertiese");
		pro.load(fis);
		
		regusername.sendKeys(pro.getProperty("username"));
	}

	public void regpass() throws IOException
	{
		FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\demoblaze_ddframework\\src\\test\\resources\\abc.propertiese");
		pro.load(fis);
		
		regpass.sendKeys(pro.getProperty("password"));
	}

	public void signup() throws InterruptedException 
	{
		
		
		signupbutton.click();
		Thread.sleep(1000);
		
		
	
	}

	
	

	

}
