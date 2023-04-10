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

public class Assi1 {
public static WebDriver driver;
	public static void main(String[] args) throws IOException, InterruptedException {
			System.setProperty("webdriver.chrome.driver",
					"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");

			driver = new ChromeDriver();
			driver.get("http://127.0.0.1:5500/windowhandlemain.html");

			String parent = driver.getWindowHandle();
			WebElement username = driver.findElement(By.id("name"));
			Assi1.captureValue(username, "demo", "Page Object Model");
			Assi1.takeScreenshot("html1code");
			Thread.sleep(5000);
			driver.findElement(By.linkText("Facebook register")).click();

			Set<String> allwindow = driver.getWindowHandles();

			for (String abc : allwindow) {
				if (!abc.equals(parent)) {
					driver.switchTo().window(abc);
					WebElement day = driver.findElement(By.id("day"));
					Assi1.selectDpValue(day, "10");

					WebElement month = driver.findElement(By.id("month"));
					Assi1.selectDpValue(month, "Aug");

					WebElement year = driver.findElement(By.id("year"));
					Assi1.selectDpValue(year, "2010");

					Assi1.takeScreenshot("facebook");
				}
			}
			
			Thread.sleep(5000);
			driver.switchTo().window(parent);
			WebElement password = driver.findElement(By.id("pass"));

			Assi1.captureValue(password, "demo1", "Jenkins");

			Assi1.takeScreenshot("html2code");
			
			Thread.sleep(5000);
			driver.quit();
		}

		public static void selectDpValue(WebElement wb, String value) {
			Select sel = new Select(wb);
			sel.selectByVisibleText(value);
			String a = sel.getFirstSelectedOption().getText();
			System.out.println(a);
		}

		public static void captureValue(WebElement wb, String xpath, String value) {
			wb.sendKeys(value);
			driver.findElement(By.xpath("//*[text()='Login']")).click();
			String b = driver.findElement(By.id(xpath)).getText();
			System.out.println(b);
		}

		public static void takeScreenshot(String filepath) throws IOException {
			TakesScreenshot ts = (TakesScreenshot) driver;
			File f = ts.getScreenshotAs(OutputType.FILE);

			FileUtils.copyFile(f, new File("C:\\Users\\praf0\\Desktop\\March Automation Batch\\" + filepath + ".png"));
		}
	}


