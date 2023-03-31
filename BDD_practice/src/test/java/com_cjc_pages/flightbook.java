package com_cjc_pages;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class flightbook
{
WebDriver driver;

public flightbook(WebDriver driver) {
	super();
	this.driver = driver;
}

@FindBy(xpath = "/html/body/div[2]/table/tbody/tr/td[1]/table/tbody/tr/td/table/tbody/tr/td/table/tbody/tr[2]/td[2]/a")
WebElement link;


@FindBy(name="tripType")
WebElement tt;

@FindBy(name="passCount")
WebElement pcount;

@FindBy(name="fromPort")
WebElement fp;

@FindBy(name="fromMonth")
WebElement fmonth;

@FindBy(name="fromDay")
WebElement fday;

@FindBy(name="toPort")
WebElement tport;

@FindBy(name="servClass")
WebElement sc;

@FindBy(name="airline")
WebElement aline;

@FindBy(name="findFlights")
WebElement ff;




// hii from suyash
//hii

}
