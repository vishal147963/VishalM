package AllSeleninumQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MutipleFrame {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("file:///D:/Auto/Silanium/HTMLCode%20New%20Student/New%20folder/frame.html");

		WebElement name=driver.findElement(By.id("name"));
		name.sendKeys("Selenium Testing");
		
		Thread.sleep(4000);
		driver.switchTo().frame("mainframe");
		WebElement address=driver.findElement(By.id("add"));
		address.sendKeys("Pune MH");
		
		Thread.sleep(4000);
		driver.switchTo().frame("child1");
		WebElement mobile=driver.findElement(By.id("mob"));
		mobile.sendKeys("12345678990");
		
		Thread.sleep(4000);
		driver.switchTo().parentFrame();
		String a=address.getAttribute("value");
		System.out.println(a);
		address.clear();
		
		Thread.sleep(4000);
		driver.switchTo().defaultContent();
		String b =name.getAttribute("value");
		System.out.println(b);
		name.clear();
		
	}
}
