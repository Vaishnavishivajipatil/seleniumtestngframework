package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class loginpageobject {

	public WebDriver driver;

	private By email = By.xpath("//input[@name='email']");
	private By password = By.xpath("//input[@name='password']");
	private By submit = By.xpath("//a[text()='Login']");
	
	private By logout = By.xpath("(//a[text()='Logout'])[1]");
	private By logoutConfirmationText = By.xpath("//h1[text()='Account Logout']");

	private By waringMassage = By.xpath("//div[text()='Waring:No match for E-mail Address and /or password.']");

	public loginpageobject(WebDriver driver) {
		this.driver = driver;
	}


	public WebElement enterEmail() {
		return driver.findElement(email);

	}

	public WebElement enterpassword() {
		return driver.findElement(password);

	}

	public WebElement clickonsubmit() {
		return driver.findElement(submit);

	}

	

	public WebElement waringText() {
		return driver.findElement(waringMassage);

	}

	public WebElement ClickOnLogout() {
		return driver.findElement(logout);

	}

	public WebElement getlogoutConfirmationText1() {
		return driver.findElement(logoutConfirmationText);

	}

}