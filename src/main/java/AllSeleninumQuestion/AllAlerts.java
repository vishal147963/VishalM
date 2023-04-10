package AllSeleninumQuestion;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class AllAlerts {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://the-internet.herokuapp.com/javascript_alerts");
		driver.findElement(By.xpath("//button[@onclick=\"jsConfirm()\"]")).click();
		Alert a = driver.switchTo().alert();
		Thread.sleep(3000);
		System.out.println("Alert text is :" + a.getText());
		a.dismiss();
		Thread.sleep(3000);
		driver.findElement(By.xpath("//button[@onclick=\"jsPrompt()\"]")).click();
		Alert b = driver.switchTo().alert();
		b.sendKeys("TC case is passed");
		Thread.sleep(3000);
		b.accept();
		Thread.sleep(3000);
		driver.manage().window().minimize();
		driver.close();

//driver.findElement(By.xpath("//button[text()='Click for JS Confirm']")).click();
//		Alert pune =driver.switchTo().alert();
//		Thread.sleep(4000);
//		//capture the text
//		System.out.println(pune.getText());
//		//click on cancel button
//		pune.dismiss();
//		String a =driver.findElement(By.id("result")).getText();
//		if(a.contains("Cancel"))
//		{
//			System.out.println("test case is Pass");
//		}
//		else {
//			System.out.println("Test case is fail");
//		}
//		Thread.sleep(4000);
//		driver.quit();

	}
}
