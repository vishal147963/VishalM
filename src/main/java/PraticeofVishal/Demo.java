package PraticeofVishal;

import java.io.File;
import java.io.IOException;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo {
public static void main(String[] args) throws IOException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
WebDriver driver= new ChromeDriver();
driver.get("");
String a=driver.getWindowHandle();
System.out.println(a);
TakesScreenshot ts = (TakesScreenshot)driver;
File f=ts.getScreenshotAs(OutputType.FILE);
File g= new File("D:\\Auto\\Silanium\\Xpath.photo\\screen\\27sep.png");
FileUtils.copyFile(f, f);
System.out.println("Screen shot taken");


}}