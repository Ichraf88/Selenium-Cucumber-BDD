package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.NewsLetterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsLetterSteps {
	
	NewsLetterPage newsletter = new NewsLetterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	
	@Given("J'accede au site Web Demo Shop")
	public void jAccedeAuSiteWebDemoShop() {
		Setup.getDriver().get(configFileReader.getProperty("home.url"));
	}
	
	
	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		actionsUtils.writeText(NewsLetterPage.getNewLetterPageField(), configFileReader.getProperty("home.email"));
	}
	
	
	@When("clique sur Subscribe")
	public void cliqueSurSubscribe() {	
		actionsUtils.click(NewsLetterPage.getSubsribeButton());
	}
	
	
	@Then("le message suivant doit apparaitre {string}")
	public void leMessageSuivantDoitApparaitre(String result) throws InterruptedException {
		Thread.sleep(3000); // a verifier avec Zied comment la faire
		validations.assertEquals(NewsLetterPage.getSubsribeResult(), result);
				
	}



}
