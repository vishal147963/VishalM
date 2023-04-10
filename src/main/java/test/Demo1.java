package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();

		driver.get("https://www.jio.com/");
//		String a=driver.getTitle();
//		System.out.println(a);
//		driver.navigate().to("https://www.facebook.com/reg");
		String b=driver.getTitle();
		System.out.println(b);
		String a=driver.getCurrentUrl();
		System.out.println(a);

		
		
		
	}

}
