package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LinkClick {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe" );
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.google.com/");
		//driver.findElement(By.xpath("//input[@class=\"gLFyf gsfi\"]"));
		//driver.findElement(By.xpath("//input[@type=\"text\"]/following::input[3]")).click
      // driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]/following::a[9]")).click();
	List<WebElement>ls=driver.findElements(By.xpath("//a"));
	int a=ls.size();
	System.out.println(a);
	for(WebElement wb:ls)
	{
		System.out.println(wb.getText());
	}
	}

}
//a[@href="https://mail.google.com/mail/&ogbl"]/following::a[9]