package guddi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorAlertPop {

	public static void main(String[] args) throws InterruptedException {
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	JavascriptExecutor js=(JavascriptExecutor)driver;
	js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/index.php/dashboard';");
	js.executeScript("document.getElementById('txtUsername').value='Admin';");
	js.executeScript("document.getElementById('txtPassword').value='admin123';");
	js.executeScript("document.getElementById('btnLogin').click();");
	js.executeScript("alert('User is on HomePage');");
	Thread.sleep(5000);
	Alert act=driver.switchTo().alert();
	String a=act.getText();
	System.out.println(a);
	if(a.contains("Home"))
			{
		       System.out.println("tc is pass");
			}
	act.accept();
	js.executeScript("return document title;").toString();	}
	

}
