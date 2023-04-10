package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoodMobile {

	public static void main(String[] args) {
		// TODO Auto-generated method stubS
		
		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
 WebDriver driver=new ChromeDriver();
 driver.get("https://www.amazon.in/");
 driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobiles");
 driver.findElement(By.xpath("//input[@id=\"nav-search-submit-button\"]")).click();
 List<WebElement> wb=driver.findElements(By.xpath("//div[@class=\"s-product-image-container aok-relative s-image-overlay-grey s-text-center s-padding-left-small s-padding-right-small s-flex-expand-height\"]"));
	  int a=wb.size(); 
	    System.out.println(a);
	
	}

}

