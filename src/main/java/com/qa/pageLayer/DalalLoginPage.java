package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DalalLoginPage extends TestBase {
	
	public DalalLoginPage(){
	        PageFactory.initElements(driver, this);
	    }
	@FindBy(xpath = "//input[@name='email']")
	private WebElement txt_email;
	
	@FindBy(xpath = "//input[@name='password']")
	private WebElement txt_pass;
	
	@FindBy(xpath = "//button[@type='submit']")
	private WebElement btn_logIn; 
	
	public void enterEmail(String email)
	{
	txt_email.sendKeys(email);
	}
	
	public void enterPassword(String pass)
	{
	txt_pass.sendKeys(pass);
	}
	
	public void clickOnLogIn()
	{
	btn_logIn.click();
	}
	
	public String getTitle()
	{
	String title = driver.getTitle();
	return title;
	} 
}
