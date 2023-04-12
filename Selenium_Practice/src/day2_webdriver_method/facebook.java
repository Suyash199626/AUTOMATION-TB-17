package day2_webdriver_method;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class facebook 
{
public static void main(String[] args) 
{
	System.out.println("hello");
	System.setProperty("webdriver.chrome.driver", "C:\\\\Users\\\\suyas\\\\OneDrive\\\\Desktop\\\\chrome 110\\\\chromedriver_win32\\\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.facebook.com/");   //GET METHOD
	driver.manage().window().maximize();
	//--------------------------------------------------------------------------------------------
	
driver.navigate().to("https://www.amazon.com/");    //NAVIGATE TO METHOD
driver.navigate().back();                           // NAVIGATE BACK METHOD

//------------------------------------------------------------------------------------------------

String title=driver.getTitle();
System.out.println(title);                       // GET TITLE METHOD

//----------------------------------------------------------------------------------------------
 
String cps=driver.getCurrentUrl();            // GETCURRENTURL METHOD
System.out.println(cps);

//--------------------------------------------------------------------------------------------------

String gps=driver.getPageSource();         // GETPAGESOURCE METHOD
System.out.println(gps);

//----------------------------------------------------------------------------------------------------

   //driver.close();                       // close method
   driver.quit();                          // quit method
   
 //------------------------------------------------------------------------------------------------
   
   














}
}
