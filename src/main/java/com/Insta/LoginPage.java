package com.Insta;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class LoginPage {
	
	
	@FindBy(xpath = "//input[@id='email']")
	WebElement email;

	@FindBy(xpath = "//input[@id='pass']")
	WebElement password;
	
	
	@FindBy(xpath = "//button[@id='u_0_5_/o']")
	WebElement Login;
	
	@FindBy(xpath = "//a[normalize-space()='Forgotten password?']")
	WebElement forgotPassword;
	
	@FindBy(xpath = "//a[@id='u_0_0_UW']")
	WebElement CreateNewAccount;
	
	WebDriver driver;
	 
	public void setUserName(String username) 
	{
		email.clear();
		email.sendKeys(username);
		
	}
	
	public LoginPage(WebDriver driver) {
		super();
		this.driver = driver;
		
		PageFactory.initElements(driver, this);	
		
	}

	public void setPassword(String pass) 
	{
		password.clear();
		password.sendKeys(pass);
		
	}
	
	
	public void clicklogin()
	{
		Login.click();
	}
	public void textForgotPassword()
	{
		String forgot=forgotPassword.getText();
		System.out.println(forgot);
	}
	public void clickForgotPassword() {
		forgotPassword.click();
	}
	
	
	public void clickCreateNewAccount()
	{
	    CreateNewAccount.click();
	}
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
	
}
