package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A9_Register_module {
	public static void main(String[] args) {
		String passw="mobile1";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
	WebElement reg=	driver.findElement(By.className("ico-register"));
	reg.click();
	WebElement maleRadiobutton=driver.findElement(By.id("gender-male"));
	maleRadiobutton.click();
	WebElement nameTextfield=driver.findElement(By.id("FirstName"));
	nameTextfield.clear();
	nameTextfield.sendKeys("rozario");
	WebElement lastName=driver.findElement(By.id("LastName"));
		lastName.clear();
		lastName.sendKeys("sharoon");
	WebElement email=driver.findElement(By.id("Email"))	;
	email.clear();
	email.sendKeys("rozar87io6@gmail.com");
	WebElement pass=driver.findElement(By.id("Password"));
	pass.clear();
	pass.sendKeys(passw);
	WebElement cpass=driver.findElement(By.id("ConfirmPassword"));
	cpass.clear();
	cpass.sendKeys(passw);
	WebElement registerButton=driver.findElement(By.id("register-button"));
	registerButton.click();
	//WebElement logout=driver.findElement(By.className("ico-logout"));
	try {
		WebElement logout=driver.findElement(By.className("ico-logout"));
		if(logout.isDisplayed()) {
			System.out.println("user is registered");
		}
	}
	catch (Exception e) {
		System.out.println("User not registered");
	}
	//System.out.println("user is registered");
//	WebElement regis=driver.findElement(By.className("button-1"));
	driver.close();
	}

}
