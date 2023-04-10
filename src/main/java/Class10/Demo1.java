package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1 {

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.google.com/");
//		WebElement wb=driver.findElement(By.xpath("//input[@class='gLFyf gsfi']"));
//		wb.sendKeys("selenium");
//		Thread.sleep(4000);
//		//driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']")).click();
////		WebElement  a =driver.findElement(By.name("btnK"));
////		a.click();
//		WebElement x =driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']"));
//		x.submit();
		
		driver.findElement(By.xpath("//input[@name='q']")).sendKeys("Selenium Testing");
		Thread.sleep(4000);
		driver.findElement(By.xpath("//div[@class='FPdoLc lJ9FBc']/center/input[@name='btnK']"))
		.submit();
		
		
	}

}
