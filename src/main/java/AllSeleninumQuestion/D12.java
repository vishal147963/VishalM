package AllSeleninumQuestion;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D12 {
public static void main(String[] args) throws InterruptedException {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://prafpawar11.github.io/basicdemo.html");

	WebElement female = driver.findElement(By.id("female"));

	System.out.println("female radio button displayed is " + female.isDisplayed());// true

	System.out.println("female radio button enabled is " + female.isEnabled());// true

	System.out.println("female radio button selected is  before click " + female.isSelected());// false
	Thread.sleep(5000);

	female.click();

	System.out.println("female radio button selected is  After click " + female.isSelected());// true

	WebElement male = driver.findElement(By.id("male"));

	Thread.sleep(5000);

	male.click();

	System.out.println(female.isSelected());// false
	
	
	driver.manage().window().minimize();
	driver.quit();
}
}
