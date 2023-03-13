package e_AutomatingDropdown11methods;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A5_selectByIndex {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("https://www.facebook.com/r.php?locale=en_GB&display=page");
		WebElement datedropdown=driver.findElement(By.id("day"));
		datedropdown.click();
		Select select=new Select(datedropdown);
		System.out.println(select.isMultiple());//used to check whether the drop down is multiple dropdown or not .
		select.selectByIndex(3);
		
		Thread.sleep(3000);
		driver.close();
	}

}
