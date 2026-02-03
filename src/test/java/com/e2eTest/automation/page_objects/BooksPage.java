package com.e2eTest.automation.page_objects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import com.e2eTest.automation.utils.BasePage;
import com.e2eTest.automation.utils.Setup;

public class BooksPage extends BasePage{


	@FindBy(how = How.XPATH, using = "//ul[@class='top-menu']//a[normalize-space()='Books']")
	private static WebElement books;

	@FindBy(how = How.XPATH, using = "//h2[@class='product-title']//a[normalize-space()='Computing and Internet']")
	private static WebElement booksComputer;

	@FindBy(how = How.CSS, using = ".price-value-13")
	private static WebElement priceBook;

	@FindBy(how = How.ID, using = "add-to-cart-button-13")
	private static WebElement addCart;


	@FindBy(how = How.XPATH, using = "//p[@class='content']")
	private static WebElement validationMsg;

	@FindBy(how = How.XPATH, using = "//span[normalize-space()='Shopping cart']")
	private static WebElement voirCart;

	@FindBy(how = How.CSS, using = "input[value='6234744']")
	private static WebElement checkBoxAchat;

	@FindBy(how = How.ID, using = "CountryId")
	private static String country;

	@FindBy(how = How.ID, using = "StateProvinceId")
	private static WebElement province;

	@FindBy(how = How.CSS, using = ".checkout-buttons")
	private static WebElement checkoutButton;

	@FindBy(how = How.ID, using = "termsofservice")
	private static WebElement termsOfService;

	@FindBy(how = How.CSS, using = "input[onclick='Billing.save()']")
	private static WebElement billingSave;

	@FindBy(how = How.ID, using = "PickUpInStore")
	private static WebElement pickUpInStore;

	@FindBy(how = How.CSS, using = "input[onclick='Shipping.save()']")
	private static WebElement shippingSave;

	@FindBy(how = How.CSS, using = "li[id='opc-payment_method'] h2")
	private static WebElement paiementMethod;

	
	@FindBy(how = How.CSS, using = "div[id='terms-of-service-warning-box'] p")
	private static WebElement alertText;

	@FindBy(how =How.CSS, using = ".ui-button-icon-primary.ui-icon.ui-icon-closethick")
	private static WebElement fermerAlert;
	
	public BooksPage() {
		super(Setup.getDriver());
	}
	public static WebElement getBooks() {
		return books;
	}

	public static WebElement getBooksComputer() {
		return booksComputer;
	}

	public static WebElement getPriceBook() {
		return priceBook;
	}

	public static WebElement getAddCart() {
		return addCart;	
	}

	public static WebElement getValidationMsg() {
		return validationMsg;
	}

	public static WebElement getVoirCart() {
		return voirCart;
	}

	public static WebElement getCheckBoxAchat() {
		return checkBoxAchat;
	}
	
	public static WebElement getcheckoutButton() {
		return checkoutButton;
	}
	
	public String getCountry() {
		return country;
	}

	public static WebElement getProvince() {
		return province;	
	}

	public static WebElement getCheckout() {
		return checkoutButton;
	}

	public static WebElement getTermsOfService() {
		return termsOfService;
	}
	
	public static WebElement getBillingSave() {
		return billingSave;
	}
	
	public static WebElement getPickUpInStore() {
		return pickUpInStore;
	}
	
	public static WebElement getShippingSave() {
		return shippingSave;
	}
	
	public static WebElement getPaiementMethod() {
		return paiementMethod;
	}
	
	public static WebElement getAlertText1() {
		return alertText;
	}
	
	public static WebElement getfermerAlert() {
		return fermerAlert;
	}
}