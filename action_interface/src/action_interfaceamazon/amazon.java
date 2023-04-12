package action_interfaceamazon;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class amazon 
{
public static void main(String[] args)
{
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver","C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 111\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.amazon.com/");
	driver.manage().window().maximize();
	
	driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
	
	//1) click method
	driver.findElement(By.xpath("//*[@id=\"nav-xshop\"]/a[1]")).click();
	
	
	
	
	
	
	
	
	
}
}
