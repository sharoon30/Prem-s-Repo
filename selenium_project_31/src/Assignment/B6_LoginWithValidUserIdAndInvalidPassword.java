package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B6_LoginWithValidUserIdAndInvalidPassword {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		HomePage hp=new HomePage(driver);
		hp.getLoginLink().click();
		hp.getEmailTextField().sendKeys("sharoon1@gmail.com");
		hp.getPasswordTextField().sendKeys("Abcd1q34");
		hp.getLoginButton().click();
		driver.close();

	}

}
