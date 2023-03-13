package b_WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A3_getAttribute {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("http://demowebshop.tricentis.com/");
		WebElement login=driver.findElement(By.partialLinkText("Log"));
		login.click();
		WebElement search=driver.findElement(By.id("small-searchterms"));
		search.clear();
		search.sendKeys("electronics");
	    String s=search.getAttribute("class");
	    System.out.println(s);
	    driver.close();
	}
}
