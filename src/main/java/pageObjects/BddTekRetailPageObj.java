package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class BddTekRetailPageObj extends Base {

	public BddTekRetailPageObj() {
		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//span[contains(text(),'My Account')]")
	private WebElement myAccount;

	public void clickOnMyAccount() {
		myAccount.click();

	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(),'Login')]")
	private WebElement login;

	public void clickOnLogin() {
		login.click();
	}

	@FindBy(how = How.ID, using = "input-email")
	private WebElement emailField;

	public void enterEmailAddress(String userName) {
		emailField.sendKeys(userName);
	}

	@FindBy(id = "input-password")
	private WebElement passwordField;

	public void enterPassword(String password) {
		passwordField.sendKeys(password);
	}

	public void clickOnLoginButton() {
		loginButton.click();
	}

	@FindBy(xpath = "//input[@class='btn btn-primary']")
	private WebElement loginButton;


	@FindBy(xpath = "//a[contains(text(),'Register for an affiliate account')]")
	private WebElement registerForAfiliateUser;

	public void registerForAffeliateAccount() {
		
			
		registerForAfiliateUser.click();
	}

	@FindBy(id = "input-company")
	private WebElement company;

	public void companyFiled(String companyName) {
		company.sendKeys(companyName);
	}

	@FindBy(id = "input-website")
	private WebElement webSiteFiled;

	public void websiteFiled(String Website) {
		webSiteFiled.sendKeys(Website);
	}

	@FindBy(css = "#input-tax")
	private WebElement taxID;

	public void taxIdFiled(String taxId) {
		taxID.sendKeys(taxId);
	}

	@FindBy(xpath = "//input[@value='cheque']")
	private WebElement chequePayment;

	public void paymentMethod() {
	
			chequePayment.click();
	}

	@FindBy(css = "input#input-cheque")
	private WebElement chequepayeeName;

	public void chequePayeeName(String payeeName) {
		chequepayeeName.sendKeys(payeeName);

	}

	@FindBy(name = "agree")
	private WebElement agreecheckBox;

	public void agreeCheckBox() {
		
			agreecheckBox.click();
	}

	@FindBy(xpath = "//input[@value ='Continue']")
	private WebElement continueButton;

	public void continueButton() {
		
		continueButton.click();
	}
	
	
	
	
	@FindBy(xpath ="//a[text()= 'Edit your affiliate information']")
	private WebElement editAffiliateInformation;
	
	public void editingAffiliateInformation() {
		editAffiliateInformation.click();
	}
	
	@FindBy(xpath ="//input[@value='bank']")
	private WebElement bankTransfareRadioButton;
	
	
	public void ClickingOnBankTransferRadioButton() {
		bankTransfareRadioButton.click();
	}
	
	@FindBy(id ="input-bank-name")
	private WebElement bankName;
	
	public void bankName(String bName) {
		WebDriverUtility.enterValue(bankName, bName);
	}
	
	@FindBy(css ="#input-bank-branch-number")
	private WebElement abaAbsNumber;
	
	public void abaBsbNumber(String BsbNumber) {
		WebDriverUtility.enterValue(abaAbsNumber, BsbNumber);
	}
	
	@FindBy(name ="bank_swift_code")
	private WebElement swiftCode;
	
	public void swiftCode(String SwifCode) {
		WebDriverUtility.enterValue(swiftCode, SwifCode);
	}
	
	@FindBy(xpath ="//input[@name='bank_account_name']")
	private WebElement accountName;
	
	public void bankAccountName(String acctName) {
		WebDriverUtility.enterValue(accountName, acctName);
	}
	
	@FindBy(id = "input-bank-account-number")
	private WebElement accountNumber;
	
	public void bankAccountNumber(String acctNumber) {
		WebDriverUtility.enterValue(accountNumber, acctNumber);
	}
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continueButtonAffiliate;
	
	public void affiliateContinueButton() {
		continueButtonAffiliate.click();
	}
	
	
	
	//Editting Account number 
	
	@FindBy(xpath ="//a[text()='Edit your account information']")
	private WebElement editYourAccountInformation;
	
	public void edittingYourAccountInformation() {
	
		editYourAccountInformation.click();
	}
	
	@FindBy(id ="input-firstname")
	private WebElement firstName;
	
	public void firstNameTexBox(String frName) {
		firstName.clear();
		WebDriverUtility.enterValue(firstName, frName);
	}
	
	@FindBy(xpath ="//input[@name='lastname']")
	private WebElement lastName;
	
	public void lastNameTexBox(String laName) {
		lastName.clear();
		WebDriverUtility.enterValue(lastName, laName);
	}
	
	@FindBy(name ="email")
	private WebElement email;
	
	public void emailTexBox(String emaill) {
		email.clear();
		WebDriverUtility.enterValue(email, emaill);
	}
	
	@FindBy(id ="input-telephone")
	private WebElement telephone;
	
	public void telephoneTexBox(String phone) {
		telephone.clear();
		WebDriverUtility.enterValue(telephone, phone);
	}
	
	@FindBy(xpath ="//input[@value='Continue']")
	private WebElement continueButtonEditAccount;
	
	public void myAccountContinueButton() {
		continueButtonEditAccount.click();
	}
	
	
	
}
