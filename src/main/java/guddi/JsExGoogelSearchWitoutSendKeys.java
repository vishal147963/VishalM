package guddi;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;


public class JsExGoogelSearchWitoutSendKeys {

	public static void main(String[] args) {
		
		
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
         JavascriptExecutor js=(JavascriptExecutor)driver;
         js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/index.php/auth/login';");
         WebElement wb=driver.findElement(By.xpath("//input[@name='q']"));
         js.executeScript("arguments[0].value='Selenium';",wb);
         WebElement wb1=driver.findElement(By.xpath("//input[@name=\"q\"]/following::input[3]"));
         js.executeScript("arguments[0].click();",wb1);
	}

}
