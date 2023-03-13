package d_Synchronisation;

import java.time.Duration;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class Dem {
public static void main(String[] args) {
System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
WebDriver driver=new ChromeDriver();
driver.manage().window().maximize();
driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
driver.get("https://demo.actitime.com/login.do");
WebElement email=driver.findElement(By.id("username"));
email.sendKeys("admin");
WebElement pass=driver.findElement(By.name("pwd"));
pass.sendKeys("manager");
WebElement login=driver.findElement(By.xpath("//div[text()='Login ']"));
login.click();
WebElement logout=driver.findElement(By.linkText("Logout"));
//logout.click();
WebDriverWait wait=new WebDriverWait(driver, 10);
wait.until(ExpectedConditions.urlToBe("https://demo.actitime.com/user/submit_tt.do"));
wait.pollingEvery(Duration.ofSeconds(10));

logout.click();


driver.close();


	
}
}
