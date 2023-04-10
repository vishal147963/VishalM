package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo7 {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
//		driver.get("https://www.facebook.com/reg");
//		boolean a =driver.findElement(By.name("firstname")).isDisplayed();
//		System.out.println(a);
//		boolean b=driver.findElement(By.name("firstname")).isEnabled();
//		System.out.println(b);
//		driver.findElement(By.name("firstname")).sendKeys("testing");
//	
//		driver.findElement(By.name("firstname")).clear();
//		driver.close();
		driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		boolean a=driver.findElement(By.id("txtUsername")).isDisplayed();
		System.out.println(a);
		boolean b=driver.findElement(By.id("txtUsername")).isEnabled();
		System.out.println(b);
		driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		driver.findElement(By.id("txtUsername")).clear();
		boolean c=driver.findElement(By.id("txtPassword")).isDisplayed();
		System.out.println(c);
		boolean d=driver.findElement(By.id("txtPassword")).isEnabled();
		System.out.println(d);
		driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		driver.findElement(By.id("txtPassword")).clear();
		driver.findElement(By.id("btnLogin")).click();
		String e=driver.getTitle();
		if(e.contains("HRM"))
		{
			System.out.println("assign6 is pass");
		}
		else {
			System.out.println("assign is Fail");
		}
			
		
	}
		
}
