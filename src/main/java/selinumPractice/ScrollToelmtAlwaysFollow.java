package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ScrollToelmtAlwaysFollow {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        driver.get("https://www.amazon.in/");
        WebElement wb=driver.findElement(By.xpath("//span[text()='Best Sellers in Home & Kitchen']"));
         js.executeScript("arguments[0].scrollIntoView(true);",wb);
         
         //js.executeScript("arguments[0].scrollIntoView(true);", wb);
	

}}