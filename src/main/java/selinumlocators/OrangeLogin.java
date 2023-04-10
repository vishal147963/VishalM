package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class OrangeLogin {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		   driver.findElement(By.id("txtUsername")).sendKeys("Admin");
		   driver.findElement(By.id("txtPassword")).sendKeys("admin123");
		   driver.findElement(By.id("btnLogin")).click();
		   driver.findElement(By.id("menu_pim_viewPimModule")).click();
		   driver.findElement(By.name("btnAdd")).click();
		   driver.findElement(By.name("firstName")).sendKeys("sneha");
		   driver.findElement(By.name("lastName")).sendKeys("patole");
		   driver.findElement(By.id("btnSave")).click();

}}
