package Class10;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class S1 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/auth/login");
		driver.findElement(By.name("username")).sendKeys("Admin");
		driver.findElement(By.name("password")).sendKeys("admin123");
		driver.findElement(By.xpath("//button[@type=\"submit\"]")).click();
		Thread.sleep(5000);
		String title = driver.getTitle();
		System.out.println(title);
		driver.findElement(By.xpath("//span[text()=\"PIM\"]")).click();
		driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[1]")).sendKeys("Akshay");
//		driver.findElement(By.xpath("(//input[@placeholder=\"Type for hints...\"])[2]")).sendKeys("Nishant");
		driver.findElement(By.xpath("(//input[@class=\"oxd-input oxd-input--active\"])[2]")).sendKeys("4563");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
//		WebElement wb = driver.findElement(By.xpath("(//div[@class=\"oxd-select-text-input\"])[1]"));
//		Select sl = new Select(wb);
//		WebElement fso = sl.getFirstSelectedOption();
//		String txt = fso.getText();
//		System.out.println(txt);
		System.out.println("TC---------------");
		WebElement jt = driver.findElement(By.className("oxd-select-wrapper"));
		Select ti = new Select(jt);
		List<WebElement> ls = ti.getOptions();
		System.out.println(ls.size());
		for (WebElement c : ls) {
			String at = c.getText();
			System.out.println(at);

		}

	}
}
