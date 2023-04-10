package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class OrngHSndKys {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		 WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
        driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
        try {
			Thread.sleep(5000);
		} catch (InterruptedException e) {
			e.printStackTrace();
		}
       WebElement uname= driver.findElement(By.xpath("//input[@id=\"txtUsername\"]"));
        WebElement pass=driver.findElement(By.xpath("//input[@id='txtPassword']"));
     WebElement login=   driver.findElement(By.xpath("//input[@id='btnLogin']"));
     
     Actions act=new Actions(driver);
     act.sendKeys(uname,"Admin")
     .sendKeys(pass,"admin123")
     .click(login)
     .build()
     .perform();
	}

}
