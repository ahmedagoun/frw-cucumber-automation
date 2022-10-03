package com.e2etests.automation.step_difinitions;
import org.junit.Assert;
import com.e2etests.automation.page_object.RagisterPage;
import com.e2etests.automation.utils.Setup;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
public class RagisterStepDefinition {
	
	private RagisterPage ragisterPage;
	
	public RagisterStepDefinition() {
		this.ragisterPage = new RagisterPage();
	}

	@Given("Je me connecte sur l application Register")
	public void jeMeConnecteSurLApplicationRegister() {
		ragisterPage.goToUrl();

	}

	@When("Je rempli le champ First Name {string}")
	public void jeRempliLeChampFirstName(String name) {
		ragisterPage.fillFirstName(name);
		

	}

	@When("Je rempli le champ Last Name {string}")
	public void jeRempliLeChampLastName(String name) {
		ragisterPage.filllastName(name);

	}

	@When("Je rempli le champ Phone {string}")
	public void jeRempliLeChampPhone(String name) {
		ragisterPage.fillPhone(name);

	}

	@When("Je rempli le champ Email {string}")
	public void jeRempliLeChampEmail(String name) {
		ragisterPage.fillEmail(name);

	}

	@When("Je rempli le champ Address {string}")
	public void jeRempliLeChampAddress(String name) {
		ragisterPage.fillAddress1(name);

	}

	@When("Je rempli le champ City {string}")
	public void jeRempliLeChampCity(String name) {
		ragisterPage.fillCity(name);

	}

	@When("Je rempli le champ State {string}")
	public void jeRempliLeChampStateProvince(String name) {
		ragisterPage.fillState(name);
		

	}

	@When("Je rempli le champ Postal Code {string}")
	public void jeRempliLeChampPostalCode(String name) {
		ragisterPage.fillPostalCode(name);

	}

	@When("Je rempli le champ Country {string}")
	public void jeRempliLeChampCountry(String name) {
		ragisterPage.selectCountry(name);

	}

	@When("Je rempli le champ User Name {string}")
	public void jeRempliLeChampUserName(String name) {
		ragisterPage.fillUserName(name);

	}

	@When("Je rempli le champ Password {string}")
	public void jeRempliLeChampPassword(String name) {
		ragisterPage.fillPassword(name);

	}

	@When("Je rempli le champ Confirm Password {string}")
	public void jeRempliLeChampConfirmPassword(String name) {
		ragisterPage.fillConfirmPassword(name);

	}

	@When("Je clique sur le bouton Envoyer")
	public void jeCliqueSurLeBoutonEnvoyer() {
		ragisterPage.clickOnBottonSubmit();

	}

	@Then("Je me redirige vers la page {string}")
	public void jeMeRedirigeVersLaPage(String text) {
		
	Assert.assertEquals(Setup.getDriver().getCurrentUrl(), text);


	}

}
