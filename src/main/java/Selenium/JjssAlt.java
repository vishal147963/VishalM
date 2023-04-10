package Selenium;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JjssAlt {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
       driver.get("https://the-internet.herokuapp.com/javascript_alerts");
       driver.findElement(By.xpath("//button[text()='Click for JS Prompt']")).click();
       Alert alt=driver.switchTo().alert();
             alt.sendKeys("selenium");   
//       System.out.println(alt.getText());
       alt.accept();

	}

	
	
	
	//button[text()='Click for JS Alert']
}
