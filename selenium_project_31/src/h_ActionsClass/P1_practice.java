package h_ActionsClass;

import java.awt.Desktop.Action;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class P1_practice {
	public static void main(String[] args) throws InterruptedException {
		/*
		 * click() ,click(webelement target), sendKeys(), sendKeys(Webelement Target)
		 * contextClick(), contextClick(webelementTarget) ,dragAndDrop(Webelement
		 * source,webelement target) ,dragAndDropBy(WebElement Source,int xoffset,int y
		 * offset), clickAndHold(webelemnt) ,clickAndHold(); release(), release(webelement
		 * target), build() ,perform() ,keysUp() ,keysDown(char seq keys)
		 * moveToElement(webelementTarget) ,moveToElement(webelement element,xoff,yoff),
		 * moveByOffset(xoff,yoff) ,doubleClick(), doubleClick(webelement elemnt)
		 */
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(20, TimeUnit.SECONDS);
		driver.get("https://jqueryui.com/sortable/");
		WebElement drag=driver.findElement(By.linkText("Draggable"));
		drag.click();
		WebElement iframe=driver.findElement(By.className("demo-frame"));
		driver.switchTo().frame(iframe);

		WebElement dragme=driver.findElement(By.id("draggable"));

		Actions actions=new Actions(driver);
		/*
		 * actions.clickAndHold(dragme).perform(); Thread.sleep(2000);
		 * actions.moveToElement(dragme,388, 80).perform(); Thread.sleep(2000);
		 * actions.release().perform();
		 * 
		 * Thread.sleep(3000);
		 */
		actions.dragAndDropBy(dragme, 388, 80).perform();
		driver.close();

	}

}
