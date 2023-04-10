package guddi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class jsExecuterScrollDownToElement {

	public static void main(String[] args) {
		//span[text()='International top sellers']
//		System.setProperty("webdriver.chrome.driver","C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");
		WebDriverManager.chromiumdriver().setup();
		WebDriver driver=new ChromeDriver();
		driver.get("https://www.amazon.com/");
		JavascriptExecutor js=(JavascriptExecutor)driver;
		WebElement wb=driver.findElement(By.xpath("//span[text()='Popular products in Wireless internationally']"));
		//WebElement wb = driver.findElement(By.xpath("//span[text()='Top Sellers in Books for you']"));

		js.executeScript("arguments[0].scrollIntoView(true);", wb);
		
	}

}
