package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Coogle {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		String a=driver.getTitle();
		System.out.println(a);
		if(a.contains("google"))
		{	System.out.println("tc is pass");
		}
		else {
			System.out.println("fail");
		}
		}
		
		
	
	}
	

