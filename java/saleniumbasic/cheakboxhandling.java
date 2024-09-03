package saleniumbasic;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class cheakboxhandling {

	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();

		driver.get("https://rahulshettyacademy.com/AutomationPractice/");

		// Single select
		WebElement a = driver.findElement(By.xpath("//input[@id='checkBoxOption1']"));
		a.click();
		a.click();

		// checkbox ,radiobox or buttons methods

		System.out.println(a.isDisplayed()); // true
		System.out.println(a.isEnabled()); // true
		System.out.println(a.isSelected()); // true

		// multiple checkbox selecttion -

		List<WebElement> b = driver.findElements(By.xpath("//input[@type='checkbox']"));

		System.out.println(b.size()); // 3

		// using for loop

		/*
		 * for( int i=0;i<b.size();i++) { b.get(i).click(); }
		 */

		// using for each loop

		for (WebElement k : b) {
			k.click();
		}

		// alternate select --

		// 0 2
		for (int i = 0; i < b.size(); i = i + 2) {
			b.get(i).click();
		}

		// HW -- use the odd even logic and select alterate chekbox

	}

}
