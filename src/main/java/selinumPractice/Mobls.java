package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Mobls {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
    System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32\\\\chromedriver.exe");
    WebDriver driver=new ChromeDriver();
    driver.get("https://www.google.com/");
    driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Mobiles");
    driver.findElement(By.xpath("//input[@name=\"q\"]/following::input[3]")).click();
    List<WebElement> ls=driver.findElements(By.xpath("//div[@class=\"mnr-c pla-unit\"]"));
	 int a= ls.size();
	  System.out.println(a);
	}

}
