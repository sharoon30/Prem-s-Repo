package e_AutomatingDropdown11methods;

import java.util.List;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;

public class A7_pract2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.makemytrip.com/flights/?cmp=SEM|D|DF|G|Brand|B_M_Makemytrip_Search_Exact|Brand_Top_5_Exact|RSA|483490446458&s_kwcid=AL!1631!3!483490446458!e!!g!!makemytrip&ef_id=Cj0KCQjwuMuRBhCJARIsAHXdnqOtY6oeuROTa_XeT1AiNRj1y6MTHArmpXQWhuXNvmIfDgbKvEQZavMaAhK5EALw_wcB:G:s&gclid=Cj0KCQjwuMuRBhCJARIsAHXdnqOtY6oeuROTa_XeT1AiNRj1y6MTHArmpXQWhuXNvmIfDgbKvEQZavMaAhK5EALw_wcB");
		WebElement from=driver.findElement(By.xpath("//span[text()='From']"));
		
		from.click();
		Select sel=new Select(from);
		List<WebElement> ele=sel.getOptions();
		for(WebElement we:ele) {
			System.out.println(we);
		}
		driver.close();
		
		
		
	}

}
