package day3_Locaters;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Amazon
{
public static void main(String[] args) throws InterruptedException 
{
	System.out.println("hello");
	System.setProperty("webdriver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 110\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	//-----------------------------------------------------------------------------------------------------
	
	driver.findElement(By.xpath("//*[@id=\"nav-hamburger-menu\"]/span")).click();
	
	driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[1]/li[7]/a/div")).click();
	
	driver.findElement(By.xpath("//*[@id=\"hmenu-content\"]/ul[5]/li[3]/a")).click();
	
	Thread.sleep(2000);
	driver.findElement(By.xpath("/html/body/div[1]/div[2]/div[1]/div[1]/div/span[1]/div[1]/div[3]/div/div/div/div/div/div/div[2]/div[1]/h2/a/span")).click();
	
	//-----------------------------------------------------------------------------------------------------------------------------------------------
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
}
