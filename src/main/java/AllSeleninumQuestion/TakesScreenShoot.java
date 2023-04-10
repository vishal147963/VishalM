package AllSeleninumQuestion;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class TakesScreenShoot {
	public static void main(String[] args) throws IOException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
//		driver.manage().deleteAllCookies();
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		TakesScreenshot ts =(TakesScreenshot)driver;
		FileUtils.copyDirectory(ts.getScreenshotAs(OutputType.FILE),new File(""));
		
		
//		File f = ts.getScreenshotAs(OutputType.FILE);
//		File l =new File("path");
//		FileUtils.copyFile(f, l);
		
	
		

	}
}
