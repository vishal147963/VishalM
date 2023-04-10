package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TextBoxOperation {
	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/reg");
		WebElement wb=   driver.findElement(By.name("reg_email__"));
		boolean a=wb.isDisplayed();
		System.out.println(a);
		wb.sendKeys("Sneha@gmail.com");
		String ab=wb.getAttribute("value");
		System.out.println(ab);
		
	

	}}
