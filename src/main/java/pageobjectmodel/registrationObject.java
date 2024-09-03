package pageobjectmodel;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class registrationObject {

	public WebDriver driver;

	private By Firstname = By.xpath("//input[@name='firstname']");
	private By Lastname = By.xpath("//input[@name='lastname']");
	private By email = By.xpath("//input[@name='email']");
	private By telephone = By.xpath("//input[@name='telephone']");
	private By password = By.xpath("//input[@name='password']");
	private By passwordconfirm = By.xpath("//input[@name='confirm']");
	private By privacypolicy = By.xpath("//input[@name='agree']");
	private By Continue = By.xpath("//input[@value='Continue']");
	private By registerationConfirmationText = By.xpath("//h1[text()='Your Account Has Been Created!']");
	private By FirstnameErrorText = By.xpath("(//div[@class='text-danger'])[1]");
	private By LastnameErrorText = By.xpath("(//div[@class='text-danger'])[2]");
	private By emailErrorText = By.xpath("(//div[@class='text-danger'])[3]");
	private By telephoneErrorText = By.xpath("(//div[@class='text-danger'])[4]");
	private By passwordErrorText = By.xpath("(//div[@class='text-danger'])[5]");

	// constructor use
	public registrationObject(WebDriver driver) {
		this.driver = driver;

	}

	public WebElement EnterFirstname() {

		return driver.findElement(Firstname);

	}

	public WebElement EnterLastname() {

		return driver.findElement(Lastname);
	}

	public WebElement EnterEmail() {

		return driver.findElement(email);
	}

	public WebElement EnterTelephone() {

		return driver.findElement(telephone);

	}

	public WebElement EnterPassward() {

		return driver.findElement(password);

	}

	public WebElement passwordconfirm() {

		return driver.findElement(passwordconfirm);

	}

	public WebElement privacyPolicy() {

		return driver.findElement(privacypolicy);

	}

	public WebElement Continue() {

		return driver.findElement(Continue);

	}

	public WebElement getregisterationConfirmationText() {

		return driver.findElement(registerationConfirmationText);

	}

	public WebElement getfirstnameErrorText() {
		return driver.findElement(FirstnameErrorText);

	}

	public WebElement getLasttnameErrorText() {
		return driver.findElement(LastnameErrorText);
	}

	public WebElement getEmailnameErrorText() {
		return driver.findElement(emailErrorText);

	}

	public WebElement gettelephoneErrorText() {
		return driver.findElement(telephoneErrorText);

	}

	public WebElement getpaswordErrorText() {

		return driver.findElement(passwordErrorText);
	}

}
