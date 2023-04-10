package Class10;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

public class Demo8 {
	public static void main(String[] args) {
		// https://demo.automationtesting.in/Register.html
WebDriverManager.chromedriver().setup();		
		WebDriver driver = new ChromeDriver();
		driver.get("https://demo.automationtesting.in/Register.html");
		System.out.println(driver.getTitle());
		driver.findElement(By.xpath("//input[@placeholder='First Name']")).sendKeys("Atul");
		driver.findElement(By.xpath("//input[@placeholder='Last Name']")).sendKeys("Ganbawle");
		driver.findElement(By.xpath("//textarea[@ng-model='Adress']")).sendKeys("Jaysingpur");
		driver.findElement(By.xpath("//input[@type='email']")).sendKeys("atul@gmail.com");
		driver.findElement(By.xpath("//input[@type='tel']")).sendKeys("7038088891");
		driver.findElement(By.xpath("(//input[@type='radio'])")).click();
		driver.findElement(By.xpath("//input[@id='checkbox1']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox2']")).click();
		driver.findElement(By.xpath("//input[@id='checkbox3']")).click();
		Select sel1 = new Select (driver.findElement(By.xpath("//select[@id='Skills']")));
		sel1.selectByValue("Java");
		Select sel2 = new Select (driver.findElement(By.xpath("//select[@id='country']")));
		sel2.selectByValue("India");
//		Select sel3 = new Select(driver.findElement(By.xpath("//div[@id='msdd']")));
		driver.findElement(By.xpath("(//a[@class=\"ui-corner-all\"])[8]")).click();

//		sel3.selectByVisibleText("English");
		//		if(sel3.isMultiple())
//		{
//			sel3.selectByValue("English");
////			sel3.selectByValue("Thai");
//		}
		Select sel4 = new Select (driver.findElement(By.xpath("//select[@placeholder='Year']")));
		sel4.selectByValue("2015");
		Select sel5 = new Select (driver.findElement(By.xpath("(//select[@type='text'])[4]")));
		sel5.selectByVisibleText("February");
		
		Select sel6 = new Select(driver.findElement(By.xpath("//select[@placeholder='Day']")));
		
		sel6.selectByVisibleText("15");
		
		driver.findElement(By.xpath("//input[@id='firstpassword']")).sendKeys("Atul@123");
		
		driver.findElement(By.xpath("//input[@id='secondpassword']")).sendKeys("Atul@123");
		
		driver.findElement(By.xpath("//button[@id='submitbtn']")).click();
		
		
		
		

		
		
		
		
		
		
		
		
		

	}

}
