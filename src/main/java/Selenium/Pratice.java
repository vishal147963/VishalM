package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Pratice {

	public static void main(String[] args) {


		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.com/");
		String a=driver.getCurrentUrl();
		System.out.println(a);
		if(a.contains("amazon"))
		{System.out.println("Test case is passed");
		}
		else
		{System.out.println("test case fail");
		}
		driver.navigate().refresh();
		String b=driver.getTitle();
		System.out.println(b);
		if(a.contains("Amazon.com"))
		{System.out.println("Test case is passed");
		
		}else
		{System.out.println("Test case is fail");
		
		}
	
	}

}
