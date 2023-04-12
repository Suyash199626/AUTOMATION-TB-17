package redbus;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class A 
{
public static void main(String[] args) 
{
	System.out.println("Hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 109 exe\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("scrollBy(0,50)");
	//----------------------------------------------------------------------------------------
	
	//SEARCHING BUS IN TEXTBOX
	driver.findElement(By.id("src")).sendKeys("Pune");
	
	//----------------------------------------------------------------------------------------
	
	JavascriptExecutor js1=(JavascriptExecutor)driver;
	String ctynm="return document.getElementByid(\"src\").value;";
	   js1.executeScript(ctynm);
	    String fcty=(String)js1.executeScript(ctynm);
	    System.out.println(fcty);
	    //-----------------------------------------------------------------------------------
	    
	    
	
	
	
	
}
}
