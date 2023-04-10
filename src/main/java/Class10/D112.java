package Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D112 {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		driver.findElement(By.xpath(""))
		WebElement wb = driver.findElement(By.xpath("//div[@id=\"msdd\"]"));
		Select sl= new Select(wb);
		sl.selectByIndex(2);
		driver.close();
		
//		List<WebElement> wb = driver.findElements(By.xpath("//div[@id=\"msdd\"]"));
//		Select sl = new Select(wb);
//		sl.selectByIndex("2");

	}
}
