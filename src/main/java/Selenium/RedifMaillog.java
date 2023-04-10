package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedifMaillog {

	public static void main(String[] args) {
		// TODO Auto-generated method 
        
		 System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
              WebDriver driver=new ChromeDriver();
              driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
              driver.findElement(By.xpath("//input[@id='login1']")).sendKeys("sneha");
	driver.findElement(By.xpath("//input[@name='login']//following::input[@id='password']")).sendKeys("Sneha@123");
	driver.findElement(By.xpath("//input[@name='proceed']")).submit();
	}

}
