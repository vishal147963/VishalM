package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo9 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String a=driver.findElement(By.className("_8eso")).getText();
		System.out.println(a);
		//driver.findElement(By.id("reg_pages_msg")).getText();
		if(a.contains("Facebook"))
		{System.out.println("Tc is passs");}
		else {System.out.println("tc is fail");}
	}

}
