package Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D12 {
public static void main(String[] args) {
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/reg");
	WebElement wb = driver.findElement(By.xpath("//select[@id=\"day\"]"));
	Select sl= new Select(wb);
	WebElement fso = sl.getFirstSelectedOption();
	String text = fso.getText();
	System.out.println(text);
	List<WebElement> list = sl.getOptions();
	int i = list.size();
	System.out.println(i);
	for(WebElement a:list)
	{String text2 = a.getText();
	System.out.println(text2);}
	driver.close();



}
}
