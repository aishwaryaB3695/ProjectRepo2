package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class ExchangePage extends TestBase {
	
	public ExchangePage() 
	 {
	 PageFactory.initElements(driver, this);
	 }
	 
	 @FindBy(xpath ="//a[@class='active nav-link']")
	 private WebElement click_Buy; 
	 
	 @FindBy(xpath="//label[@for='btnradio1']")
	 private WebElement orderDur;
	 
	 @FindBy(xpath="//label[@for='btnradio3']")
	 private WebElement order_Price;
	 
	 @FindBy(xpath="(//input[@class='form-control'])[3]")
	 private WebElement quantity;  

	 @FindBy(xpath="(//button[@type='button'])[3]")
	 private WebElement btn_Submit; 
	 
	 public void clickOnBuy()
	 {
		 click_Buy.click();
	 }
	 public void orderduration()
	 {
	    orderDur.isSelected();
	 }
	 public void orderPrice()
	 {
		 order_Price.isSelected();
	 }
	 public void quantity()
	 {
		 quantity.sendKeys("5");

	 }
	 public void btn_Submit()
	 {
		 btn_Submit.click();
	 }

}
