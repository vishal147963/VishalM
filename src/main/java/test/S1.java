package test;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class S1 {

	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
     WebDriver driver=new ChromeDriver();
      driver.get("https://www.amazon.com/");
      Thread.sleep(4000);
      
      driver.manage().window().minimize();
      Thread.sleep(4000);
      driver.manage().window().maximize();
      Thread.sleep(4000);
	driver.manage().window().fullscreen();
	Thread.sleep(4000);
	driver.close();

}

}