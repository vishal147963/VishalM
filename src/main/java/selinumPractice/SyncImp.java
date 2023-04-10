package selinumPractice;

import java.time.Duration;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class SyncImp {
	public static void main(String[] args) {

	System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
    WebDriver driver =new ChromeDriver();
    
    driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(45));
    driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");

}}
