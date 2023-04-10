package selinumlocators;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class DropDown 
{public static void main(String[] args) {
	   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	  WebDriverManager.chromedriver().setup();
	   WebDriver driver=new ChromeDriver();
	   driver.get("https://www.facebook.com/reg");
	  WebElement wb= driver.findElement(By.id("day"));
	  Select sel=new Select(wb);
	  sel.selectByIndex(1);
	 WebElement w= sel.getFirstSelectedOption();
	 System.out.println(w.getText());
	 WebElement wb1=driver.findElement(By.id("month"));
	 Select sel1=new Select(wb1);
	 sel1.selectByValue("8");
	 WebElement w1=sel1.getFirstSelectedOption();
	 System.out.println(w1.getText());
	 WebElement wb2=driver.findElement(By.id("year"));
	 Select sel2=new Select(wb2);
	 sel2.selectByVisibleText("1999");
	 WebElement wb3=sel2.getFirstSelectedOption();
	 System.out.println(wb3.getText());

}}
