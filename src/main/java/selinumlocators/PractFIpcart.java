package selinumlocators;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PractFIpcart {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.findElement(By.xpath("//input[@class=\"_3704LK\"]")).sendKeys("books");
		driver.findElement(By.xpath("//button[@class=\"L0Z3Pu\"]")).submit();
	List<WebElement> ls=	driver.findElements(By.xpath("//div[@class=\"_4ddWXP\"]"));
	int s=ls.size();
	System.out.print(s);
	for(WebElement abc:ls) {
	String a=abc.getText();
	System.out.println(a);
	}

	
}}
//input[@class="_3704LK"]