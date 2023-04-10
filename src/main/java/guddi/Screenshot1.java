package guddi;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Screenshot1 {

	public static void main(String[] args) throws IOException {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.get("https://www.amazon.in/");
		TakesScreenshot ts =(TakesScreenshot)driver;
		File f =ts.getScreenshotAs(OutputType.FILE);
		File dist=new File("D:\\Auto\\Silanium\\Xpath.photo\\screen\\v21.png");
		FileUtils.copyFile(f,dist);
		System.out.println("Screenshot capture");
		driver.manage().window().minimize();
		driver.close();
		

	
	}
}
