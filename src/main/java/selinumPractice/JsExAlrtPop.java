package selinumPractice;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExAlrtPop {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32\\chromedriver.exe");
        WebDriver driver=new ChromeDriver();
        JavascriptExecutor js= (JavascriptExecutor)driver;
        js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/index.php/auth/login';");
        js.executeScript("document.getElementById('txtUsername').value='Admin';");
        js.executeScript("document.getElementById('txtPassword').value='admin123';");
        js.executeScript("document.getElementById('btnLogin').click();");
	  js.executeScript("alert('user on home page');");
          Alert alt=	  driver.switchTo().alert();
          
          String a=alt.getText();
          if(a.contains("home"))
          {
        	  System.out.println("tc is pass");
          }
          else
          {
        	  System.out.println("tc is fail");
          }
          alt.accept();
	}

}
