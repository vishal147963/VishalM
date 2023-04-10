import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class PraticeDemo {

	public static void main(String[] args) {
	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver= new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
	JavascriptExecutor js =(JavascriptExecutor)driver;
	js.executeScript("document.getELementById('textUsername').value='Admin';");
	js.executeScript("document.getElementBy('txt')");
	
}
	
}
