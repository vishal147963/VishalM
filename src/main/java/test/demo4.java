package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class demo4 {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/");
		//String a=driver.getTitle();
	
//		System.out.println(a);
//		driver.close();
//	
		String a =driver.getTitle();
	
	System.out.println(a);
	if(a.contains(" Facebook"))
	{
		System.out.println("tc is pass");
	}
	else {System.out.println("tc is fail");}	
	System.out.println(driver.getCurrentUrl());
	driver.navigate().to("https://www.google.co.in/");
	driver.close();
	
	
	
	
	
	}}	