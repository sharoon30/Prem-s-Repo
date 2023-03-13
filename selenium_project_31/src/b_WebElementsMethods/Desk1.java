package b_WebElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Desk1 {
	public static void main(String[] args) throws InterruptedException {
		String s1="bottle";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://demowebshop.tricentis.com/");
		WebElement register=driver.findElement(By.linkText("Register"));
		register.click();
		WebElement radio=driver.findElement(By.id("gender-male"));
		radio.click();
		WebElement firstname=driver.findElement(By.id("FirstName"));
		firstname.clear();
		firstname.sendKeys("Tupperware");
		WebElement lastname=driver.findElement(By.id("LastName"));
		lastname.clear();
		lastname.sendKeys("bottle");
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("bottle@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.clear();
		pass.sendKeys(s1);
		WebElement cpass=driver.findElement(By.id("ConfirmPassword"));
		cpass.clear();
		cpass.sendKeys(s1);
		WebElement reg=driver.findElement(By.id("register-button"));
		reg.click();
		try {
		WebDriverWait wait=new WebDriverWait(driver, 7);
		wait.until(ExpectedConditions.urlToBe("http://demowebshop.tricentis.com/registerresult/1"));
		}
		catch(Exception e) {
			System.out.println("Account with this name is already registered");
		}
		Thread.sleep(2000);
		
		driver.close();
		 
		
	}

}
