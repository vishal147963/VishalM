package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Countbooksamazon {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.amazon.in/");
       
//        driver.findElement(By.xpath("//div[@class=\"nav-search-field \"]")).sendKeys("moblie");
       driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]")).sendKeys("mobile");
        driver.findElement(By.xpath("//div[@class=\"nav-search-submit nav-sprite\"]")).click();
//       driver.findElement(By.xpath("//input[@id=\"twotabsearchtextbox\"]/following::input[1]")).click();
       List<WebElement> wb=driver.findElements(By.xpath("//div[@class=\"aok-relative\"]"));
       int a=wb.size();
       System.out.println(a);
       
       driver.close();
       
	}
	

}

