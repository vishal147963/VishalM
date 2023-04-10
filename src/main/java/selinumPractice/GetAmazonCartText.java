package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class GetAmazonCartText {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.amazon.in/");
	WebElement wb=driver.findElement(By.xpath("//a[@id=\"nav-cart\"]"));
	String a =wb.getText();
	System.out.println(a);
	
}

}
