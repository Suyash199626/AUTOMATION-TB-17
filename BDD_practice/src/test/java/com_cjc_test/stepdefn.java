package com_cjc_test;

import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;

import com_cjc_pages.registration;
import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class stepdefn 
{
public static WebDriver driver;
Properties pro=new Properties(); 

@Given("^open chrome browser and open mercury website$")
public void openbrowser()
{
	
System.out.println("hello");

System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 109 exe\\chromedriver_win32\\chromedriver.exe");
driver=new ChromeDriver();
driver.get("https://demo.guru99.com/test/newtours/register.php");
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);

}

@When("^click on register page$")
public void url() throws IOException
{
	System.out.println("clicked");
}

@And("^enter first name in first name textbox$")
public void fname() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.fname();
	

}


@And("^enter last name in last name textbox$")
public void lname() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.lname();
	

}

@And("^enter phone in phone number textbox$")
public void phone() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.phone();
	

}

@And("^enter email in email textbox$")
public void email() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.email();
	

}

@And("^enter city in city textbox$")
public void city() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.city();
	

}

@And("^enter state in state textbox$")
public void state() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.state();
	

}

@And("^enter postal code in postal textbox$")
public void postcode() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.postalcode();
	

}

@And("^enter country in country textbox$")
public void country() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.country();
	

}

@And("^enter username in username textbox$")
public void username() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.uname();
	

}

@And("^enter password in password textbox$")
public void pass() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.pass();
	

}

@And("^enter confirm password in password textbox$")
public void conpass() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.conpass();
	

}

@And("^click on submit button$")
public void sub() throws IOException
{
	registration rg=PageFactory.initElements(driver, registration.class);
	rg.sub();
	

}
@Then("^ disply success page$")
public void success()
{
	
System.out.println("success");
}





}
