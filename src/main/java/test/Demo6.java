package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo6 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("https://www.facebook.com/");

	
	driver.findElement(By.id("email")).sendKeys("testing");
	
//	driver.findElement(By.name("q")).sendKeys("Selenium Testing");
//	driver.get("https://www.facebook.com/reg");
	}}