package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;
import org.openqa.selenium.support.PageFactory;

import core.Base;

public class BddTekLapTopPageObj extends Base {

	public BddTekLapTopPageObj() {

		PageFactory.initElements(driver, this);

	}

	@FindBy(how = How.XPATH, using = "//body/div[1]/nav[1]/div[2]/ul[1]/li[2]/a[1]")
	private WebElement laptopNoteBookTab;

	public void clickOnLaptopAndNoteBookTab() {

		laptopNoteBookTab.click();

	}

	@FindBy(xpath = "//a[contains(text(),'Show All Laptops & Notebooks')]")
	private WebElement showAllLaptopAndNoteBookButton;

	public void clickOnShowAllLaptopAndNoteBook() {

		showAllLaptopAndNoteBookButton.click();

	}

	@FindBy(xpath = "//img[@title='MacBook']")
	private WebElement macBookItem;

	public void clickOnMackBookItem() {

		macBookItem.click();

	}

	@FindBy(how = How.XPATH, using = "//button[@id='button-cart']")
	private WebElement MacBookAdToCartButton;

	public void clickOnAddToCartMacBookButton() {

		MacBookAdToCartButton.click();

	}

	@FindBy(css = "#cart-total")
	private WebElement cartOption;

	public void clickOnCartOption() {
		cartOption.click();
	}

	@FindBy(how = How.XPATH, using = "//button[@class='btn btn-danger btn-xs']")
	private WebElement ClickingOnRedXButton;

	public void clickOnRedXButton() {
		ClickingOnRedXButton.click();
	}

	@FindBy(xpath = "((//button[@data-original-title='Compare this Product'])[2]")
	private WebElement macBookCompareThisProductIcon;

	public void clickOnComparisonMacBookIcon() {
		macBookCompareThisProductIcon.click();
	}

	@FindBy(xpath = "((//button[@data-original-title='Compare this Product'])[3]")
	private WebElement macBookAirCompareThisProductIcon;

	public void clickOnComparisonMacBookAirIcon() {
		macBookAirCompareThisProductIcon.click();
	}

	@FindBy(linkText = "Product Compare (2)")
	private WebElement productCompareLink;

	public void clickOnProductComparisonLink() {
		productCompareLink.click();
	}

	@FindBy(xpath = "((//button[@data-original-title='Add to Wish List'])[5]")
	private WebElement ClickingOnSonyVaioHeartIcon;

	public void clickOnheartIconSonyVaio() {
		ClickingOnSonyVaioHeartIcon.click();
	}

	@FindBy(linkText = "MacBook Pro")
	private WebElement macBookProItem;

	public void clickOnmacBookProItem() {
		macBookProItem.click();
	}

}
