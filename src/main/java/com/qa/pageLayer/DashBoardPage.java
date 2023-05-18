package com.qa.pageLayer;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import com.qa.testBase.TestBase;

public class DashBoardPage extends TestBase{

	public DashBoardPage() {
		PageFactory.initElements(driver, this);
    }
      @FindBy(xpath = "(//input[@type='text'])[1]")
       private WebElement txt_search;
      
      @FindBy(linkText = "WIPRO")
      private WebElement lnk_company_wipro;
   
      public void enterText(String txt)
  	{
  	      txt_search.sendKeys(txt);
  	}
      public void clickOnLinkWipro()
		{
		   lnk_company_wipro.click();
		}
}
