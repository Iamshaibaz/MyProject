package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.GenericUtility.BaseClass;

public class TshirtsPage extends BaseClass{
	
	public TshirtsPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}

	@FindBy(xpath= "//span[normalize-space()='Add to cart']")
	private WebElement tshirtToCartBtn;
	
	
	@FindBy(xpath="//img[@src='http://automationpractice.com/img/p/1/1-home_default.jpg']")	
	private WebElement tshirtAddtoCartImg;
	

	@FindBy(css = "a[title='Close']")
	private WebElement TshirtCloseBtn;
	
	@FindBy( css = "a[title='Proceed to checkout']")
	private WebElement TshirtProceedToCheckoutBtn;

	

	
	public WebElement getTshirtAddtoCartImg() {
		return tshirtAddtoCartImg;
	}
	public WebElement getTshirtToCartBtn() {
		return tshirtToCartBtn;
	}
	
	public WebElement getTshirtCloseBtn() {
		return TshirtCloseBtn;
	}
	
	public WebElement getTshirtProceedToCheckoutBtn() {
		return TshirtProceedToCheckoutBtn;
	}
	public void mouseHoverTshirtImg()	
	{
		wLib.mouseHover(driver, tshirtAddtoCartImg);
	}
	
}
