package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SummaryPage {
	
	public SummaryPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	
	@FindBy(css = "a[class='button btn btn-default standard-checkout button-medium']")
	private WebElement SummaryPgProceedChkOutBtn;
	@FindBy(xpath = "tr[id='product_4_16_0_621386'] p[class='product-name']")
	private WebElement PrintedDressText;
	public WebElement getPrintedDressText() {
		return PrintedDressText;
	}


	@FindBy(css = "tr[id='product_1_1_0_621386'] p[class='product-name']")
	private WebElement fadedshotsleevText;
	public WebElement getSummaryPgProceedChkOutBtn() {
		return SummaryPgProceedChkOutBtn;
	}
	public WebElement getFadedshotsleevText() {
		return fadedshotsleevText;
	}
	
	
}
