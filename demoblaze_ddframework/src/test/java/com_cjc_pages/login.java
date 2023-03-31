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

		@FindBy(css="#login2")
		WebElement loglink;
		
		
		@FindBy(xpath = "//*[@id=\"loginusername\"]")
		WebElement logusername;
		
		
		@FindBy(css="#loginpassword")
		WebElement logpass;
		
		
		@FindBy(css="#logInModal > div > div > div.modal-footer > button.btn.btn-primary")
		WebElement loginbutton;
		
		
		public void loglink() throws InterruptedException
		{
			Thread.sleep(1000);
			driver.switchTo().alert().accept();
			loglink.click();
		}
		

		public void logun() throws InterruptedException
		{
			Thread.sleep(1000);
			logusername.sendKeys("suy56789");
			
		}
		
		
		public void logpass() throws InterruptedException
		{
			
	        Thread.sleep(1000);
			logpass.sendKeys("abc@9090");
			
		}
		
		public void logbn()
		{
			


			loginbutton.click();
			
		}
		
		
		
		
		
		

		

		
		
	}


