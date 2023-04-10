package Class10;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class D1 {
	public static void main(String[] args) {

//	System.setProperty("webdriver.chrome.driver", "C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		WebDriverManager.chromedriver().setup();
		WebDriver driver= new ChromeDriver();
		
		driver.get("https://www.facebook.com/reg");
		
		driver.findElement(By.name("firstname")).sendKeys("adinath");
		
		driver.findElement(By.name("lastname")).sendKeys("malande");
		
		driver.findElement(By.name("reg_email__")).sendKeys("adimalande777@gmail.com");
		driver.findElement(By.name("reg_passwd__")).sendKeys("adi@777");
		
		WebElement date=driver.findElement(By.id("day"));
		
		Select sel=new Select(date);
		
		List<WebElement> ls=sel.getOptions();
		
		for(WebElement xyz:ls) 
		{
			String a=xyz.getText();
			if(a.equals("10")) 
			{
				sel.selectByVisibleText(a);
			}
		}
		WebElement month=driver.findElement(By.id("month"));
		
		Select z=new Select(month);
		
		List<WebElement> p=z.getOptions();
		
		for(WebElement pqr:p)
		{
			String b=pqr.getText();
			if(b.equals("Jan"))
			{
				System.out.println("Jan month is present");
			}
		}
		WebElement year=driver.findElement(By.id("year"));
		
		Select q=new Select(year);
		List<WebElement> m=q.getOptions();
		
		
		for(WebElement abc:m)
		{
			String c=abc.getText();
			if(c.equals("1996"))
			{
				q.selectByVisibleText(c);
			}
		}
		
		
	}
	}

