package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class CountLinks {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
  WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
  driver.get("https://www.amazon.in/");
  List<WebElement> wb=driver.findElements(By.xpath("//a"));
 int b= wb.size();
 System.out.println(b);
    for(WebElement abc:wb)
    {
    	String c=abc.getText();
    	abc.getAttribute(c);
    	System.out.println(c);
    }
	}

}
