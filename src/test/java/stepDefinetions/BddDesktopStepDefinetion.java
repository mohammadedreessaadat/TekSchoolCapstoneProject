package stepDefinetions;

import java.util.List;
import java.util.Map;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BddTekDesktopPageObj;

import utilities.WebDriverUtility;

public class BddDesktopStepDefinetion extends Base {

	BddTekDesktopPageObj defenitionObj = new BddTekDesktopPageObj();

	@Given("^User is on Retail website$")
	public void user_is_on_Retail_website() throws Throwable {

		Base.initializeDriver();
		logger.info("Retail page is opened");
		WebDriverUtility.wait(1000);
		WebDriverUtility.screenShot();
	}

	@When("^User Click on Desktops tab$")
	public void user_Click_on_Desktops_tab() throws Throwable {
		defenitionObj.clickOnDesktoTab();
		logger.info("User clicks on the descktop tab");
	}

	@When("^User click on Show all desktops$")
	public void user_click_on_Show_all_desktops() throws Throwable {
		defenitionObj.clickOnShowAllDesktops();
		logger.info("User clicks on show all descktop");
		WebDriverUtility.wait(1000);
	}

	@Then("^User should see all items are present in Desktop page$")
	public void user_should_see_all_items_are_present_in_Desktop_page() throws Throwable {
		logger.info("User sees all items are present in Desktop page");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

	@When("^User click ADD TO CART option on 'HP LP(\\d+)' item$")
	public void user_click_ADD_TO_CART_option_on_HP_LP_item(int arg1) throws Throwable {
		defenitionObj.clickOnAddToCartHPOption();
		logger.info("User click ADD TO CART option on 'HP LP3065' item");
	}

	@When("^User select quantity (\\d+)$")
	public void user_select_quantity(int arg1) throws Throwable {
		defenitionObj.selectHPQuantity();
		logger.info("User select quantity");
		WebDriverUtility.wait(1000);
	}

	@When("^User click add to Cart button$")
	public void user_click_add_to_Cart_button() throws Throwable {
		defenitionObj.clickOnHPAddToCartButton();
		logger.info("User click add to Cart button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message 'Success: you have added HP LP (\\d+) to your Shopping cart!'$")
	public void user_should_see_a_message_Success_you_have_added_HP_LP_to_your_Shopping_cart(int arg1)
			throws Throwable {

		logger.info("User should sees the message 'Success: you have added HP LP");
		WebDriverUtility.screenShot();

	}

	@When("^User click ADD TO CART option on 'Canon EOS (\\d+)D' item$")
	public void user_click_ADD_TO_CART_option_on_Canon_EOS_D_item(int arg1) throws Throwable {
		defenitionObj.clickOnAddToCartCanonOption();
		logger.info("ser click ADD TO CART option on 'Canon EOS");
	}

	@When("^User select color from dropdown 'Red'$")
	public void user_select_color_from_dropdown_Red() throws Throwable {
		defenitionObj.selectRedFromDropDown();
		logger.info("User select color from dropdown 'Red'");
		WebDriverUtility.screenShot();

	}

	@When("^User select quuantity (\\d+)$")
	public void user_select_quuantity(int arg1) throws Throwable {
		defenitionObj.selectQuantityCanon();
		logger.info("User select quantity");
		WebDriverUtility.wait(1000);
	}

	@When("^User click add too Cart button$")
	public void user_click_add_too_Cart_button() throws Throwable {
		defenitionObj.clickOnAddToCartCanonButton();
		logger.info("User click add to Cart Canon button");
		WebDriverUtility.screenShot();
	}

	@Then("^User should see a message 'Succes: You have added Canon EOS (\\d+)d to your shopping cart'$")
	public void user_should_see_a_message_Succes_You_have_added_Canon_EOS_d_to_your_shopping_cart(int arg1)
			throws Throwable {
		logger.info("User sees a message 'Succes: You have added Canon EOS");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

	@When("^User click on Canon EOS (\\d+)D item$")
	public void user_click_on_Canon_EOS_D_item(int arg1) throws Throwable {
		defenitionObj.clickOnCanonEOS5D();
		logger.info("User click on Canon EOS 5D item");

	}

	@When("^User click on write a review link$")
	public void user_click_on_write_a_review_link() throws Throwable {
		defenitionObj.writeAReview();
		logger.info("User click on write a review link");
		WebDriverUtility.wait(1000);

	}

	@When("^user fill the review information with below information$")
	public void user_fill_the_review_information_with_below_information(DataTable Info) throws Throwable {
		List<Map<String, String>> data = Info.asMaps(String.class, String.class);

		defenitionObj.yourName(data.get(0).get("yourName"));
		defenitionObj.yourReview(data.get(0).get("yourReview"));
		defenitionObj.ClickingonBadRatingCheckBox();
		logger.info("user fills the review information with below information");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

	@When("^User click on Continue Button$")
	public void user_click_on_Continue_Button() throws Throwable {
		defenitionObj.ClickOnContinueButton();
		logger.info("User click on Continue Button");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);
	}

	@Then("^User should see a message with 'Thank you for your review\\. It has been submitted to the webmaster for approval'$")
	public void user_should_see_a_message_with_Thank_you_for_your_review_It_has_been_submitted_to_the_webmaster_for_approval()
			throws Throwable {

		Assert.assertTrue(true);
		WebDriverUtility.screenShot();
		logger.info(
				"User should see a message with 'Thank you for your review. It has been submitted to the webmaster for approval");
		WebDriverUtility.wait(2000);

	}
}
