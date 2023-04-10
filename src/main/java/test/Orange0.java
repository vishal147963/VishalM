package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Orange0 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
driver.findElement(By.name("txtUsername")).sendKeys("Admin");
driver.findElement(By.name("txtPassword")).sendKeys("admin123");
driver.findElement(By.id("btnLogin")).click();
driver.findElement(By.id("menu_pim_viewPimModule")).click();
driver.findElement(By.name("btnAdd")).click();
driver.findElement(By.id("firstName")).sendKeys("abc");
driver.findElement(By.id("lastName")).sendKeys("abc");
driver.findElement(By.id("btnSave")).click();
//WebElement wb=driver.findElement(By.id("personal_cmbNation"));
//Select sel=new Select(wb);
driver.findElement(By.id("btnSave")).click();
driver.findElement(By.id("personal_txtEmpNickName")).sendKeys("abc");
driver.findElement(By.id("btnSave")).click();
	}

}
