package ActionClass;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

import io.github.bonigarcia.wdm.WebDriverManager;

public class PerformRightClick {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://prafpawar11.github.io/");
		WebElement wb = driver.findElement(By.linkText("Right Click"));
//		WebElement wb = driver.findElement(By.name("btnK"));
		Actions act= new Actions(driver);
		act.contextClick(wb).build().perform();
		

	}
}
