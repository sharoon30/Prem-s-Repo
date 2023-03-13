package Assignment;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class HomePage {
	public WebDriver driver;
	HomePage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(className="ico-register")
	private WebElement registrationLink;
	public WebElement getRegistrationLink() {
		return registrationLink;
	}
	@FindBy(id="FirstName")
	private WebElement Fname;
	public WebElement getFname() {
		return Fname;
	}
	@FindBy(id="gender-male")
	private WebElement genderRadio;
	public WebElement getGenderRadio() {
		return genderRadio;
	}
	@FindBy(id="gender-female")
	private WebElement femaleRadio;
	public WebElement getFemaleRadio() {
		return femaleRadio;
	}
	@FindBy(className="ico-login")
	private WebElement LoginLink;
	public WebElement getLoginLink() {
		return LoginLink;
	}
	@FindBy(id="Email")
	private WebElement emailTextField;
	public WebElement getEmailTextField() {
		return emailTextField;
	}
	@FindBy(id="Password")
	private WebElement passwordTextField;
	public WebElement getPasswordTextField() {
		return passwordTextField;
	}
	@FindBy(className="buttons")
	private WebElement loginButton;
	public WebElement getLoginButton() {
		return loginButton;
	}
	@FindBy(partialLinkText="Books")
	private WebElement booksLink;
	public WebElement getBooksLink() {
		return booksLink;
	}
	@FindBy(className="buttons")
	private WebElement computingBook;
	public WebElement getComputingBook() {
		return computingBook;
	}
	@FindBy(partialLinkText="Virtual")
	private WebElement giftcardImage;
	public WebElement getGiftcardImage() {
		return giftcardImage;
	}
	@FindBy(className="qty-input valid")
	private WebElement quantity;
	public WebElement getQuantity() {
		return quantity;
	}
	@FindBy(className="cart-label")
	private WebElement wishlist;
	public WebElement getWishlist() {
		return wishlist;
	}
	@FindBy(id="small-searchterms")
	private WebElement search;
	public WebElement getSearch() {
		return search;
	}
	@FindBy(className="cart-label")
	private WebElement ShoppingCart;
	public WebElement getShoppingCart() {
		return ShoppingCart;
	}
	@FindBy(id="products-viewmode")
	private WebElement grid;
	public WebElement getGrid() {
		return grid;
	}
	
	
	
}
