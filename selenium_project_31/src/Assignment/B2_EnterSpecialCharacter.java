package Assignment;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class B2_EnterSpecialCharacter {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("http://demowebshop.tricentis.com/");
		HomePage hp=new HomePage(driver);
		hp.getRegistrationLink().click();
		hp.getFname().click();
		hp.getFname().sendKeys("@@@@$$$###");
		driver.close();
		
		
	}

}
