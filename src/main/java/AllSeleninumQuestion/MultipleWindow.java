package AllSeleninumQuestion;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class MultipleWindow {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
//	WebDriverManager.chromedriver().setup();
WebDriverManager.firefoxdriver().setup();
	WebDriver driver= new FirefoxDriver();
	driver.get("https://prafpawar11.github.io/multiplewindows.html");
	driver.findElement(By.name("fname")).sendKeys("Regration Testing");
	String parent = driver.getWindowHandle();
	
	driver.findElement(By.linkText("Visit Facebook")).click();
	Set<String> allwindow = driver.getWindowHandles();
	String b="";
	for(String a:allwindow) {
		if (a!=(parent)) {
			a=b;
		}
		System.out.println(a);
		
	}
driver.switchTo().window(b);

	
	
	
	
	
	

}
}
