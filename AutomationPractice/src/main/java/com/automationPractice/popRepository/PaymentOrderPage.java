package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PaymentOrderPage {
	
	public PaymentOrderPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//a[@title='Pay by bank wire']")	
	private WebElement PayByBankWireBtn;
	
	public WebElement getPayByBankWireBtn() {
		return PayByBankWireBtn;
	}

	public WebElement getPayByCheckBtn() {
		return PayByCheckBtn;
	}

	@FindBy(css = "a.cheque")
	private WebElement PayByCheckBtn;
	
}
