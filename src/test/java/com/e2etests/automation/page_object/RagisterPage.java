package com.e2etests.automation.page_object;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.e2etests.automation.utils.ConfigFileReader;
import com.e2etests.automation.utils.Setup;

public class RagisterPage {
	private ConfigFileReader configFileReader;

	/* @FindBy */
	@FindBy(how = How.NAME, using = "firstName")
	public static WebElement firstName;
	@FindBy(how = How.NAME, using = "lastName")
	public static WebElement lastName;
	@FindBy(how = How.NAME, using = "phone")
	public static WebElement phone;
	@FindBy(how = How.NAME, using = "userName")
	public static WebElement email;
	@FindBy(how = How.NAME, using = "address1")
	public static WebElement address1;
	@FindBy(how = How.NAME, using = "city")
	public static WebElement city;
	@FindBy(how = How.NAME, using = "state")
	public static WebElement state;
	@FindBy(how = How.NAME, using = "postalCode")
	public static WebElement postalCode;
	
	@FindBy(how = How.NAME, using = "country")
	public static WebElement country;
	
	@FindBy(how = How.NAME, using = "email")
	public static WebElement userName;
	@FindBy(how = How.NAME, using = "password")
	public static WebElement password;
	@FindBy(how = How.NAME, using = "confirmPassword")
	public static WebElement confirmPassword;
	@FindBy(how = How.NAME, using = "submit")
	public static WebElement btnSubmit;
	@FindBy(how = How.PARTIAL_LINK_TEXT, using = "Note: Your user name is ")
	public static WebElement registerMessage;

	public RagisterPage() {
		PageFactory.initElements(Setup.driver, this);
		this.configFileReader = new ConfigFileReader();
	}

	/* Create method */
	public void goToUrl() {
		Setup.driver.get(configFileReader.getProperties("register.url"));
	}

	public void fillFirstName(String name) {
		firstName.sendKeys(name);
	}

	public void filllastName(String name) {
		lastName.sendKeys(name);
	}

	public void fillPhone(String name) {
		phone.sendKeys(name);
	}

	public void fillUserName(String name) {
		userName.sendKeys(name);
	}

	public void fillAddress1(String name) {
		address1.sendKeys(name);
	}

	public void fillCity(String name) {
		city.sendKeys(name);

	}

	public void fillState(String name) {
		state.sendKeys(name);

	}

	public void fillPostalCode(String name) {
		postalCode.sendKeys(name);

	}
	
	public void selectCountry(String contry) {
	    Select select = new Select(country);
	    select.selectByValue(contry);
	    }

	public void fillEmail(String name) {
		email.sendKeys(name);

	}

	public void fillPassword(String name) {
		password.sendKeys(name);

	}

	public void fillConfirmPassword(String name) {
		confirmPassword.sendKeys(name);

	}

	public void clickOnBottonSubmit() {
		btnSubmit.click();
	}
}
