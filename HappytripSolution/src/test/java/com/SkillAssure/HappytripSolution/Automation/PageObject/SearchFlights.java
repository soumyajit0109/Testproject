package com.SkillAssure.HappytripSolution.Automation.PageObject;

public class SearchFlights extends BasePage {
	
	WebElement signIn;
	WebElement logInAsAdmin;
	WebElement register;
	//methods
	public void clickSignIn()
	{
		signIn.click();
	}
	public void clickLogInAsAdmin()
	{
		logInAsAdmin.click();
	}
	public void  clickRegister()
	{
		register.click();
	}
	public SearchFlights(WebDriver driver) {
		super(driver);
		PageFactory.initElement
	}
}
