package selinumPractice;

import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsScroolDSown {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("window.location='https://www.amazon.com/';");
       // js.executeScript("window.scrollBy(0,document.body.ScrollHeight)");
        

	
	js.executeScript("window.scrollBy(0,document.body.scrollHeight)");
	//js.executeScript("window.scrollBy(0,-document.body.scrollHeight)");

	js.executeScript("window.scrollBy(0,1000)");
}}
