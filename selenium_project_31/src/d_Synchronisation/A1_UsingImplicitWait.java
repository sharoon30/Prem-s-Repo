package d_Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_UsingImplicitWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/");
		
		WebElement email=driver.findElement(By.id("email"));
		email.sendKeys("sharunsharu101@gmail.com");
		WebElement pass=driver.findElement(By.id("pass"));
		pass.sendKeys("Password@Rozario*199#");
		WebElement login=driver.findElement(By.name("login"));
		login.click();
		driver.close();
		
	}

}
