package SeleniumData;

import java.util.List;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

public class UtilsClass extends BaseClass{

	public static void checkBox(List<WebElement> ls) {

		for (WebElement abc : ls) {
			abc.click();
			System.out.println(abc.isSelected());
		}
	}

	public static void captureAndclear(WebElement wb) {
		String ab = wb.getAttribute("value");
		System.out.println(ab);
		wb.clear();
	}
	
	public static void frameSwitch(String frame) {
		driver.switchTo().frame(frame);
		
	}
	
	public static void dropDownoperation(WebElement wb) {
		Select sel = new Select(wb);
		sel.selectByValue("7");
		
		System.out.println(sel.getFirstSelectedOption().getText());

		for (WebElement abcd : sel.getOptions()) {
			System.out.println("All Dp Value is " + abcd.getText());
		}
	}
	
}
