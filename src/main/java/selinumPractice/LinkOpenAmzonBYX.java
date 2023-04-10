package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkOpenAmzonBYX {


		public static void main(String[]args) {
			System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
			WebDriver driver=new ChromeDriver();
			driver.get("https://www.amazon.com/");
			//driver.findElement(By.xpath("//span[@class=\"hm-icon-label\"]/following::a[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]")).click();

			//driver.findElement(By.xpath("//a[@href=\"/gp/goldbox?ref_=nav_cs_gb\"]")).click();
	
		driver.findElement(By.linkText("Registry")).click();
		
		}
		

}



