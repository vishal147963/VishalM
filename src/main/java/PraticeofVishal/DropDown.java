package PraticeofVishal;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class DropDown {

	public static void main(String[] args) {
		   System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("https://www.facebook.com/reg");
		   WebElement wb=driver.findElement(By.id("year"));
		   Select sel=new Select(wb);
		   List<WebElement> ls=sel.getOptions();
		   System.out.println(ls.size());
		   for(WebElement abc:ls)
			 
		   {
			   String g=abc.getText();
			   System.out.println(g);
			   if(g.contains("2010"))
			   {
				   System.out.println("tc is pass");
			   }
			   
		   }
          //sel.selectByValue("2010");
}}
	
