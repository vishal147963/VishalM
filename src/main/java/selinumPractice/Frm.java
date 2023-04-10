package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Frm {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
	
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
	  driver.switchTo().frame("packageFrame");
	  driver.findElement(By.linkText("AbstractFindByBuilder")).click();
	
	}

}
