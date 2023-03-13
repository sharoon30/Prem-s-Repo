package b_WebElementsMethods;

import java.awt.Dimension;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A7_GetSizeMethod {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/login");
WebElement login=		driver.findElement(By.partialLinkText("Log"));
login.click();
WebElement Et=driver.findElement(By.id("Email"));
 int d1=Et.getSize().height;
 int d2=Et.getSize().getWidth();
 System.out.println(d1);
 System.out.println(d2);
 driver.close();
	}

}
