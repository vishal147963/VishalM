package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class ButtonOperation {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
		   WebElement wb=driver.findElement(By.id("btnLogin"));
		   String g=wb.getAttribute("value");
		   System.out.println(g);

}}
