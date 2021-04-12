package pageObjects;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;
import utilities.WebDriverUtility;

public class BddTekDesktopPageObj extends Base {

	public BddTekDesktopPageObj() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(linkText = "Desktops")
	private WebElement desktopTabButton;

	public void clickOnDesktoTab() {

		desktopTabButton.click();

	}

	@FindBy(xpath = "//*[@id='content']/div[4]")
	private WebElement ell;

	public void display() {
		ell.isDisplayed();
	}

	@FindBy(xpath = "//a[contains(text(),'Show All Desktops')]")
	private WebElement showAllDesktopsBtton;

	public void clickOnShowAllDesktops() {

		showAllDesktopsBtton.click();

	}

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[3]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartHPOptionButton;

	public void clickOnAddToCartHPOption() {

		addToCartHPOptionButton.click();
	}

	@FindBy(xpath = "//input[@id='input-quantity']")
	private WebElement quantityHPText;

	public void selectHPQuantity() {
		quantityHPText.clear();
		quantityHPText.sendKeys("1");
	}

	@FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
	private WebElement addToCartHPButton;

	public void clickOnHPAddToCartButton() {
		addToCartHPButton.click();
	}

	@FindBy(xpath = "//body/div[@id='product-category']/div[1]/div[1]/div[4]/div[2]/div[1]/div[2]/div[2]/button[1]/span[1]")
	private WebElement addToCartCanonOption;

	public void clickOnAddToCartCanonOption() {
		addToCartCanonOption.click();
	}

	@FindBy(how = How.XPATH, using = "//select[@id='input-option226']")
	private WebElement selectRedFromDropDown;

	public void selectRedFromDropDown() {
		selectRedFromDropDown.click();
		WebDriverUtility.selectByVisibleText(selectRedFromDropDown, "Red");
	}

	@FindBy(xpath = "//input[@name='quantity']")
	private WebElement quantityCanon;

	public void selectQuantityCanon() {
		quantityCanon.clear();
		quantityCanon.sendKeys("1");
	}

	@FindBy(css = "button#button-cart")
	private WebElement addToCartCanonButton;

	public void clickOnAddToCartCanonButton() {
		addToCartCanonButton.click();
	}

	@FindBy(xpath = "//img[@title='Canon EOS 5D']")
	private WebElement clickOnCanonEOS5D;

	public void clickOnCanonEOS5D() {
		clickOnCanonEOS5D.click();
	}

	@FindBy(how = How.XPATH, using = "//a[contains(text(), 'Write a review')]")
	private WebElement writeAReview;

	public void writeAReview() {
		writeAReview.click();
	}

	@FindBy(how = How.CSS, using = "input#input-name")
	private WebElement yourNameTextBox;

	public void yourName(String yourName) {
		WebDriverUtility.enterValue(yourNameTextBox, yourName);
	}

	@FindBy(xpath = "//textarea[@id='input-review']")
	private WebElement yourReviewBox;

	public void yourReview(String yourReview) {
		WebDriverUtility.enterValue(yourReviewBox, yourReview);
	}

	@FindBy(how = How.XPATH, using = "//input[@value='1']")
	private WebElement ratingCheckBox;

	public void ClickingonBadRatingCheckBox() {
		ratingCheckBox.click();
	}

	@FindBy(how = How.CSS, using = "button#button-review")
	private WebElement continueButton;

	public void ClickOnContinueButton() {
		continueButton.click();
	}

}
