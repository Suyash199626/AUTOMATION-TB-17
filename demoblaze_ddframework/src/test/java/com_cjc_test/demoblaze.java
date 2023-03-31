package com_cjc_test;


import java.io.IOException;
import java.util.Properties;
import java.util.concurrent.TimeUnit;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.BeforeGroups;
import org.testng.annotations.BeforeSuite;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;

import com_cjc_pages.address;
import com_cjc_pages.login;
import com_cjc_pages.selectproduct;
import com_cjc_pages.Registration;

public class demoblaze
{
	

	
	public static WebDriver driver;
	Properties pro=new Properties();
	static Logger log=Logger.getLogger(demoblaze.class.getName());


@BeforeSuite
	public void openbrowser()
	{
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 109 exe\\chromedriver_win32\\chromedriver.exe");
	    driver=new ChromeDriver();
	    
	}

@BeforeTest
public void url()
{
		driver.get("https://www.demoblaze.com/index.html");
		
}
@BeforeClass
public void window()
{
		driver.manage().window().maximize();
		 driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		 
	}

@Test
	public void signuppage() throws IOException, InterruptedException
	{
		Thread.sleep(2000);
		Registration reg=PageFactory.initElements(driver,Registration.class);
		reg.signlink();

	
	
	
		Thread.sleep(2000);
		Registration reg1=PageFactory.initElements(driver,Registration.class);
		reg1.reguser();

	



		Thread.sleep(2000);
		Registration reg2=PageFactory.initElements(driver,Registration.class);
		reg2.regpass();
		
	



	
		Thread.sleep(2000);
		Registration reg3=PageFactory.initElements(driver,Registration.class);
		reg3.signup();
		
	


	
	

	
		
	login lg=PageFactory.initElements(driver,login.class);
	   
		lg.loglink();
		

	

	
		Thread.sleep(2000);
		login lg1=PageFactory.initElements(driver,login.class);
		lg.logun();
	


		Thread.sleep(2000);
		login lg2=PageFactory.initElements(driver,login.class);
		lg2.logpass();
		
	


	
		login lg3=PageFactory.initElements(driver,login.class);
		lg3.logbn();


	
	
		
		log.info("success log");
	

	//---------------------------------------------- login ----------------------------------------------------------


	
		Thread.sleep(1000);
		
	selectproduct sp=PageFactory.initElements(driver,selectproduct.class);
	sp.product();
		
	

	Thread.sleep(1000);
		selectproduct	sp2=PageFactory.initElements(driver,selectproduct.class);
		sp2.addtocart();
			

	

		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		
		selectproduct	sp1=PageFactory.initElements(driver,selectproduct.class);
		sp1.topcart();
			
		
	

		Thread.sleep(1000);
		selectproduct	sp3=PageFactory.initElements(driver,selectproduct.class);
		sp3.placeorder();
			
	

	
		
		log.info("success selproduct");
	
	//--------------------------------------------- select product ------------------------------------------------------




	
		address	add=PageFactory.initElements(driver,address.class);
		add.name();
			

	

	
	

		address	add1=PageFactory.initElements(driver,address.class);
		add1.country();
			
	

	

		address	add2=PageFactory.initElements(driver,address.class);
		add2.city();
			
	

	

		address	add3=PageFactory.initElements(driver,address.class);
		add3.creditcard();
			
	

	
		address	add4=PageFactory.initElements(driver,address.class);
		add4.month();
	

	
		address	add5=PageFactory.initElements(driver,address.class);
		add5.year();
		
	
		address	add6=PageFactory.initElements(driver,address.class);
		add6.clickpurchase();
		
		WebElement k=driver.findElement(By.cssSelector("body > div.sweet-alert.showSweetAlert.visible > p"));
		String s=k.getText();
		log.info(s);
	

	
		log.info("success purchase product");
		
	

	//-------------------------------------------- purchase successfull ------------------------------------------------------

	}
}
	

