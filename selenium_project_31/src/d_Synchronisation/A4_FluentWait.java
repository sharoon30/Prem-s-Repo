package d_Synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A4_FluentWait {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://demo.actitime.com/login.do");
		WebDriverWait wait=new WebDriverWait(driver, 10);
	wait.pollingEvery(Duration.ofSeconds(10));//this is how we change the polling period
	//	wait.until(ExpectedConditions.urlToBe(""))
		
	}

}
