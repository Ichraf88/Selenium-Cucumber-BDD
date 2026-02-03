package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.BooksPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;


public class BooksSteps {

	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	BooksPage booksPage = new BooksPage();
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver());
	
	
	@When("Je click sur Books")
	public void jeClickSurBooks() throws InterruptedException {
		actionsUtils.click(BooksPage.getBooks());
		
	}

	@When("Je clique sur le livre souhaité")
	public void jeCliqueSurLeLivreSouhaité() {
		waitUtils.waitForElementToBeVisible(BooksPage.getBooksComputer(), 10) ;
		actionsUtils.click(BooksPage.getBooksComputer());
	}
	
	@Then("les details sur livre apparaissent price {string}")
	public void lesDetailsSurLivreApparaissentPrice(String price) {
		validations.assertEquals(BooksPage.getPriceBook(), price);
	}
	
	@When("Je clique sur Add to car")
	public void jeCliqueSurAddToCar() throws InterruptedException {
		waitUtils.waitForElementToBeVisible(BooksPage.getAddCart(), 10) ;
		   actionsUtils.click(BooksPage.getAddCart());
	}
	
	@Then("le message de validation apparait Validation message {string}")
	public void leMessageDeValidationApparaitValidationMessage(String message) {
		waitUtils.waitForElementToBeVisible(BooksPage.getValidationMsg(), 10) ;
	   validations.assertEquals(BooksPage.getValidationMsg(), message);
	}
	
	
	@When("Je clique ShoppingCarte")
	public void jeCliqueShoppingCarte() throws InterruptedException {
		Thread.sleep(3000);
		  actionsUtils.click(BooksPage.getVoirCart());
	}
	
	
	@When("Je clique sur checkout")
	public void jeCliqueSurCheckout() {
		actionsUtils.click(  BooksPage.getcheckoutButton());
	}
	
	@Then("une alerte avec l'apparition du message MSG {string}")
	public void uneAlerteAvecLApparitionDuMessageMSG(String message) {
		validations.assertEquals(BooksPage.getAlertText1(), message);
	}
	
	@When("j'accpete l'alerte")
	public void jAccpeteLAlerte()  {
		 actionsUtils.click(BooksPage.getfermerAlert());
	}
	
	@When("Je coche accpter les condition")
	public void jeCocheAccpterLesCondition() {
	    
	}
	
	@When("Je choisi l'adresse")
    public void jeChoisiLAdresse() {
	   
	}
	@When("Je clique sur continue")
	public void jeCliqueSurContinue() {
	   
	}

	
	@When("Je choisie la methode de livraison")
	public void jeChoisieLaMethodeDeLivraison() {
	   
	}
	
	@When("Je clique sur conditue")
	public void jeCliqueSurConditue() {
	   
	}
	
	@When("Je coche cash on delivery")
	public void jeCocheCashOnDelivery() {
	    
	}
	
	@Then("le message de validation ValidationFinal {string}")
	public void leMessageDeValidationValidationFinal(String string) {
	
	}






}
