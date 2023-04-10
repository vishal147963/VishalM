package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Link {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.google.com/");
		 // WebElement wb= driver.findElement(By.linkText("Gmail"));
		 // wb.click();
		   driver.findElement(By.partialLinkText("Gmai")).click();

}}
