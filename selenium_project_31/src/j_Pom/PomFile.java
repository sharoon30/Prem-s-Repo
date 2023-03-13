package j_Pom;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class PomFile {
	public WebDriver driver;
	
	PomFile(WebDriver driver){
		PageFactory.initElements(driver, this);
		this.driver=driver;
	}
	@FindBy(className="ico-login")
	private WebElement login;

	public WebElement getLogin() {
		return login;
	}
	
	


}
