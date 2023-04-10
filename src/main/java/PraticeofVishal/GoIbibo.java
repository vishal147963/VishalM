package PraticeofVishal;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class GoIbibo {
	public static String Month="April'23";
	public static String Date="1";
	
public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.goibibo.com/");
	driver.findElement(By.xpath("//span[text()=\"Departure\"]")).click();
	String Julymonth=driver.findElement(By.xpath("(//div[@role=\"gridcell\"])[1]")).getText();
	System.out.println(Julymonth);
	while(true) {
		if(Julymonth.equals(Month))
		{
			driver.findElement(By.xpath("//div[@aria-label=\"Thu Apr 13 2023\"]")).click();
			break;
			
		}
		else {
		driver.findElement(By.xpath("//span[@class=\"fswTrvl__done\"]")).click();
	}}
	




}
}
