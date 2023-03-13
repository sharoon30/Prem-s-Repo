package d_Synchronisation;

import java.util.NoSuchElementException;
import java.util.concurrent.TimeoutException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.WebDriverWait;

public class A5_CustomWait {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.get("https://demo.actitime.com/login.do");
		WebElement email=driver.findElement(By.id("username"));
		email.sendKeys("admin");
		WebElement pass=driver.findElement(By.name("pwd"));
		pass.sendKeys("manager");
		WebElement lb=driver.findElement(By.xpath("//div[text()='Login ']"));
		lb.click();Thread.sleep(2000);
		WebElement logout=driver.findElement(By.id("logoutLink"));
		int i=0;
		while(i<=50) {
			try {
				logout.click();
				System.out.println("clicked");
				break;
			}
			catch(NoSuchElementException  e){
				i++;
			}
			
		}
		
		//Thread.sleep(2000);
		driver.close();
	}

}
