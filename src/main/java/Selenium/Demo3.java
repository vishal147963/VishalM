package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo3 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.getTitle();
		System.out.println(a);
		driver.navigate().to("https://www.google.com/");
		String b=driver.getCurrentUrl();
		System.out.println(b);
		System.out.println(driver.getCurrentUrl());
		driver.navigate().back();
		String c=driver.getCurrentUrl();
		System.out.println(c);
		//add vertification point.
		driver.get("https://www.google.com/");
		String x=driver.getTitle();
		System.out.println(x.equals("google"));
		
		if (x.equals("google"))
		{System.out.println("TC pass");
		}
		else
		{
			System.out.println("Tc Fails");
		}
		driver.close();
		
		
	}

}
