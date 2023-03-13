package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A2_sendKey {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("https://omayo.blogspot.com/");
	    WebElement ta=driver.findElement(By.id("ta1"));
	    Actions act=new Actions(driver);
	    act.moveToElement(ta).click().perform();
	    act.sendKeys("hey babe!!! how are u ").build().perform();
	    driver.quit();
	    
	    
	}

}
