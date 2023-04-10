package PraticeofVishal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class HandleDropOnAllMethod {
public static void main(String[] args) {
//	System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	WebDriverManager.chromedriver().setup();
	WebDriver driver= new ChromeDriver();
	driver.get("https://www.facebook.com/reg");
	WebElement wb= driver.findElement(By.xpath("//select[@id=\"month\"]"));
	Select sel= new Select(wb);
    WebElement b=sel.getFirstSelectedOption();
	String a=b.getText();
	System.out.println(a);
	List<WebElement> ls=sel.getOptions();
	for (WebElement x:ls)
	{String c=x.getText();
	System.out.println(c);
	if (c.contains("Sept"))
	{
		System.out.println("TC is pass");
	}
	}
	List<WebElement>ab=sel.getOptions();
	int z=ab.size();
	System.out.println(z);
	
//driver.close();
}

}
