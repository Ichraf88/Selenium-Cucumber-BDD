package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class NewsLetterPage extends BasePage {


	/*
	 * Retrieve Web element 
	 */

	@FindBy(how = How.ID , using = "newsletter-email")
	private static WebElement newLetterPageField ;
	

	@FindBy(how = How.ID , using = "newsletter-subscribe-button")
	private static WebElement subsribeButton ;
	
	@FindBy(how = How.ID , using = "newsletter-result-block")
	private static WebElement subsribeResult ;

	public NewsLetterPage() {
		super(Setup.getDriver());
	}
	
	public static WebElement getNewLetterPageField() {
		return newLetterPageField;
	}
	
	public static WebElement getSubsribeButton() {
		return subsribeButton;
	}
	
	public static WebElement getSubsribeResult() {
		return subsribeResult;
	}
	
}
