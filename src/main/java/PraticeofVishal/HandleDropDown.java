package PraticeofVishal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class HandleDropDown {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		//we have created the object of select class by passing webElement instance
		WebElement wb=driver.findElement(By.xpath("//select[@id=\"day\"]"));
		Select sel= new Select(wb);
		
		List<WebElement> ls= sel.getOptions();
//		int a=ls.size();
//		System.out.println(a);
		
		for(WebElement x:ls) {
			String b= x.getText();
//			System.out.print(" "+b+" ");
			System.out.println(b);
		}
	driver.close();
	}

}
