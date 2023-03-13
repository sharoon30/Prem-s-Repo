package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A1_mouseOverAction {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.maxfashion.in/in/en/search?q=&gclid=Cj0KCQjw5-WRBhCKARIsAAId9FkjGCdXy5SQ7yK3er_RDDAORZ02ei2RgsEP1GtcxZkF6Juf_XLmAoQaAj-VEALw_wcB");
	WebElement women=driver.findElement(By.xpath("//span[text()='Women']"));
	Actions act=new Actions(driver);
	act.moveToElement(women).click().perform();
	WebElement Bottom=driver.findElement(By.xpath("(//span[text()='Bottoms'])[1]"));
	act.moveToElement(Bottom).perform();
	WebElement jeans=driver.findElement(By.xpath("(//a[text()='Jeans & Jeggings'])[1]"));
	act.moveToElement(jeans).click().perform();
	driver.close();
	
	
	
	}

}
