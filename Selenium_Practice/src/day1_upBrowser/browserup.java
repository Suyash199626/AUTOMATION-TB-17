package day1_upBrowser;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class browserup 
{
public static void main(String[] args) 
{
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\suyas\\OneDrive\\Desktop\\chrome 110\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.youtube.com/");
	driver.manage().window().maximize();
	
}
}
