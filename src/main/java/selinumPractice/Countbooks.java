package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countbooks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		  WebDriver driver=new ChromeDriver();
		  driver.get("https://www.amazon.in/");
		  driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("books");
		  driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
		 List<WebElement> ls= driver.findElements(By.xpath("//div[@class=\"a-section aok-relative s-image-fixed-height\"]"));
		 int a=ls.size();
		 System.out.println(a);

	}

}
