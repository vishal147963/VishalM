package PraticeofVishal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class LinkByAnchorTag {
	public static void main(String[] args) {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.get("https://www.amazon.in/");
//		List<WebElement> wb=driver.findElements(By.tagName("a"));
		List<WebElement> wb = driver.findElements(By.xpath("//a"));
		int size = wb.size();
		System.out.println(size);
		for(WebElement WB:wb)
		{
			
			String text = WB.getText();
			System.out.println(text);
		}
	}

}
