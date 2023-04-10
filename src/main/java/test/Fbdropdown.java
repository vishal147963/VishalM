package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class Fbdropdown {

	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
	    WebDriver driver=new ChromeDriver(); 
		driver.get("https://www.facebook.com/reg");
	      WebElement day=driver.findElement(By.id("day"));
	      Select sel=new Select(day);
	      sel.selectByValue("8");
	      WebElement abc=sel.getFirstSelectedOption();
	      String a=abc.getText();
	      System.out.println(a);
	      //month
	      WebElement month=driver.findElement(By.id("month"));
	      Select selmonth=new Select(month);
	      selmonth.selectByIndex(1);
	      WebElement pqr=selmonth.getFirstSelectedOption();
	      System.out.println(pqr.getText());
	      //year
	      WebElement year=driver.findElement(By.id("month"));
	      Select selyear=new Select(year);
	      selyear.selectByVisibleText("2020");
	      WebElement lmn=selyear.getFirstSelectedOption();
	      System.out.println(lmn.getText());
	      

	}

}
