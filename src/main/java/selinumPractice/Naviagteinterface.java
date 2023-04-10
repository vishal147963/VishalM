package selinumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Naviagteinterface {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		driver.navigate().to("https://www.amazon.com/");
		String a=driver.getCurrentUrl();
		System.out.println(a);
		driver.navigate().back();
		String b=driver.getTitle();
		System.out.println(b);
		driver.navigate().forward();
		String c=driver.getCurrentUrl();
		driver.navigate().refresh();
		System.out.println(c);
		driver.close();
	}
		

}
