package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B5_LoginWithInvalidUserIdAndValidPassword {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		HomePage hp=new HomePage(driver);
		hp.getLoginLink().click();
		String s1="sharoon1@gmail.com";
		String s2="Abcd1234";
		String s3=hp.getEmailTextField().getAttribute("Value");
		
		hp.getEmailTextField().sendKeys("sharoon2@gmail.com");
		if(s1.equals(s3)) {
			System.out.println("email is correct ");
		}
		else {
			System.out.println("email is wrong ");
		}
	String s4=	hp.getPasswordTextField().getAttribute("Value");
		hp.getPasswordTextField().sendKeys(s2);
	if(s2.equals(s4)) {
		System.out.println("password is correct ");
	}
	else {
		System.out.println("password is wrong ");
	}
		
		hp.getLoginButton().click();
		driver.close();


	}

}
