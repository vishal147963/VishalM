package ScreenShot;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Dropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().minimize();
		WebElement wb=driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select sl= new Select(wb);
		WebElement fo=sl.getFirstSelectedOption();
		String tx=fo.getText();
		System.out.println(tx);
		System.out.println("+++++++++++++++++++");
		List<WebElement> ct=sl.getOptions();
		int sz=ct.size();
		System.out.println("=================");
		System.out.println(sz);
		List<WebElement> a=sl.getOptions();
		for(WebElement p:a) {
			String text=p.getText();
			
		System.out.println(text);
		if (text.contains("1991")) {
			System.out.println("Tc passed ");
			break;
		}
		}

		driver.close();
	
	}
}
