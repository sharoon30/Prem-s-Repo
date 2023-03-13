package j_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class A2_LoginPage {
	public WebDriver driver;
	A2_LoginPage(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(xpath="//a[text()='Log in']")
	private WebElement loginLink;
	 public WebElement getloginLink() {
		 return loginLink;
	 }
}
