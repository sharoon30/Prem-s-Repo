package i_popup;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class TaskToMaximise {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
	    WebDriver driver=new ChromeDriver();
	    driver.manage().window().maximize();
	    driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	    driver.get("file:///C:/Users/sharu/Downloads/MultipleWindow.html");
	    String pwt=driver.getTitle();
	    System.out.println(pwt);
	    String pid = driver.getWindowHandle();
	    System.out.println("the id of parent window is \n "+pid);
	    WebElement openbutton=driver.findElement(By.xpath("//input[@value='Open Food Sites']"));
	    openbutton.click();
	    String ch2t="Allrecipes | Food, friends, and recipe inspiration";
	    
	    Set<String> ch1 = driver.getWindowHandles();
	    
	    for(String id:ch1) {
	    	
	    	driver.switchTo().window(id);
	    	System.out.println("the id of child 1 is \n "+id);
	    }
	    String chw1 = driver.getTitle();
	    System.out.println("The title of child 1 window is :\n"+chw1);
	    if (pwt==chw1) {
	    	driver.manage().window().maximize();
	    }
	   else if(pwt==ch2t) {
	  	driver.manage().window().maximize();
	    	
	    }
	   else {
		   driver.close();
	   }
	    
	}

}
