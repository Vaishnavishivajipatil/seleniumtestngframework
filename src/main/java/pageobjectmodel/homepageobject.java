package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class homepageobject {
	


	public WebDriver driver;  // this is null
	
	
	// encapsulation 
    private By myAccount=By.xpath("//a[@title='My Account']");
	private By Register=By.xpath("//a[text()='Register']");
	private By login=By.xpath("//a[text()='Login']");
	
	
	public homepageobject(WebDriver driver) {
	this.driver=driver;
	}

	public WebElement clickOnmyAccount()  {
		
		return driver.findElement(myAccount);
		
	}
	
	public WebElement clickOnlogin() {
	
		return  driver.findElement(login);
	}

	public WebElement clickOnRegister() {
		
		return  driver.findElement(Register);
	}

	

}
	




