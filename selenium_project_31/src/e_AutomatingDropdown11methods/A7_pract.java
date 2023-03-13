package e_AutomatingDropdown11methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A7_pract {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(5,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sharu/OneDrive/Desktop/dropDown.html");
		WebElement D1=driver.findElement(By.id("m1"));
		Select s=new Select(D1);
		
		List<WebElement> l=s.getOptions();

		for(int j=0;j<l.size();j++) {
			s.selectByIndex(j);
		}
		driver.close();
	}

}
