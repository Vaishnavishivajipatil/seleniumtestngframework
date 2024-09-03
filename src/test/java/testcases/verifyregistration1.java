
package testcases;

import java.io.IOException;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import pageobjectmodel.homepageobject;
import pageobjectmodel.registrationObject;

import resources.BaseClass;
import resources.CommanMethods;
import resources.Storedata;

public class verifyregistration1 extends BaseClass {

	@Test
	public void verifyRegisterationWithValidData() throws IOException, InterruptedException {

		homepageobject ho = new homepageobject(driver);

		CommanMethods.handleExplictWait(10, ho.clickOnmyAccount(), driver);

		ho.clickOnmyAccount().click();
		ho.clickOnRegister().click();

		registrationObject rP = new registrationObject(driver);

		rP.EnterFirstname().sendKeys(Storedata.firstName);
		rP.EnterLastname().sendKeys(Storedata.lastName);
		rP.EnterEmail().sendKeys(emailAddress);
		rP.EnterTelephone().sendKeys(Storedata.telephone);
		rP.EnterPassward().sendKeys(Storedata.password);
		rP.passwordconfirm().sendKeys(Storedata.passwordconfirm1);

		Thread.sleep(2000);
		rP.privacyPolicy().click();
		rP.Continue().click();
		Thread.sleep(2000);

		String actual = rP.getregisterationConfirmationText().getText();
		String expected = Storedata.regExpectedText;

		CommanMethods.handleAssertion(actual, expected);

	}

	
	 @Test public void verifyragisterationblankdata() throws IOException,
	  InterruptedException {
	  
	  homepageobject ho = new homepageobject(driver);
	 
	 CommanMethods.handleExplictWait(10, ho.clickOnmyAccount(), driver);
	  
	  ho.clickOnmyAccount().click(); ho.clickOnRegister().click();
	 
	 registrationObject Rp = new registrationObject(driver);
	 
	  Rp.Continue().click();
	
	  String Firstnameactual = Rp.getfirstnameErrorText().getText(); String
	  Firstnameexpected = Storedata.firstnameErrorExceptedresult;
	  
	 CommanMethods.handleAssertion(Firstnameactual, Firstnameexpected);
	 
	  String Lastnameactual = Rp.getLasttnameErrorText().getText(); String
	  Latnameexpected = Storedata.lastnameErrorExceptedresult;
	  CommanMethods.handleAssertion( Lastnameactual, Latnameexpected);
	  
	  String Eamilactual = Rp.getEmailnameErrorText().getText(); String
	  Emailexpected = Storedata.emailErrorExceptedresult;
	  CommanMethods.handleAssertion( Eamilactual, Emailexpected);
	 
	  String tlephoneactual = Rp.gettelephoneErrorText().getText(); String
	  tlephoneexpected = Storedata.TelephoneErrorExceptedresult;
	 CommanMethods.handleAssertion(tlephoneactual, tlephoneexpected);
	 
	 String passwordactual = Rp.getpaswordErrorText().getText(); String
	 passwordexpected = Storedata.passwordErrorExceptedresult;
	 
	  CommanMethods.handleAssertion(passwordactual,passwordexpected);
	 
	 
	 
	 }
	 
	 
}