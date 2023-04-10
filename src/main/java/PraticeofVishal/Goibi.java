package PraticeofVishal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Goibi {
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[text()='Departure']")).click();
	while (true) {
//		driver.findElement(By.xpath(""))
	}
}
}
