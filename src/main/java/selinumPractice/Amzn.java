package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Amzn {

	public static void main(String[] args) {
			
//			System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
	        WebDriverManager.chromedriver().setup();
		WebDriver driver =new ChromeDriver();
	         driver.get("https://www.amazon.com/");
	         List<WebElement> ls=driver.findElements(By.xpath("//a"));
	          System.out.println("Total size is "+ls.size());
	          
	          for(WebElement abc:ls)
	          {
	        	System.out.println(abc.getText());  
	          }
	          }

}
