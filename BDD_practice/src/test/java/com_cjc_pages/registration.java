package com_cjc_pages;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class registration 
{
	WebDriver driver;
public registration(WebDriver driver)
{
		super();
		this.driver = driver;
	}
Properties pro=new Properties();


@FindBy(name = "firstName")
WebElement nm;

@FindBy(name = "lastName")
WebElement lnm;

@FindBy(name = "phone")
WebElement ph;

@FindBy(id = "userName")
WebElement uname;

@FindBy(name = "address1")
WebElement add;

@FindBy(name = "city")
WebElement cty;

@FindBy(name = "state")
WebElement state;

@FindBy(name = "postalCode")
WebElement pcode;

@FindBy(name = "country")
WebElement cntry;

@FindBy(name="email")
WebElement email;

@FindBy(name = "password")
WebDriver pass;

@FindBy(name = "confirmPassword")
WebElement cpass;

@FindBy(name="submit")
WebElement sub;


public void fname() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
 nm.sendKeys(pro.getProperty("firstname"));
}



public void lname() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("lastname"));

}

public void phone() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("phone"));

}

public void email() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("email"));

}

public void address() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("Address"));

}

public void city() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("city"));

}

public void state() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("state"));

}

public void postalcode() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("postalcode"));

}

public void country() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("country"));

}

public void uname() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("username"));

}

public void pass() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("password"));

}

public void conpass() throws IOException
{
	FileInputStream fis=new FileInputStream("C:\\Users\\suyas\\Testing_workspace\\BDD_practice\\src\\test\\resources\\mercury.properties");

	pro.load(fis);
	lnm.sendKeys(pro.getProperty("confpass"));

}

public void sub()
{
	
sub.click();

}














}
