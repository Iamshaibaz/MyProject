package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.support.PageFactory;

public class CheckPaymentPage {
	public CheckPaymentPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

}
