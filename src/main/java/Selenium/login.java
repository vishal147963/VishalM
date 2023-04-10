package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class login {

	public static void main(String[] args) {
   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
   WebDriver driver=new ChromeDriver();
   driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
   String b=driver.getCurrentUrl();
   System.out.println(b);
   driver.findElement(By.id("txtUsername")).sendKeys("Admin ");
   driver.findElement(By.id("txtPassword")).sendKeys("admin123 ");
   driver.findElement(By.id("btnLogin")).click();
   driver.navigate().to("https://www.facebook.com/");
   String s=driver.getTitle();
   System.out.println(s);
   driver.close();
   
	}

}
