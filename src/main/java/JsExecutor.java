import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class JsExecutor {
	public static void main(String[] args) {
	
System.setProperty("webdriver.chrome.driver","C:\\Users\\Vishal\\Downloads\\chromedriver_win32 (2)\\chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.get("https://opensource-demo.orangehrmlive.com/index.php/dashboard");
JavascriptExecutor js=(JavascriptExecutor)driver;
js.executeScript("document.getElementById('txtUsername').value='Admin';");
js.executeScript("document.getElementById('txtPassword').value='admin123';");
js.executeScript("document.getElementById('btnLogin').click();");
String a=js.executeScript("return document.title;").toString();
System.out.println(a);
String b=js.executeScript("return document.URL;").toString();
System.out.println(b);




	}

}
