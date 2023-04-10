package Selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Class4Demo4o {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://accounts.google.com/signin/v2/challenge/pwd?service=mail&passive=1209600&osid=1&continue=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&followup=https%3A%2F%2Fmail.google.com%2Fmail%2Fu%2F0%2F&emr=1&flowName=GlifWebSignIn&flowEntry=ServiceLogin&cid=1&navigationDirection=forward&TL=AM3QAYY9rwp5V_h8fU548ylwWWz_ytCPqDV2rBLv_0F01Dcr2Ad3yONbcUjjqI71");
 		Thread.sleep(4000);
	
		//driver.findElement(By.tagName("email")).sendKeys("mktravelsmanager@gmail.com");
		//driver.find
		driver.findElement(By.id("identifierId")).sendKeys("psuryakant041954");
		
 		Thread.sleep(4000);

		//driver.findElement(By.id("passwordNext")).click();
		driver.findElement(By.className("VfPpkd-vQzf8d")).click();
		
		

		
	}

}
