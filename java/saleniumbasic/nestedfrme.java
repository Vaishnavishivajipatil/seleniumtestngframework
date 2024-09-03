package saleniumbasic;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class nestedfrme {
	
	public static void main(String[] args) {

		WebDriver driver = new ChromeDriver();
		driver.get("https://the-internet.herokuapp.com/nested_frames");

		WebElement TF = driver.findElement(By.xpath("//frame[@name='frame-top']"));
		driver.switchTo().frame(TF);

		WebElement LF = driver.findElement(By.xpath("//frame[@name='frame-left']"));
		driver.switchTo().frame(LF);

		WebElement LefText = driver.findElement(By.xpath("//body[contains(text(),'LEFT')]"));
		System.out.println(LefText.getText());

		driver.switchTo().parentFrame(); // one level up

		WebElement MF = driver.findElement(By.xpath("//frame[@name='frame-middle']"));
		driver.switchTo().frame(MF);

		WebElement MiddleText = driver.findElement(By.xpath("//div[contains(text(),'MIDDLE')]"));
		System.out.println(MiddleText.getText());

		driver.switchTo().parentFrame(); // one level up

		WebElement RF = driver.findElement(By.xpath("//frame[@name='frame-right']"));
		driver.switchTo().frame(RF);

		WebElement RightText = driver.findElement(By.xpath("//body[contains(text(),'RIGHT')]"));
		System.out.println(RightText.getText());
		
		driver.switchTo().defaultContent();
		
		WebElement FB = driver.findElement(By.xpath("//frame[@name='frame-bottom']"));
		driver.switchTo().frame(FB);

		WebElement bottomText = driver.findElement(By.xpath("//body[contains(text(),'BOTTOM')]"));
		System.out.println(bottomText.getText());
		
	
	}

}
	
	
	
	
	
	
	
	

