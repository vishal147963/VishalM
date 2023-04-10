package PraticeofVishal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Frames {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		driver.switchTo().frame(2);
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f=ts.getScreenshotAs(OutputType.FILE);
		File l=new File("D:\\Auto\\Silanium\\Screenshot.sel.png");
		FileUtils.copyFile(f, l);
		System.out.println("screenShot Captured");
//		driver.navigate().back();
		driver.findElement(By.linkText("org.openqa.selenium.chrome")).click();
		TakesScreenshot la= (TakesScreenshot)driver;
		File a=la.getScreenshotAs(OutputType.FILE);
		File b= new File("D:\\Auto\\Silanium\\Xpath.photo\\screen.click.png");
		FileUtils.copyFile(a, b);
		System.out.println("2nd done");
		
		
	}
}
