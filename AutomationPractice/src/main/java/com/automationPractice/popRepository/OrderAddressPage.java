package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class OrderAddressPage {
	
	public OrderAddressPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//button[@name='processAddress']")
	private WebElement ProceedToCheckoutBtn;

	public WebElement getProceedToCheckoutBtn() {
		return ProceedToCheckoutBtn;
	}
}
