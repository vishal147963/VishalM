package selinumPractice;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class ActnsMthd {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
//    WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
            driver.get("https://www.google.com/");
            driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("Selenium");
            WebElement wb=driver.findElement(By.xpath("//input[@name=\"q\"]/following::input[3]"));
            Actions act=new Actions(driver);
            act.contextClick(wb).build().perform();
            System.out.println("TC passed");
            driver.close();
	}

}
