package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.NewsLetterPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Setup;
import com.e2eTest.automation.utils.Validations;
import com.e2eTest.automation.utils.WaitUtils;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class NewsLetterSteps {

	NewsLetterPage newsletter = new NewsLetterPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();
	WaitUtils waitUtils = new WaitUtils(Setup.getDriver());

	@When("Je saisis une adresse mail valide")
	public void jeSaisisUneAdresseMailValide() {
		actionsUtils.writeText(NewsLetterPage.getNewLetterPageField(), configFileReader.getProperty("home.email"));
	}

	@When("clique sur Subscribe")
	public void cliqueSurSubscribe() {
		actionsUtils.click(NewsLetterPage.getSubsribeButton());
	}

	@Then("le message suivant doit apparaitre Message {string}")
	public void leMessageSuivantDoitApparaitre(String Message) throws InterruptedException {
		Thread.sleep(3000);
		String rrrrrrrrrrrrrrrr = NewsLetterPage.getSubsribeResult().getText();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + rrrrrrrrrrrrrrrr);
		validations.assertEquals(NewsLetterPage.getSubsribeResult(), Message);

	}

	@When("Je saisis une adresse mail invalide mail {string}")
	public void jeSaisisUneAdresseMailInvalideMail(String mail) {
		actionsUtils.writeText(NewsLetterPage.getNewLetterPageField(), mail);

	}

	@Then("le message suivant doit apparaitre Message1 {string}")
	public void leMessageSuivantDoitApparaitreMessage(String Message1) throws InterruptedException {
		Thread.sleep(3000);
		String xxxxx = NewsLetterPage.geterrorMessage().getText();
		System.out.println("AAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAAA " + xxxxx);
		validations.assertEquals(NewsLetterPage.geterrorMessage(), Message1);

	}

}
