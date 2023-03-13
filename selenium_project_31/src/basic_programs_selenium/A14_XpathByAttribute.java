package basic_programs_selenium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A14_XpathByAttribute {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.get("http://demowebshop.tricentis.com/");
	WebElement Gift= driver.findElement(By.partialLinkText("GIFT"));
	Gift.click();
	WebElement Add=driver.findElement(By.xpath("(//input[@value=\"Add to cart\"])[1]"));
	Add.click();
	Thread.sleep(4000);
	driver.close();
	}
}
