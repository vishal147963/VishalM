package PraticeofVishal;

import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class WindowsHandle {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver",
			"C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver = new ChromeDriver();

	driver.get("file:///D:/Auto/Silanium/HTMLCode%20New%20Student/New%20folder/multiplewindow.html");
	
	String parent =driver.getWindowHandle();
	
	System.out.println(parent);
	
	driver.findElement(By.linkText("Facebook register")).click();
	Thread.sleep(4000);
	
	Set<String> s= driver.getWindowHandles();

	System.out.println(s.size());
	
	for(String abc:s)
	{
		if(!(abc.equals(parent)))
		{
			driver.switchTo().window(abc);
			driver.findElement(By.name("firstname")).sendKeys("Abc");
			driver.findElement(By.name("lastname")).sendKeys("Abc");
			
		}

}}}	
	


