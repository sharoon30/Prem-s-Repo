package b_WebElementsMethods;

import org.openqa.grid.web.servlet.handler.WebDriverRequest;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A4_getCssValue  {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.sendKeys("electronics");
		String s=search.getCssValue("padding");
		
		System.out.println(s);
		Thread.sleep(4000);
		driver.close();
	}
}
