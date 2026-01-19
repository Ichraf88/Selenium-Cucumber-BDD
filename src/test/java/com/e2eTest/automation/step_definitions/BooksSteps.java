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
	

	@When("Je choisi le livre souhaité")
	public void jeChoisiLeLivreSouhaité() throws InterruptedException {
	
		
		waitUtils.waitForElementToBeVisible(BooksPage.getBooksComputer(), 10) ;
	
		
		
		actionsUtils.click(BooksPage.getBooksComputer());
	}
	
	@When("Je clique sur Add to cart")
	public void jeCliqueSurAddToCart() throws InterruptedException {
		Thread.sleep(2000);
	   actionsUtils.click(BooksPage.getAddCart());
	}
	
	@Then("le message de validation apparait Validation message {string}")
	public void leMessageDeValidationApparaitValidationMessage(String message) {
	   validations.assertEquals(BooksPage.getValidationMsg(), message);
	}
	
	@Then("Je clique ShoppingCarte")
	public void jeCliqueShoppingCarte() {
	    
	}
	
	@Then("Je selectionne le paye {string}")
	public void jeSelectionneLePaye(String string) {
	  
	}
	
	@Then("je selectionne la province {string}")
	public void jeSelectionneLaProvince(String string) {
	   
	}
	
	@Then("Je coche {string}")
	public void jeCoche(String string) {
	   
	}
	
	@Then("Je selectionne mon adresse")
	public void jeSelectionneMonAdresse() {
	    
	}
	
	@Then("Je clique sur continue")
	public void jeCliqueSurContinue() {
	   
	}
	
	@Then("La page du paiement apparait Paiement {string}")
	public void laPageDuPaiementApparaitPaiement(String string) {
	    
	}







}
