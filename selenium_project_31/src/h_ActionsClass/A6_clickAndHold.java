package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A6_clickAndHold {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	    driver.get("https://jqueryui.com/droppable/");
	    driver.switchTo().frame(0);
	    WebElement drag=driver.findElement(By.xpath("//p[text()='Drag me to my target']"));
	    
	    WebElement dragable=driver.findElement(By.id("droppable"));
	    Actions act=new Actions(driver);
	    // act.dragAndDropBy(drag, 160, 70).perform();
	//	act.clickAndHold(drag).moveToElement(dragable).release().perform();
		act.clickAndHold(drag).release(dragable).perform();
	    Thread.sleep(4000);

	}

}
