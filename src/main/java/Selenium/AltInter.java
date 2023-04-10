package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AltInter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
        driver.findElement(By.xpath("//input[@name='proceed']")).click();
         Alert alt=driver.switchTo().alert();
         String a=alt.getText();
         System.out.println(a);
         alt.accept();
	}

}
