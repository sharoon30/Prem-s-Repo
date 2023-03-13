package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A11_CssSelector {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.navigate().to("https://demo.actitime.com/login.do");
		WebElement username=driver.findElement(By.cssSelector("input[id='username']"));
		username.sendKeys("sharun@gmail.com");
		WebElement pass=driver.findElement(By.cssSelector("input[name=\"pwd\"]"));
		pass.sendKeys("Abcd1234");
		Thread.sleep(4000);
		driver.close();
	}

}
