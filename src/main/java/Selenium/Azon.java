package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Azon {

	public static void main(String[] args) {
		// TODO Auto-generated method 
 
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']")).sendKeys("iphone");
		driver.findElement(By.xpath("//input[@id='twotabsearchtextbox']/following::input[1]")).click();
       //String s= driver.findElement(By.xpath("//div[@id='title_feature_div']")).getText();
     // s=  driver.findElement(By.xpath("//span[@class='a-size-large product-title-word-break']")).getText();
		//System.out.println(s);
		String s= driver.findElement(By.xpath("//div[@id='p_72-title']/following::div[2]/following::div[1]")).getText();
	  System.out.println(s);
	  
	}
	

}

//input[@id="twotabsearchtextbox"]
//div[@id='title_feature_div']