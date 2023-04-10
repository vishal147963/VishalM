package ScreenShot;

import java.io.File;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class D11 {
	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		SimpleDateFormat d = new SimpleDateFormat("ddmmyyy");
		String date = d.format(new Date());
		File l = new File("D:\\Auto\\Silanium\\Xpath.photo\\screen\\" + date + ".png");
		FileUtils.copyFile(f, l);
		driver.navigate().to("https://www.redbus.in/");
		driver.navigate().back();
		driver.close();

	}
}
