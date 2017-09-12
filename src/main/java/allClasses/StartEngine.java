package allClasses;

import org.openqa.selenium.By;

public class StartEngine  extends OpenBrowser
{

	public static void main(String[] args) 
	{
		 
			System.out.println(" Program Started ");
		openChromeBrowser();
		driver.get("http://13.65.209.198:881/");
		
		driver.findElement(By.xpath("//*[@id='Username']")).sendKeys("swarupkumar");
		driver.findElement(By.xpath("//*[@id='Password']")).sendKeys("12345");
		
		driver.findElement(By.xpath("//*[@id=\"login-submit\"]")).click();
		
		String x= driver.findElement(By.xpath("//div[2]/h2")).getText();
		System.out.println(x);
		
 
		if(x.contains("File Details tree view"))
		{
			System.out.println("true");
		}
		
		else
		{
			System.out.println("False");
		}
	
		driver.close();
		driver.quit();
	}
 

}
