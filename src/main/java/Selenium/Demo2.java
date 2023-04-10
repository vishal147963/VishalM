package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo2 {

	public static void main(String[] args) {

		//System.setProperty("webdriver.chromer.driver","‪C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.navigate().to("https://www.google.com/");
		
		
//		driver.get("https://www.google.com/");
//		String a=driver.getTitle();
//		System.out.println(a);
//		System.out.println(a.equals("google"));
//		if (a.equals("Google"))
//		{System.out.println("Test case pass");
//			}
//		else
//		{System.out.println("Test case fail");
//			}
//		
//		System.out.println(driver.getCurrentUrl());
		driver.close();
	
	
	
	
	
	
	}

}
