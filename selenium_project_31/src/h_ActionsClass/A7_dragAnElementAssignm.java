package h_ActionsClass;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class A7_dragAnElementAssignm {
public static void main(String[] args) throws InterruptedException {
	System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
	WebDriver driver=new ChromeDriver();
	driver.manage().window().maximize();
	driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
    driver.get("https://jqueryui.com/sortable/");
    driver.switchTo().frame(0);
    WebElement Item1=driver.findElement(By.xpath("//li[text()='Item 1']"));
    Actions act=new Actions(driver);
  //  WebElement Item2=driver.findElement(By.xpath("(//li[@class='ui-state-default ui-sortable-handle'])[5]"));
    Thread.sleep(2000);
    act.clickAndHold(Item1).moveByOffset(20,134).release().perform();
    Thread.sleep(3000);
    //driver.close();
		
	
}
}
