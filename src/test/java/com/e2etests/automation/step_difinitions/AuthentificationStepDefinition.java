package com.e2etests.automation.step_difinitions;

import org.junit.Assert;

import com.e2etests.automation.page_object.AuthentificationPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class AuthentificationStepDefinition {

	
	private AuthentificationPage authentificationPage;

	public AuthentificationStepDefinition() {
		this.authentificationPage = new AuthentificationPage();
		
	}

	@Given("Je me connecte sur le site Mercury")
	public void jeMeConnecteSurLeSiteMercury() {
		authentificationPage.goToUrl();

	}

	@When("Je sais le user name {string}")
	public void jeSaisLeUserName(String name) {
		authentificationPage.fillUserName(name);

	}

	@When("Je sais le mot de passe {string}")
	public void jeSaisLeMotDePasse(String password) {
		authentificationPage.fillPassword(password);

	}

	@When("Je clique sur le bouton subbmit")
	public void jeCliqueSurLeBoutonSubbmit() {
		authentificationPage.clickOnBottonSubmit();

	}

	@Then("Je me redirige vers la page home {string}")
	public void jeMeRedirigeVersLaPageHome(String text) {
		String message = AuthentificationPage.welcomeMessage.getText();
		Assert.assertEquals(text, message);

	}

}
