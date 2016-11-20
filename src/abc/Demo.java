package abc;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Demo 
{

	public static void main(String[] args) throws InterruptedException
	{
		WebDriver driver=new FirefoxDriver();
		
		driver.manage().window().maximize();
		
		driver.get("http://facebook.com");
		Thread.sleep(5000);
		String x = driver.getTitle();
		System.out.println(x);
		
		String y = driver.getCurrentUrl();
		System.out.println(y);
		
		


	}

}
