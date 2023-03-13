package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A8_First_TestScript {
	public static void main(String[] args) {
		String s1="sharoon1@gmail.com";
		String s2="Abcd1234";
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver =new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement loginClick = driver.findElement(By.className("ico-login"));
		loginClick.click();
		WebElement emailTextField=driver.findElement(By.id("Email"));
		emailTextField.clear();
		emailTextField.sendKeys(s1);
		WebElement password=driver.findElement(By.id("Password"));
		password.clear();
		password.sendKeys(s2);
		WebElement login=driver.findElement(By.className("login-button"));
		login.click();
		WebElement logout=driver.findElement(By.className("ico-logout"));
		if(logout.isDisplayed()) {
			System.out.println("testcase passed");
			
			
		}
		else {
			System.out.println("testcase failed");
		}
		driver.close();
		
		
		
		
	}

}
