package guddi;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class frame {

	public static void main(String[] args) throws InterruptedException {
//		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.selenium.dev/selenium/docs/api/java/index.html?overview-summary.html");
		//driver.switchTo().frame(2);
		//driver.findElement(By.linkText("org.openqa.selenium")).click();
		//driver.switchTo().frame(1);
		//driver.findElement(By.linkText("Action")).click();
		//we are switching frame 3https://www.facebook.com/reg
				driver.switchTo().frame("classFrame");
				Thread.sleep(4000);
				driver.findElement(By.linkText("org.openqa.selenium.chromium")).click();
				
				Thread.sleep(4000);
				//switch to top frame
				driver.switchTo().defaultContent();
				driver.navigate().refresh();
				
				Thread.sleep(4000);
				//switch to frame 1 
				WebElement wb =driver.findElement(By.xpath("//iframe[@title='All Packages']"));
				
				driver.switchTo().frame(wb);
				driver.findElement(By.linkText("org.openqa.selenium.devtools")).click();
	}

}
