package seleniumcommandsHOMEWORK;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

  public class nestedframe {
	
	 public static void main(String[] args) {
		
		WebDriver driver=new ChromeDriver();
		
	    driver.get("https://the-internet.herokuapp.com/nested_frames");
	    
	    WebElement TF=driver.findElement(By.xpath("//frame[@name='frame-top']"));
	    driver.switchTo().frame(TF);
	    
	    WebElement LF=driver.findElement(By.xpath("//frame[@name='frame-left"));
	    driver.switchTo().frame(LF);

	    WebElement ToFM=driver.findElement(By.xpath("//frame[@name='frame-left"));
	    System.out.println(ToFM.getText());
	    
	    WebElement MF=driver.findElement(By.xpath("//frame[@name='frame-middle']"));
	    driver.switchTo().frame(MF);
	    WebElement mif=driver.findElement(By.xpath("//frame[@name='frame-middle"));
	    System.out.println(mif.getText());
	    
	     driver.switchTo().parentFrame();
	     
	     WebElement Rf=driver.findElement(By.xpath("//frame[@name='frame-right"));
	     driver.switchTo().frame(Rf);
	     WebElement Rof=driver.findElement(By.xpath("//frame[@name='frame-right"));
	     System.out.println(Rof.getText());
	    driver.switchTo().parentFrame();
	    
	    WebElement bt=driver.findElement(By.xpath("//frame[@name='frame-bottam"));
	    driver.switchTo().frame(bt);
	    
	    driver.switchTo().defaultContent();
	    
	    
	    
	    
		

}
}