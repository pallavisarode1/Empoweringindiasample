package utility;


import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class BrowserManager{
	

private static WebDriver driver;
	public static WebDriver getBrowser(String string) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\dell\\Downloads\\chromedriver_win32\\CHROMEDRIVER.EXE");
		driver= new ChromeDriver();
		// TODO Auto-generated method stub
	//	driver=new FirefoxDriver();
	//	driver=new ChromeDriver();
		//driver.manage().window().maximize();
	//	driver.manage().deleteAllCookies();
		
		
		
		//firefox profile
		return driver;
	}

	
	
	
}
