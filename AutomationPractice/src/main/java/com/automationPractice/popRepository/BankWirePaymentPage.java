package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class BankWirePaymentPage {

	public BankWirePaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "button[class='button btn btn-default button-medium']")
	private WebElement BankWireIConfirmOrder;
}
