package com_cjc_pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectproduct 
{
WebDriver driver;

public selectproduct(WebDriver driver)
{
	super();
	this.driver = driver;
}
@FindBy(css="#tbodyid > div:nth-child(1) > div > div > h4 > a")
WebElement product;


@FindBy(css="#tbodyid > div.row > div > a")
WebElement addtocart;


@FindBy(xpath ="//*[@id=\"cartur\"]")
WebElement topcart;


@FindBy(xpath ="//*[@id=\"page-wrapper\"]/div/div[2]/button")
WebElement placeorder;


public void product() throws InterruptedException
{
	Thread.sleep(1000);
	
	product.click();

}


public void addtocart() throws InterruptedException
{
	Thread.sleep(1000);
	addtocart.click();
	
	
	
	
}

public void topcart() throws InterruptedException
{
	
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	topcart.click();
	
}

public void placeorder() throws InterruptedException
{
	Thread.sleep(2000);
	placeorder.click();
}
	
	

}
