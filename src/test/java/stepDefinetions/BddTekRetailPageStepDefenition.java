package stepDefinetions;

import java.util.List;
import java.util.Map;
import org.junit.Assert;
import core.Base;
import cucumber.api.DataTable;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import pageObjects.BddTekRetailPageObj;

import utilities.WebDriverUtility;

public class BddTekRetailPageStepDefenition extends Base {

	BddTekRetailPageObj retailgaeObj = new BddTekRetailPageObj();

	@Given("^User click on MyAccount$")
	public void user_click_on_MyAccount() throws Throwable {
		retailgaeObj.clickOnMyAccount();
		logger.info("User click on My Account");

	}

	@When("^User click on Login$")
	public void user_click_on_Login() throws Throwable {
		retailgaeObj.clickOnLogin();
		logger.info("User click on Login");

	}

	@When("^User enter username '(.+)' and password '(.+)'$")
	public void user_enter_username_arad_cls_gmail_com_and_password_Arad(String userName, String passsWord)
			throws Throwable {

		retailgaeObj.enterEmailAddress(userName);
		logger.info("User enter email address");
		retailgaeObj.enterPassword(passsWord);
		logger.info("User enter password");
		WebDriverUtility.screenShot();

	}

	@When("^User click on Login button$")
	public void user_click_on_Login_button() throws Throwable {
		retailgaeObj.clickOnLoginButton();
		logger.info("User click on Login button");
	}

	@Then("^User should be logged in to MyAccount dashboard$")
	public void user_should_be_logged_in_to_MyAccount_dashboard() throws Throwable {
		WebDriverUtility.wait(2000);
		logger.info("Use  verified the page title");
		WebDriverUtility.screenShot();

	}

	@When("^User click on ‘Register for an Affiliate Account’ link$")
	public void user_click_on_Register_for_an_Affiliate_Account_link() throws Throwable {
		retailgaeObj.registerForAffeliateAccount();
		logger.info("User clicks on register for Affliate account");
		WebDriverUtility.wait(1000);
	}

	@When("^User fill affiliate form with below information$")
	public void user_fill_affiliate_form_with_below_information(DataTable dataDriven) throws Throwable {
		List<List<String>> FillingData = dataDriven.raw();
		retailgaeObj.companyFiled(FillingData.get(0).get(0));
		retailgaeObj.websiteFiled(FillingData.get(0).get(1));
		retailgaeObj.taxIdFiled(FillingData.get(0).get(2));
		retailgaeObj.paymentMethod();
		retailgaeObj.chequePayeeName(FillingData.get(0).get(3));
		logger.info("User fills the Affiliate Information");
		WebDriverUtility.wait(2000);

	}

	@When("^User check on About us check box$")
	public void user_check_on_About_us_check_box() throws Throwable {
		retailgaeObj.agreeCheckBox();
		logger.info("User clicks on Agree Checkbox");

	}

	@When("^User click on Continue button$")
	public void user_click_on_Continue_button() throws Throwable {
		retailgaeObj.continueButton();
		logger.info("User clicks on continue button");

	}

	@Then("^User should see a success message$")
	public void user_should_see_a_success_message() throws Throwable {
		logger.info("User sees a success message$");
		WebDriverUtility.screenShot();
	}

	@When("^User click on ‘Edit your affiliate informationlink$")
	public void user_click_on_Edit_your_affiliate_informationlink() throws Throwable {
		retailgaeObj.editingAffiliateInformation();
		logger.info("User clicks on edite affleiate information");

	}

	@When("^user click on Bank Transfer radio button$")
	public void user_click_on_Bank_Transfer_radio_button() throws Throwable {
		retailgaeObj.ClickingOnBankTransferRadioButton();
		logger.info("User clicks on Bank Transfer radio button");

	}

	@When("^User fill Bank information with below information$")
	public void user_fill_Bank_information_with_below_information(DataTable dataOne) throws Throwable {
		List<Map<String, String>> obj = dataOne.asMaps(String.class, String.class);

		retailgaeObj.bankName(obj.get(0).get("bankName"));
		retailgaeObj.abaBsbNumber(obj.get(0).get("abaNumber"));
		retailgaeObj.swiftCode(obj.get(0).get("swiftCode"));
		retailgaeObj.bankAccountName(obj.get(0).get("accountName"));
		retailgaeObj.bankAccountNumber(obj.get(0).get("accountNumber"));
		logger.info("User fill Bank information with below information");
		WebDriverUtility.wait(3000);
	}

	@When("^User click on ‘Edit your account information’ link$")
	public void user_click_on_Edit_your_account_information_link() throws Throwable {
		retailgaeObj.edittingYourAccountInformation();
		logger.info(" User click on ‘Edit your account information’ link");
		WebDriverUtility.wait(1000);
	}

	@When("^User modify below information$")
	public void user_modify_below_information(DataTable Extracting) throws Throwable {

		List<List<String>> obj = Extracting.raw();

		retailgaeObj.firstNameTexBox(obj.get(1).get(0));
		retailgaeObj.lastNameTexBox(obj.get(1).get(1));
		retailgaeObj.emailTexBox(obj.get(1).get(2));
		retailgaeObj.telephoneTexBox(obj.get(1).get(3));
		logger.info("User modifies My Account information");
		WebDriverUtility.screenShot();

	}

	@When("^User click on continue button$")
	public void user_click_on_continue_button() throws Throwable {
		retailgaeObj.myAccountContinueButton();
		logger.info(" User click on My Account continue button ");
		WebDriverUtility.wait(1000);
	}

	@Then("^User should see a message ‘Success: Your account has been successfully updated\\.’$")
	public void user_should_see_a_message_Success_Your_account_has_been_successfully_updated() throws Throwable {

		logger.info("User sould see Success massage ");
		WebDriverUtility.wait(2000);

		WebDriverUtility.screenShot();

	}
}
