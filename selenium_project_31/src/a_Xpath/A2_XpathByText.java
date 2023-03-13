package a_Xpath;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_XpathByText {
	public static void main(String[] args) throws InterruptedException {
		String s1="sharun@gmail";
		String s2="Abcd123";
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement un=driver.findElement(By.xpath("//input[@ id='username']"));
		un.clear();
		un.sendKeys(s1);
		WebElement pass=driver.findElement(By.xpath("//input[@ name='pwd']"));
		pass.clear();
		pass.sendKeys(s2);
		WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
		login.click();
		Thread.sleep(4000);
		driver.close();
	}

}


