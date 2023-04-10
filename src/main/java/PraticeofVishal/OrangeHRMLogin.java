package PraticeofVishal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeHRMLogin {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	driver.findElement(By.xpath("//input[@id=\"txtUsername\"]")).sendKeys("Admin");
	driver.findElement(By.xpath("//input[@name=\"txtPassword\"]")).sendKeys("admin123");
	
	driver.findElement(By.xpath("//input[@name=\"txtPassword\"]//following::input[@name='Submit']")).click();
	driver.findElement(By.xpath("//a[@id='menu_pim_viewPimModule']")).click();
	driver.findElement(By.xpath("//input[@id=\"btnAdd\"]")).click();
	driver.findElement(By.xpath("//input[@id=\"firstName\"]")).sendKeys("Vishal");
	driver.findElement(By.xpath("//input[@id=\"firstName\"]//following::input[@id=\"middleName\"]")).sendKeys("S");
	driver.findElement(By.xpath("//input[@id=\"lastName\"]")).sendKeys("Patole");
	System.out.println("TC pass");

	driver.close();
	
	}

}
