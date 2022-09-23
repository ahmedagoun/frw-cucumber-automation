package com.e2etests.automation.step_difinitions;

import com.e2etests.automation.page_object.AuthentificationPage;
import com.e2etests.automation.page_object.RagisterPage;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class RagisterStepDefinition {
	
	private RagisterPage ragisterPage;
	
	public RagisterStepDefinition() {
		this.ragisterPage = new RagisterPage();
	}

	@Given("Je me connecte sur l application Mercury")
	public void jeMeConnecteSurLApplicationMercury() {
		ragisterPage.goToUrl();

	}

	@When("Je rempli le champ First Name {string}")
	public void jeRempliLeChampFirstName() {

	}

	@When("Je rempli le champ Last Name {string}")
	public void jeRempliLeChampLastName() {

	}

	@When("Je rempli le champ Phone {string}")
	public void jeRempliLeChampPhone() {

	}

	@When("Je rempli le champ Email {string}")
	public void jeRempliLeChampEmail() {

	}

	@When("Je rempli le champ Address {string}")
	public void jeRempliLeChampAddress() {

	}

	@When("Je rempli le champ City {string}")
	public void jeRempliLeChampCity() {

	}

	@When("Je rempli le champ State\\/Province {string}")
	public void jeRempliLeChampStateProvince() {

	}

	@When("Je rempli le champ Postal Code {string}")
	public void jeRempliLeChampPostalCode() {

	}

	@When("Je rempli le champ Country {string}")
	public void jeRempliLeChampCountry() {

	}

	@When("Je rempli le champ User Name {string}")
	public void jeRempliLeChampUserName() {

	}

	@When("Je rempli le champ Password {string}")
	public void jeRempliLeChampPassword() {

	}

	@When("Je rempli le champ Confirm Password {string}")
	public void jeRempliLeChampConfirmPassword() {

	}

	@When("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {

	}

	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String string) {

	}

}
