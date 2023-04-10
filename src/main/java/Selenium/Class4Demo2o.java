package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Demo2o {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub

		//System.setProperty("webdriver.chrome.driver", null);
 		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
 		WebDriver driver=new ChromeDriver();
 		driver.get("https://www.linkedin.com/signup");
 		Thread.sleep(4000);
 		
 		String a=driver.getTitle();
 		System.out.println(a);
 		driver.navigate().to("https://www.facebook.com/");
 		 				
 		String b=driver.getCurrentUrl();
 		if(b.contains("book"))
 		{System.out.println("TC pass");
 		
 		}
 		else
 		{System.out.println("TC fail");
 		
 		}
 		
 		System.out.println(b);
 		
 		
 		
 		
 		Thread.sleep(4000);
 		driver.navigate().back();
 		String c=driver.getCurrentUrl();
 		System.out.println(c);
 		driver.navigate().forward();
 		String d=driver.getTitle();
 		System.out.println(d);
 		Thread.sleep(4000);
 		Thread.sleep(4000);
 		driver.close();
 		
 		
 		


	}

}
