package AllSeleninumQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1 {
	public static void main(String[] args) throws InterruptedException {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/reg");

		boolean a = driver.findElement(By.name("firstname")).isDisplayed();

		System.out.println(a);

		boolean b = driver.findElement(By.name("firstname")).isEnabled();
		System.out.println(b);

		driver.findElement(By.name("firstname")).sendKeys("Anjali");

		Thread.sleep(7000);

		String c = driver.findElement(By.name("firstname")).getAttribute("value");
		System.out.println(c);

		Thread.sleep(5000);

		driver.findElement(By.name("firstname")).clear();

	}
}
