package testcases;

import java.io.IOException;

import org.testng.annotations.Test;

import pageobjectmodel.homepageobject;
import pageobjectmodel.loginpageobject;
import resources.BaseClass;
import resources.CommanMethods;
import resources.Storedata;

public class verifyLogintestcases extends BaseClass {

	@Test(priority = 1)
	public void verifyLoginWithValidData() throws IOException, InterruptedException {

		homepageobject hp = new homepageobject(driver);
		CommanMethods.handleExplictWait(10, hp.clickOnmyAccount(), driver);

		hp.clickOnmyAccount().click();
		hp.clickOnlogin().click();

		loginpageobject lp = new loginpageobject(driver);

		lp.enterEmail().sendKeys(emailAddress);
		lp.enterpassword().sendKeys(Storedata.password);
		lp.clickonsubmit().click();

		Thread.sleep(3000);
		
		String actual = driver.getCurrentUrl();
		String expected =  "https://naveenautomationlabs.com/opencart/index.php?route=account/account";

		CommanMethods.handleAssertion(actual, expected);
		Thread.sleep(3000);
		
		hp.clickOnmyAccount().click();
		lp.ClickOnLogout().click();

		String actualWarningText = lp.getlogoutConfirmationText1().getText();
		String expectedWarningText =Storedata.logOutExpectedConfirmationtext;

		CommanMethods.handleAssertion(actualWarningText, expectedWarningText);

	}

	@Test(priority = 2)
	public void verifyLoginWithInValidData() throws IOException, InterruptedException {

		homepageobject hp = new homepageobject(driver);
		CommanMethods.handleExplictWait(10, hp.clickOnmyAccount(), driver);

		hp.clickOnmyAccount().click();
		hp.clickOnlogin().click();

		loginpageobject lp = new loginpageobject(driver);

		lp.enterEmail().sendKeys(emailAddress);
		lp.enterpassword().sendKeys(Storedata.incorrectpassword);
		lp.clickonsubmit().click();

		CommanMethods.handleExplictWait(15, lp.waringText(), driver);

		String actual = lp.waringText().getText();
		String expected = Storedata.loginFailedExpectedText;

		CommanMethods.handleAssertion(actual, expected);

	}
}