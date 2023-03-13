package f_iframe;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A1_ToHandleIframe {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://mail.rediff.com/cgi-bin/login.cgi");
		WebElement email=driver.findElement(By.id("login1"));
		email.sendKeys("sharoon53@rediffmail.com");
		WebElement pass=driver.findElement(By.id("password"));
		pass.sendKeys("Password@30#");
		WebElement loginbutton=driver.findElement(By.name("proceed"));
		loginbutton.click();
		Thread.sleep(2000);
		WebElement writemail=driver.findElement(By.xpath("//b[text()='Write mail']"));
		writemail.click();
		WebElement tobutton=driver.findElement(By.id("TO_IDcmp2"));
		tobutton.click();
		tobutton.sendKeys("sharoon53@rediffmail.com",Keys.ENTER);
		WebElement subject=driver.findElement(By.xpath("(//input[@type='text'])[11]"));
		subject.click();
		subject.sendKeys("regarding leaves");
		WebElement body1=driver.findElement(By.xpath("//iframe[@class='cke_wysiwyg_frame cke_reset']"));
		driver.switchTo().frame(body1);
		WebElement body=driver.findElement(By.xpath("//body[@spellcheck='true']"));
		body.sendKeys("replying to my mail");
		driver.switchTo().parentFrame();
		WebElement sendbutton=driver.findElement(By.linkText("Send"));
		sendbutton.click();
		//WebElement inbox=driver.findElement(By.xpath("//a[@class='rd_active']"));
	//	inbox.click();
		WebElement checkbox=driver.findElement(By.xpath("//cite[@class='rd_mail_sel_all']"));
		checkbox.click();
		WebElement delete=driver.findElement(By.xpath("//span[@class='rd_fil_del']"));
		delete.click();
		WebElement ok=driver.findElement(By.xpath("//button[text()='Ok']"));
		ok.click();
	  driver.close();
	  
		
	}

}
