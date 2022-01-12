package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	
	public HomePage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(xpath = "//header/div[3]/div[1]/div[1]/div[6]/ul[1]/li[2]/a[1]")
	private WebElement DressesBtn;
	
	@FindBy (css = "li[class='sfHoverForce sfHover'] a[title='T-shirts']")
	private WebElement tShirtBtn;

	public WebElement getDressesBtn() {
		return DressesBtn;
	}

	public WebElement gettShirtBtn() {
		return tShirtBtn;
	}
	
	

	
	

}
