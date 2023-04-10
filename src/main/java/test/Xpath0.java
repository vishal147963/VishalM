package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
 driver.get("https://www.selenium.dev/");
 //driver.findElement(By.xpath("//input[@name='q']")).sendKeys("TestNG");
 //driver.findElement(By.xpath("//div[@class'FPdoLc lJ9FBc']/center/input[@name='btnK']")).click();
 driver.findElement(By.xpath("//input[@name='q']")).sendKeys("TestNG");
 driver.findElement(By.xpath("//input[@name='q']"))
	}

}
