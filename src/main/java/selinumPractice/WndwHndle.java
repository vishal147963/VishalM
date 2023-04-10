package selinumPractice;

import java.util.List;
import java.util.Set;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class WndwHndle {

	public static void main(String[] args) {

		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
		   WebDriver driver=new ChromeDriver();
		   driver.get("file:///D:/Auto/Silanium/HTMLCode%20New%20Student/New%20folder/multiplewindow.html");
		   String parent=driver.getWindowHandle();
		   System.out.println(parent);
		   driver.findElement(By.linkText("Facebook register"));
		   Set<String>s=driver.getWindowHandles();
		   System.out.println(s.size());
		   System.out.println("===========");
		   for(String abc:s)
		   {
			   if(!(abc.equals(parent)))
				   driver.switchTo().window(abc);
			   WebElement wb=driver.findElement(By.xpath("//select[@id=\"month\"]"));
			   Select sel=new Select(wb);
			   sel.selectByVisibleText("june");
			   List<WebElement> ls=sel.getOptions();
			   System.out.println(ls.size());
			   for(WebElement pqr:ls)
			   {
		           System.out.println(pqr.getText());
			   }


	}

} }
