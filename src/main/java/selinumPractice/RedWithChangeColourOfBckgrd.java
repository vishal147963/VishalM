package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class RedWithChangeColourOfBckgrd {
	public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
   WebDriverManager.chromedriver().setup();
	WebDriver driver=new ChromeDriver();
    driver.get("https://www.facebook.com/");
    WebElement wb=driver.findElement(By.xpath("//input[@name=\"email\"]"));
        JavascriptExecutor  js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.background='yellow';",wb);
        js.executeScript("arguments[0].style.border='3px solid red';",wb);
        
}}
