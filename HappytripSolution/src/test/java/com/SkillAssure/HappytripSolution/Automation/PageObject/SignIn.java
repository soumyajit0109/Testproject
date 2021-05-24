package com.SkillAssure.HappytripSolution.Automation.PageObject;

public class SignIn extends BasePage {
	
	
	WebElement userName;
	WebElement password;
	WebElement signInButton;
	public void provideUserName(String userName)
	{
		this.userName.sendKeys(userName);
	}
	public void providePassword(String password)
	{
		this.password.sendKeys(password);
	}
	public void clickSignInButton()
	{
		signInButton.click();
	}

}
