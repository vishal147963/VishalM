package Mock;

import java.io.File;
import java.io.IOException;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Assignment {
	public static void main(String[] args) throws InterruptedException, IOException {

		/*
		 * 1) Open application 2) Enter ur first name 3) Capture screenshot 4) Click on
		 * facebook link 5) add all details first name ,last name,username and password
		 * and DOB and take screenshot 6) come back to main window 7) click on google
		 * link 8) enter the pushpa the rise keyword 9) click on wikipedia link 10)
		 * capture the release date and month and take screenshot
		 */

		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.get("https://prafpawar11.github.io/multiplewindows.html");
		driver.findElement(By.name("fname")).sendKeys("Test");
//	DownCasting
		TakesScreenshot ts = (TakesScreenshot) driver;
		File f = ts.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f, new File("D:\\Auto\\Silanium\\Screenshot\\frame.png"));
		System.out.println("Main Frame Capture");
		Thread.sleep(5000);
		String parent = driver.getWindowHandle();
		driver.findElement(By.linkText("Visit Facebook")).click();
		Set<String> allwindow = driver.getWindowHandles();
//		System.out.println(allwindow.size());
		String a = "";
		for (String ab : allwindow) {
			if (ab != (parent)) {
				a = ab;
			}
			System.out.println(a);
		}
		driver.switchTo().window(a);

//		Set<String> allwindow = driver.getWindowHandles();
//		String b ="";
//		for (String a : allwindow) {
//			if (a!=(parent) ) {
//				b = a;
//			}
////			System.out.println(b);
//		}
//		
//		driver.switchTo().window(b);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"firstname\"]")).sendKeys("USA");
		driver.findElement(By.xpath("//input[@name=\"firstname\"]/following::input[@name=\"lastname\"]"))
				.sendKeys("UK");
		driver.findElement(By.xpath("//input[@name=\"reg_email__\"]")).sendKeys("USA@UK");
		driver.findElement(By.xpath("//input[@type=\"password\"]")).sendKeys("usa1234");
		WebElement day = driver.findElement(By.id("day"));
		Select sl = new Select(day);
		sl.selectByVisibleText("11");

		WebElement month = driver.findElement(By.xpath("//select[@id=\"month\"]"));
		Select m = new Select(month);
		m.selectByVisibleText("Jan");

		WebElement year = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select y = new Select(year);
		y.selectByVisibleText("2000");
		Thread.sleep(5000);
		TakesScreenshot ts1 = (TakesScreenshot) driver;
		File f1 = ts1.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f1, new File("D:\\Auto\\Silanium\\Screenshot\\FBPage.png"));
		System.out.println("FB Capture");
		
		driver.switchTo().window(parent);
		driver.findElement(By.linkText("Visit Google")).click();
		Thread.sleep(5000);
		Set<String> allwindow2 = driver.getWindowHandles();
//		System.out.println(allwindow.size());
		String g = "";
		for (String h : allwindow2) {
			if (h != (parent)) {
				g = h;
			}
			System.out.println(a);
		}
		driver.switchTo().window(g);
		Thread.sleep(5000);
		driver.findElement(By.xpath("//input[@name=\"q\"]")).sendKeys("pushpa the rise");
		Thread.sleep(5000);
		driver.findElement(By.name("btnK")).click();
		Thread.sleep(5000);
//		driver.findElement(By.linkText("Pushpa: The Rise - Wikipedia")).submit();
		driver.findElement(By.partialLinkText("The Rise ")).click();
		Thread.sleep(5000);
//		WebElement wp = driver.findElement(By.xpath("(//div[@class=\"plainlist\"])[4]"));
//		WebElement wp = driver.findElement(By.className("plainlist"));
		WebElement wp = driver.findElement(By.xpath("(//div[@class=\"plainlist\"])[4]"));
		System.out.println("The release date is " + wp.getText());
		TakesScreenshot ts2 = (TakesScreenshot) driver;
		File f2 = ts2.getScreenshotAs(OutputType.FILE);
		FileUtils.copyFile(f2, new File("D:\\Auto\\Silanium\\Screenshot\\Pushpa.png"));
		System.out.println("Phushpa Capture");
	}
}
