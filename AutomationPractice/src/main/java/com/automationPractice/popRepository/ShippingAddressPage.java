package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class ShippingAddressPage {
	
	public ShippingAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#cgv")
	private WebElement TermsOfServicesCheckbox;
	
	
	@FindBy(css = "button[name='processCarrier']")
	private WebElement ProceedToCheckOut;


	public WebElement getTermsOfServicesCheckbox() {
		return TermsOfServicesCheckbox;
	}


	public WebElement getProceedToCheckOut() {
		return ProceedToCheckOut;
	}
	

}
