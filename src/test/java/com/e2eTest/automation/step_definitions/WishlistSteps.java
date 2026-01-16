package com.e2eTest.automation.step_definitions;

import com.e2eTest.automation.page_objects.WishlistPage;
import com.e2eTest.automation.utils.ActionsUtils;
import com.e2eTest.automation.utils.ConfigFileReader;
import com.e2eTest.automation.utils.Validations;

import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class WishlistSteps {

	WishlistPage wishlist = new WishlistPage();
	ConfigFileReader configFileReader = new ConfigFileReader();
	ActionsUtils actionsUtils = new ActionsUtils();
	Validations validations = new Validations();

	@When("Je clique sur le bouton wishlist")
	public void jeCliqueSurLeBoutonWishlist() {
		actionsUtils.click(WishlistPage.getWishlistButton());
	}

	@Then("Je me redirige vers la page wishlist {string}")
	public void jeMeRedirigeVersLaPageWishlist(String wishlist) throws InterruptedException {

		Thread.sleep(5000); // a verifier avec Zied comment la faire
		validations.assertEquals(WishlistPage.getWishlistVideResult(), wishlist);

	}



} 
