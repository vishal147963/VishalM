package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class fbdropdown2 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/reg");
	     // WebElement countday=driver.findElement(By.id("day"));
	      //Select sele=new Select(countday);
	     // List<WebElement> ls=sele.getOptions();
	      
	      

	}

}
