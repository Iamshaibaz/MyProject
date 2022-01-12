package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.GenericUtility.BaseClass;

public class SignInPage extends BaseClass {
	
	public SignInPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	@FindBy(css = "#email_create")
	private WebElement emailTxt;
	
	@FindBy(css = "button[id='SubmitCreate']")
	private WebElement CreateAccountBtn;

	public WebElement getEmailTxt() {
		return emailTxt;
	}

	public WebElement getCreateAccountBtn() {
		return CreateAccountBtn;
	}
	
	
	public void sendEmailTxt(String emailTxtData)	
	{
		
		emailTxt.sendKeys(emailTxtData+jLib.getRandomData());
	}
	
}
