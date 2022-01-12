package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class AfterConfirmingPage {

	
	public AfterConfirmingPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
		
	}
	
	@FindBy(css = ".navigation_page")
	private WebElement OrderConfirmationField;

	public WebElement getOrderConfirmationField() {
		return OrderConfirmationField;
	}
	
}
