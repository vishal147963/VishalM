package AllSeleninumQuestion;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropDown {
	public static void main(String[] args) {
		WebDriverManager.chromedriver().setup();
		WebDriver driver = new ChromeDriver();
		driver.manage().deleteAllCookies();
		driver.manage().window().maximize();
		driver.get("https://www.facebook.com/reg");
		driver.manage().window().minimize();
		WebElement wb = driver.findElement(By.xpath("//select[@id=\"year\"]"));
		Select sl = new Select(wb);
		
		
		sl.selectByValue("1998");
		WebElement gfs = sl.getFirstSelectedOption();
		String text = gfs.getText();
		System.out.println("First selected option is" +text);
		List<WebElement> ls = sl.getOptions();
		for(WebElement a:ls) {
			String text2 = a.getText();
			if(text2.contains("1989"))
			{
				System.out.println("Tc Passed");
			}
		}
		
		
		driver.close();

	}
}
