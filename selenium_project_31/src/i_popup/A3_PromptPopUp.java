package i_popup;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_PromptPopUp {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.w3schools.com/js/tryit.asp?filename=tryjs_prompt");
		WebElement iframe=driver.findElement(By.xpath("//iframe[@id='iframeResult']"));
		driver.switchTo().frame(iframe);
		WebElement tryb=driver.findElement(By.xpath("//button[text()='Try it']"));
		tryb.click();
		
		Alert alert=driver.switchTo().alert();
		/*
		 * String s1=alert.getText(); System.out.println(s1);
		 */
		alert.sendKeys("sharoon");
		
		Thread.sleep(4000);
		alert.accept();
		driver.close();
		
	}

}
