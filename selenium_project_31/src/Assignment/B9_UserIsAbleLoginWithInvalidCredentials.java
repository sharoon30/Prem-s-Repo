package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B9_UserIsAbleLoginWithInvalidCredentials {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		HomePage hp=new HomePage(driver);
		hp.getLoginLink().click();
		String s1="sharoon1@gmail.com";
		String psw="Abcd1234";
		hp.getEmailTextField().sendKeys(s1);
	String fn	=hp.getEmailTextField().getAttribute("value");
	if(s1.equals(fn)) {
	   System.out.println("email is correct");
	}
		hp.getPasswordTextField().sendKeys("Acd1234");
		String s2=hp.getPasswordTextField().getAttribute("value");
		if(s2.equals(psw)) {
			System.out.println("password is correct ");
		}
		else {
			System.out.println("password is notcorrect");
		}
		hp.getLoginButton().click();
		driver.close();
	}

}
