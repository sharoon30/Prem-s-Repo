package e_AutomatingDropdown11methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class P1_AutomatingDropDown {
	private static final List<WebElement> String = null;

	public static void main(String[] args) throws InterruptedException {
		//11 methods of select class are : 
		//isMultiple(),getOptions(),getFirstSelectedOption(),getAllselectedOption(),selectByIndex(),selectByValue(),selectByVisibleText(),deselectByVisibleText(),deselectByIndex(),deselectByValue(),deselectAll();
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(23,TimeUnit.SECONDS);
		driver.get("file:///C:/Users/sharu/OneDrive/Desktop/dropDown.html");
		WebElement manual=driver.findElement(By.id("s1"));
		Select  select=new Select(manual);
		boolean check=select.isMultiple();
		System.out.println(check);
 List<WebElement>	a=	select.getOptions();
 System.out.println(a.size());
 for(WebElement ele:a ) {
	 ele.click();
	 ele.click();
	 System.out.println(ele.getText());
 }
 WebElement msd=driver.findElement(By.id("m1"));
 Select ms=new Select(msd);
 System.out.println("======================================================================");
 boolean key=  ms.isMultiple();
 System.out.println(key);
 List<WebElement> element= ms.getOptions();
	/*
	 * for(WebElement j:element) { String s1=j.getText(); System.out.println(s1);
	 * j.click();
	 * 
	 * }
	 */
  Thread.sleep(2000);
 ms.selectByValue("2");
 Thread.sleep(2000);
 for(int i=0;i<element.size();i++) {
	 ms.selectByIndex(i);
 }
 for(int i =0;i<element.size();i++) {
	 ms.deselectByIndex(i);
 }
 
 driver.close();
	}

}
