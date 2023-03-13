package b_WebElementsMethods;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class B1_isEnabledMethod {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://www.instagram.com/accounts/login/");
		Thread.sleep(4000);
		WebElement email=driver.findElement(By.xpath("//input[@name='username']"));
		email.clear();
		email.sendKeys("sharon@gmail.com");
		WebElement pass=driver.findElement(By.xpath("//input[@name='password']"));
		pass.clear();
		pass.sendKeys("aksjjsdhkshd");
		WebElement loginbutton=driver.findElement(By.xpath("//button[@type='submit']"));
		boolean a=loginbutton.isEnabled();
		System.out.println(a);
		driver.close();
	}

}
