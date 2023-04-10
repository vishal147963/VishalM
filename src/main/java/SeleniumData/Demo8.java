package SeleniumData;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

public class Demo8 extends BaseClass{
public static void main(String[] args) {
	BaseClass.initlization();
	WebElement name = driver.findElement(By.id("name"));
	name.sendKeys("Selenium Testing");
	UtilsClass.frameSwitch("mainframe");
	WebElement address = driver.findElement(By.id("add"));
	address.sendKeys("Pune MH");
	UtilsClass.frameSwitch("child1");
	List<WebElement> ls = driver.findElements(By.xpath("//input[@type='checkbox']"));
	UtilsClass.checkBox(ls);// select all check box
	UtilsClass.frameSwitch("child2");
	WebElement coursename = driver.findElement(By.id("course"));
	UtilsClass.dropDownoperation(coursename);
	driver.switchTo().parentFrame();
	UtilsClass.checkBox(ls);//unselect all check box
	driver.switchTo().parentFrame();
	UtilsClass.captureAndclear(address);
	driver.switchTo().defaultContent();
	UtilsClass.captureAndclear(name);
}
}
