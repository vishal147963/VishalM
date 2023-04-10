

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Xpath {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","‪‪C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/reg/");
		driver.findElement(By.xpath(" //input[@name='firstname']")).sendKeys("Vishal");
		driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Patole");
		driver.findElement(By.xpath("//input[contains(@id,'u_0_o')]")).sendKeys("9545306694");
		
	}

}
