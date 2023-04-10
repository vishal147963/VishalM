package selinumPractice;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class RedwithScrnsht {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        WebElement  wb=driver.findElement(By.xpath("//a[@href=\"https://mail.google.com/mail/&ogbl\"]"));
        JavascriptExecutor js=(JavascriptExecutor)driver;
        js.executeScript("arguments[0].style.border='3px solid red';", wb);
        
        //js.executeScript("arguments[0].style.border='3px solid red';", wb);
        
        TakesScreenshot ts=(TakesScreenshot)driver;
        File f=ts.getScreenshotAs(OutputType.FILE);
        FileUtils.copyFile(f, new File("D:/Auto/Java/Java Script/scrnsht/abc.png"));
        

	

}}
//a[@href="https://mail.google.com/mail/&ogbl"]