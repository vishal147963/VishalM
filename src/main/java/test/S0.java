package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class S0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		WebElement wb=driver.findElement(By.name("txtUsername"));
		wb.sendKeys("Admin");
		String a=wb.getAttribute("value");
		System.out.println(a);
		boolean b=	wb.isDisplayed();
	System.out.println(b);
	System.out.println(wb.isEnabled());
	WebElement wb1=driver.findElement(By.name("txtPassword"));
	wb1.sendKeys("Admin123");
	driver.findElement(By.id("btnLogin")).click();
	String c=driver.getTitle();
	System.out.println(c);
	if(c.contains("HRM"))
	{
		System.out.println("tc is pass");
		}
	else {
		System.out.println("tc is fail");
	}
		driver.findElement(By.id("menu_pim_viewPimModule")).click();
		driver.findElement(By.name("btnAdd")).click();
		driver.findElement(By.id("firstName")).sendKeys("abc");
		driver.findElement(By.id("lastName")).sendKeys("abc");
		driver.findElement(By.id("btnSave")).click();
	}

}
