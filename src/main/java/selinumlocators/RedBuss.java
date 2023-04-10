package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedBuss {
	public static String Year ="Dec 2022";
	public static String Day= "12";
	
public static void main(String[] args) {
	
	
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.get("https://www.redbus.in/");
	driver.findElement(By.id("onward_cal")).click();
	while (true) {
	
	String a =driver.findElement(By.xpath("//td[@class=\"monthTitle\"]")).getText();
	System.out.println(a);
	if(a.equals(Year)) {
		break;
		}
	else {
		driver.findElement(By.xpath("//td[@class='next']")).click();
	}}
driver.findElement(By.xpath("//table[@class=\"rb-monthTable first last\"]/tbody/tr/td[contains(text(),'12')]")).click();
	}}	