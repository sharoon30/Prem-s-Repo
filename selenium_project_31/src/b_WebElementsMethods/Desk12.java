package b_WebElementsMethods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Desk12 {
	public static void main(String[] args) throws InterruptedException {
		String s1="bottle";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10,TimeUnit.SECONDS);
		driver.navigate().to("http://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.partialLinkText("Log"));
		login.click();
		WebElement email=driver.findElement(By.id("Email"));
		email.clear();
		email.sendKeys("bottle@gmail.com");
		WebElement pass=driver.findElement(By.id("Password"));
		pass.sendKeys(s1);
		WebElement logb=driver.findElement(By.xpath("(//input[@ type='submit'])[2]"));
		logb.click();//input[@type='button']
		
		
		
	}
}
