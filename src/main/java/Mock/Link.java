package Mock;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Link {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.amazon.in/");
		driver.findElement(By.linkText("Best Sellers")).click();
		Thread.sleep(5000);
		System.out.println(driver.getCurrentUrl());
		
		driver.navigate().back();
		Thread.sleep(5000);
		driver.findElement(By.partialLinkText("Best")).click();
		Thread.sleep(5000);
		String a=driver.getTitle();
		System.out.println(a);
//		driver.close();
	
	System.out.println("+++++++++++++++++++++");
		
		
//		driver.findElement(By.linkText("Amazon miniTV")).click();
//		driver.navigate().back();
//		driver.findElement(By.partialLinkText("Best ")).click();
//		System.out.println(driver.getTitle());
//		System.out.println(driver.getCurrentUrl());
		List<WebElement> wb = driver.findElements(By.xpath("//*"));
		System.out.println("Size of the web Element is " + wb.size());

		List<WebElement> wb1 = driver.findElements(By.xpath("//a"));
		for (WebElement w : wb1) {
			
			
			System.out.println(w.getText());
		}
		Thread.sleep(5000);
		driver.manage().window().minimize();
driver.close();
	}}

