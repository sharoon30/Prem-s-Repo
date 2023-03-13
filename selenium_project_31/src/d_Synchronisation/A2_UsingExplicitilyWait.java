package d_Synchronisation;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.remote.server.handler.FindElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A2_UsingExplicitilyWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
	//	driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
		WebDriverWait wait=new WebDriverWait(driver, 10);//it accepts only seconds
	//	wait.until(ExpectedConditions.urlContains("https://demo.actitime.com/user/submit_tt.do"));
	//	wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
	//	wait.until(ExpectedConditions.presenceOfElementLocated(By.id("logoutLink")));
	//	wait.until(ExpectedConditions.urlMatches("https://demo.actitime.com/user/submit_tt.do"));
		
	 //   wait.until(ExpectedConditions.titleContains("actiTIME - Enter Time-Track"));
		     //  wait.until(ExpectedConditions. textToBe(By.xpath("//a[text()='Logout']"),"Logout"));
   //wait.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Time-Track")));
     
		
		WebElement logout=driver.findElement(By.id("logoutLink"));
		logout.click();
		driver.close();
		
	
	}

	
	}


