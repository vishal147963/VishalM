package selinumPractice;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WindowType;
import org.openqa.selenium.chrome.ChromeDriver;

public class SwitchToTab {
	public static void main(String[]args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		WebDriver d=driver.switchTo().newWindow(WindowType.TAB);
		d.get("https://about.facebook.com/");
		driver.quit();

}}
