package Selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.jio.com/");
		
		//String a=driverObject.getTitle("https://www.jio.com/");

		String a=driver.getTitle();
	System.out.println(a);
	System.out.println(a.equals("Jio"));
		if (a.equals("jio"))
		{System.out.println("TC pass");
		
		}
		else
			System.out.println("TC fails");
	//System.out.println(a);
	//System.out.println(driver.getTitle());
	
	
	
	
	driver.close();
	}

}
