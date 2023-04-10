package selinumPractice;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class CountMobOnGoogle {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        driver.get("https://www.google.com/");
        driver.findElement(By.xpath("//input[@title=\"Search\"]")).sendKeys("Mobile");
        driver.findElement(By.xpath("//input[@title=\"Search\"]/following::input[3]")).click();
       List<WebElement> wb=driver.findElements(By.xpath("//div[@class=\"mnr-c pla-unit\"]"));
        int l =wb.size();
        System.out.println(l);
        

	}

}


//input[@name='q']/following::input[1]


//div[@class="mnr-c pla-unit"]