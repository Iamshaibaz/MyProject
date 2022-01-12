package testScripts;




import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.automationPractice.GenericUtility.BaseClass;
import com.automationPractice.GenericUtility.WebDriverUtility;
import com.automationPractice.popRepository.AfterConfirmingPage;
import com.automationPractice.popRepository.CreateAccountPage;
import com.automationPractice.popRepository.DressesPage;
import com.automationPractice.popRepository.HomePage;
import com.automationPractice.popRepository.OrderAddressPage;
import com.automationPractice.popRepository.OrderConfirmPage;
import com.automationPractice.popRepository.PaymentOrderPage;
import com.automationPractice.popRepository.ShippingAddressPage;
import com.automationPractice.popRepository.SignInPage;
import com.automationPractice.popRepository.SummaryPage;
import com.automationPractice.popRepository.TshirtsPage;

public class Tc extends BaseClass
{
	@Test 
	public void tc() throws Throwable 
	{
		
		
		//This is our home page we stored here two elemetns dresses and tshirts Btns;
		HomePage HmPg = new HomePage(driver);
		HmPg.getDressesBtn().click();
		
		//After clicking DressBtn we get dress page 
		DressesPage DsPg = new DressesPage(driver);
		DsPg.mouseHoverDressImg();
		DsPg.scrollAndaddToCardDress();
	
		//DsPg.getAddToCartDress().click();
		
		DsPg.getAddTOCartDressImg();
		//after selecting dress here iam closing popUp
		DsPg.getDrssClsBtn().click();
		
		//Here using Homepage obj so that i can navigate to tshirt page
		
		DsPg.gettShirtBtn().click();
		
		//Here Calling Tshirt class so that we can use obj of this class and navigate
		TshirtsPage TsPg = new TshirtsPage(driver);
		TsPg.mouseHoverTshirtImg();
		TsPg.getTshirtToCartBtn().click();
		TsPg.getTshirtProceedToCheckoutBtn().click();   //after selecting the tshirt Proceeding for checkout
		
		
		//Calling summary page and proceeding
		SummaryPage SmPg = new SummaryPage(driver);
		SmPg.getSummaryPgProceedChkOutBtn().click();
		
		//Callig signinPage class 
		SignInPage SnPg = new SignInPage(driver);
		
		String emailTxtData = eLib.getExelData("Sheet1", 1, 3);
		SnPg.sendEmailTxt(emailTxtData);
		SnPg.getCreateAccountBtn().click();    //clicking on create account
		
		//calling CreateAccountPage
		
		CreateAccountPage CaPg = new CreateAccountPage(driver);
		CaPg.getMrRadioBtn().click();  //selecting MR radio button
		
		//fetching data for first name and last name from excel test data
		String firstName = eLib.getExelData("Sheet1",1 ,1 );
		String lastName = eLib.getExelData("Sheet1",1 ,2);
		String password = eLib.getExelData("Sheet1",1 ,4);
		String address1 = eLib.getExelData("Sheet1",1 ,5);
		String companyTxt = eLib.getExelData("Sheet1", 1, 13);
		
		String city = eLib.getExelData("Sheet1",1 ,7 );
		String postalCode = eLib.getExelData("Sheet1", 1, 8);
		CaPg.selectState();
		String MobileText = eLib.getExelData("Sheet1", 1, 11);
		String aliasText = eLib.getExelData("Sheet1", 1, 12);
		CaPg.sendingCustomerDetails(firstName, lastName, password, companyTxt, address1, city, postalCode, MobileText, aliasText);
		
		CaPg.getRegisterBtn().click(); //Registrating the new account
		
		OrderAddressPage orderAdrsPg = new OrderAddressPage(driver);
		orderAdrsPg.getProceedToCheckoutBtn().click();
		//calling shipping address page and clicking check and proceed to checkout button
		ShippingAddressPage shipAdresPg = new ShippingAddressPage(driver);
		shipAdresPg.getTermsOfServicesCheckbox().click();
		shipAdresPg.getProceedToCheckOut().click();
		
		
		//calling payment selecting payment method 
		PaymentOrderPage paymentOrdrPg = new PaymentOrderPage(driver);
		paymentOrdrPg.getPayByBankWireBtn().click();
		
		//calling confirm order page to confirm order page
		OrderConfirmPage orderConfrmPg = new OrderConfirmPage(driver);
		orderConfrmPg.getConfirmOrderBtn().click();
		//ORDER CONFIRMATION and also asserting
		String expected3 = "Order confirmation";
		
		//Order confirmation
		AfterConfirmingPage afterConfirmPg = new AfterConfirmingPage(driver);
		String actual3 = afterConfirmPg.getOrderConfirmationField().getText();
		Assert.assertEquals(actual3, expected3);
	
		
		
		
		
		
	}

}
