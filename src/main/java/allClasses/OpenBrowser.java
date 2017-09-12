package allClasses;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class OpenBrowser
{
	 protected static WebDriver driver;
	
		protected static void openChromeBrowser()
		{
			/* String driverPath=System.getProperty("user.dir")+"/lib/chromedriver.exe";
				//String driverPath= "//lib/chromedriver.exe";
				System.setProperty("webdriver.chrome.driver",driverPath);*/
			System.setProperty("webdriver.chrome.driver","D:/MyFiles_Chanagonda/UpdatedVersions/chromedriver.exe");
			ChromeOptions options = new ChromeOptions();
			options.addArguments("disable-infobars");
			//	options.setExperimentalOption("excludeSwitches", Arrays.asList("enable-automation"));
			options.addArguments("--disable-notifications");
			options.addArguments("--start-maximized");
			//	options.addArguments("--incognito");
			
			driver=new ChromeDriver(options);
			driver.manage().window().maximize();
		 
		}
		protected static void openInternetExplorerBrowser()
		{
			System.setProperty("webdriver.ie.driver","D:\\MyFiles_Chanagonda\\UpdatedVersions\\IEDriverServer.exe");
			driver=new InternetExplorerDriver();
			driver.manage().window().maximize();
			
		}

	}



