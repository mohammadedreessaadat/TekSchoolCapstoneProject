package stepDefinetions;

import org.junit.Assert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;

import core.Base;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BddTekDesktopPageObj;
import pageObjects.BddTekLapTopPageObj;

import utilities.WebDriverUtility;

public class BddTekLapTopStepDefinetion extends Base {

	BddTekDesktopPageObj defenitionObj = new BddTekDesktopPageObj();

	BddTekLapTopPageObj LapTopPO = new BddTekLapTopPageObj();

	@When("^User click on Laptop & NoteBook tab$")
	public void user_click_on_Laptop_NoteBook_tab() throws Throwable {

		LapTopPO.clickOnLaptopAndNoteBookTab();
		logger.info(" User clicked on Laptop & Note book tab");

	}

	@When("^User click on Show all Laptop &NoteBook option$")
	public void user_click_on_Show_all_Laptop_NoteBook_option() throws Throwable {
		LapTopPO.clickOnShowAllLaptopAndNoteBook();
		logger.info("User click on Show all Laptop &NoteBook option");
		WebDriverUtility.wait(1000);

	}

	@When("^User click on MacBook item$")
	public void user_click_on_MacBook_item() throws Throwable {
		LapTopPO.clickOnMackBookItem();
		logger.info(" User click on MacBook item");
		WebDriverUtility.wait(1000);
	}

	@Then("^User should see a message ‘Success: You have added MacBook to your shopping cart!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_to_your_shopping_cart() throws Throwable {
		logger.info("User should sees the message 'Success: You have added MacBook to your shopping cart");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

	@Then("^User should see ‘(\\d+) tem\\(s\\)-(\\d+)\\.(\\d+)’ showed to the cart$")
	public void user_should_see_tem_s_showed_to_the_cart(int arg1, int arg2, int arg3) throws Throwable {

		logger.info("User should see ‘1 tem(s)-602.00’ showed to the cart");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(2000);

	}

	@Then("^User click on cart option$")
	public void user_click_on_cart_option() throws Throwable {
		LapTopPO.clickOnCartOption();
		logger.info("User click on cart option");
	}

	@Then("^user click on red X button to remove the item from cart$")
	public void user_click_on_red_X_button_to_remove_the_item_from_cart() throws Throwable {
		LapTopPO.clickOnRedXButton();
		logger.info("user click on red X button to remove the item from cart");
		WebDriverUtility.screenShot();

	}

	@Then("^item should be removed and cart should show ‘(\\d+) item\\(s\\)’$")
	public void item_should_be_removed_and_cart_should_show_item_s(int arg1) throws Throwable {
		WebElement cartTotal = driver.findElement(By.xpath("//span[@id ='cart-total']"));
		WebDriverUtility.screenShot();
		logger.info("item should be removed and cart should show ‘0 item(s)’");
		WebDriverUtility.wait(1000);

	}

	@When("^User click on product comparison icon on ‘MacBook’$")
	public void user_click_on_product_comparison_icon_on_MacBook() throws Throwable {
		LapTopPO.clickOnComparisonMacBookIcon();
		logger.info("User click on product comparison icon on MacBook");
	}

	@When("^User click on product comparison icon on ‘MacBook Air$")
	public void user_click_on_product_comparison_icon_on_MacBook_Air() throws Throwable {
		LapTopPO.clickOnComparisonMacBookAirIcon();
		logger.info("User click on product comparison icon on MacBook Air");
	}

	@Then("^User should see a message ‘Success: You have added MacBook Air to your product comparison!’$")
	public void user_should_see_a_message_Success_You_have_added_MacBook_Air_to_your_product_comparison()
			throws Throwable {
		logger.info(" User should see a message ‘Success: You have added MacBook Air to your product comparison");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

	@Then("^User click on Product comparison link$")
	public void user_click_on_Product_comparison_link() throws Throwable {
		LapTopPO.clickOnProductComparisonLink();
		logger.info(" User click on Product comparison link");
	}

	@Then("^User should see Product Comparison Chart$")
	public void user_should_see_Product_Comparison_Chart() throws Throwable {
		logger.info(" User should see Product Comparison Chart");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);
	}

	@When("^User click on heart icon to add ‘Sony VaIO’ laptop to wish list$")
	public void user_click_on_heart_icon_to_add_Sony_VaIO_laptop_to_wish_list() throws Throwable {
		LapTopPO.clickOnheartIconSonyVaio();
		logger.info(" User click on heart icon to add ‘Sony VaIO’ laptop to wish list ");
		WebDriverUtility.wait(1000);
	}

	@Then("^User should get a message ‘You must login or create an account to save Sony VAIO to your wish list!’$")
	public void user_should_get_a_message_You_must_login_or_create_an_account_to_save_Sony_VAIO_to_your_wish_list()
			throws Throwable {

		WebDriverUtility.wait(1000);
		WebDriverUtility.screenShot();

	}

	@When("^User click on ‘MacBook Pro’ item$")
	public void user_click_on_MacBook_Pro_item() throws Throwable {
		LapTopPO.clickOnmacBookProItem();
		logger.info("User click on ‘MacBook Pro’ item ");
		WebDriverUtility.screenShot();

	}

	@Then("^User should see ‘\\$(\\d+),(\\d+)\\.(\\d+)’ price tag is present on UI\\.$")
	public void user_should_see_$_price_tag_is_present_on_UI(int arg1, int arg2, int arg3) throws Throwable {

		logger.info(" User should see ‘$2,000.00’ price tag is present on UI");
		WebDriverUtility.screenShot();
		WebDriverUtility.wait(1000);

	}

}
