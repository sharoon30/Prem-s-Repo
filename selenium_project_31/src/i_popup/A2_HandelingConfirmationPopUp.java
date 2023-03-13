package i_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_HandelingConfirmationPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://licindia.in/");
		WebElement cal=driver.findElement(By.xpath("//a[text()=' Calculator']"));
		cal.click();
	Alert alert=driver.switchTo().alert();
		alert.accept();
		Thread.sleep(2000);
		driver.quit();
		
	}

}
