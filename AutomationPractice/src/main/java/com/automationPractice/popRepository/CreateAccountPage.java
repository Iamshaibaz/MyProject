package com.automationPractice.popRepository;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.automationPractice.GenericUtility.WebDriverUtility;

public class CreateAccountPage extends WebDriverUtility {
	
	public CreateAccountPage(WebDriver driver)
	{
		PageFactory.initElements(driver, this);
	}
	
	@FindBy(css = "#id_gender1")
	private WebElement MrRadioBtn;
	
	@FindBy(css = "#id_gender2")
	private WebElement MsRadioBtn;
	
	

	@FindBy(css = "#customer_firstname")
	private WebElement CustomerFirstNameTxt;
	
	@FindBy(css = "#customer_lastname")
	private WebElement CustomerLastNameTxt;
	
	@FindBy(css = "#passwd")
	private WebElement passwordTxt;
	
	
	
	@FindBy(css = "#company")
	private WebElement CompanyTxt;
	
	@FindBy(css = "#address1")
	private WebElement AddressTxt;
	
	@FindBy(css = "#address2")
	private WebElement 	AddressTxt2;
	
	@FindBy(css = "#city")
	private WebElement CityTxt;
	
	@FindBy(css = "#id_state")
	private WebElement StateSelectDrpDwn;
	
	
	@FindBy(css = "#postcode")
	private WebElement PostcodeTxt;
	
	@FindBy(css = "#id_country")
	private WebElement CountrySelectDrpDwn;
	
	

	@FindBy(css = "#other")
	private WebElement AddtionalInfoTxt;
	
	@FindBy(css = "#phone")
	private WebElement HomePhoneTxt;
	
	@FindBy(css = "#phone_mobile")
	private WebElement MobilePhoneTxt;
	
	@FindBy(css = "#alias")
	private WebElement AliasAddressTxt;
	
	@FindBy(css = "button[id='submitAccount']")
	private WebElement RegisterBtn;

	public WebElement getMrRadioBtn() {
		return MrRadioBtn;
	}
	public WebElement getMsRadioBtn() {
		return MsRadioBtn;
	}
	public WebElement getCustomerFirstNameTxt() {
		return CustomerFirstNameTxt;
	}

	public WebElement getCustomerLastNameTxt() {
		return CustomerLastNameTxt;
	}

	public WebElement getPasswordTxt() {
		return passwordTxt;
	}

	public WebElement getCompanyTxt() {
		return CompanyTxt;
	}

	public WebElement getAddressTxt() {
		return AddressTxt;
	}

	public WebElement getAddressTxt2() {
		return AddressTxt2;
	}

	public WebElement getCityTxt(String city) {
		return CityTxt;
	}
	public WebElement getStateSelectDrpDwn() {
		return StateSelectDrpDwn;
	}


	public WebElement getPostcodeTxt() {
		return PostcodeTxt;
	}
	public WebElement getCountrySelectDrpDwn() {
		return CountrySelectDrpDwn;
	}
	public WebElement getAddtionalInfoTxt() {
		return AddtionalInfoTxt;
	}

	public WebElement getHomePhoneTxt() {
		return HomePhoneTxt;
	}

	public WebElement getMobilePhoneTxt() {
		return MobilePhoneTxt;
	}

	public WebElement getAliasAddressTxt() {
		return AliasAddressTxt;
	}

	public WebElement getRegisterBtn() {
		return RegisterBtn;
	}
	

	public void sendingCustomerDetails(String firstName,String lastName,String password,String companyTxt,String address1,String city,String postalCode,String MobileText,String aliasText)
	{
		CustomerFirstNameTxt.sendKeys(firstName);
		CustomerLastNameTxt.sendKeys(lastName);
		passwordTxt.sendKeys(password);
		CompanyTxt.sendKeys(companyTxt);
		AddressTxt.sendKeys(address1);
		CityTxt.sendKeys(city);
		PostcodeTxt.sendKeys(postalCode);
		MobilePhoneTxt.sendKeys(MobileText);
		AliasAddressTxt.sendKeys(aliasText);
		
		
		
		
		
	}
	
	
	
	public void selectState()
	{
		getStateSelectDrpDwn().click();
		SelectOption(StateSelectDrpDwn, 3);
	}
	
	public void selectCountry()
	{
		getCountrySelectDrpDwn().click();
		SelectOption(CountrySelectDrpDwn, 2);
	}
	
	
	

}
