package e_AutomatingDropdown11methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A6_workingWithMultiSelectDropdown {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sharu/OneDrive/Desktop/dropDown.html");
		WebElement dropdown=driver.findElement(By.id("m1"));
		Select select=new Select(dropdown);
		boolean k=select.isMultiple();
		System.out.println(k);
		List<WebElement> e=select.getOptions();
		for(WebElement we:e) {
			System.out.println(we.getText());
		}
		System.out.println();
		System.out.println("-------");
		select.selectByIndex(5);
		select.selectByVisibleText("Mango");
		select.selectByVisibleText("Orange");
		select.selectByVisibleText("Apple");
		select.getFirstSelectedOption();
		Thread.sleep(2000);
		select.deselectByVisibleText("Mango");
		Thread.sleep(2000);
		select.deselectByVisibleText("Apple");
		Thread.sleep(2000);
		select.deselectByVisibleText("Orange");
		Thread.sleep(2000);
		select.deselectByIndex(5);
		driver.close();
	}


}
