package guddi;

import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutorAlertPopCP {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver",
				"C:\\\\Users\\\\Vishal\\\\Downloads\\\\chromedriver_win32 (2)\\\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		JavascriptExecutor js =(JavascriptExecutor)driver;
		
		js.executeScript("window.location='https://opensource-demo.orangehrmlive.com/index.php/auth/login';");
		
		js.executeScript("document.getElementById('txtUsername').value='Admin';");
		
		js.executeScript("document.getElementById('txtPassword').value='admin123';");
		
		js.executeScript("document.getElementById('btnLogin').click();");
		
		//generate the alert pop
		js.executeScript("alert('User is On Home Page');");
		Thread.sleep(5000);
		
		Alert act =driver.switchTo().alert();
		
		String a =act.getText();
		
		if(a.contains("Home"))
		{
			System.out.println("User is on Home Page");
		}
		else {
			System.out.println("User is not a home page");
		}
		
		act.accept();
		
		//capture title
		String abc=js.executeScript("return document.title;").toString();
		
		System.out.println(abc);
		
		//captture the url
		String ab=js.executeScript("return document.URL;").toString();
		
		System.out.println(ab);
		
		//refresh the web page.
		js.executeScript("history.go(0);");
		

		
	}

}
