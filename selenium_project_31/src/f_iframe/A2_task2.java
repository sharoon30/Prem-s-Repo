package f_iframe;

import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class A2_task2 {
	public static void main(String[] args) throws InterruptedException {
		System.setProperty("webdriver.chrome.driver","./Drivers/chromedriver.exe");
		WebDriver driver=new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
		driver.get("https://www.maxfashion.in/in/en/search?q=&gclid=Cj0KCQjw5-WRBhCKARIsAAId9FkjGCdXy5SQ7yK3er_RDDAORZ02ei2RgsEP1GtcxZkF6Juf_XLmAoQaAj-VEALw_wcB");
		WebElement search=driver.findElement(By.id("js-site-search-input"));
		search.click();
		WebElement tops=driver.findElement(By.xpath("//span[text()='tops']"));
		tops.click();
		WebElement shirt=driver.findElement(By.xpath("(//a[contains(text(),'Crew Neck')])[1]"));
		shirt.click();
		String pw1=driver.getWindowHandle();
		Set<String> w1=driver.getWindowHandles();
		for(String id:w1) {
			System.out.println(id);
			driver.switchTo().window(id);
		}
		
		  WebElement
		  addtobasket1=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		  addtobasket1.click(); WebElement
		  yr=driver.findElement(By.xpath("(//span[text()='8-9 Y'])[2]")); yr.click();
		  WebElement addtobasket2=driver.findElement(By.
		  xpath("(//span[text()='ADD TO BASKET'])[2]")); addtobasket2.click();
		  driver.switchTo().window(pw1);
		  
   		WebElement whitetshirt=driver.findElement(By.xpath("(//a[text()='MAX Printed Polo T-shirt'])[1]"));
		whitetshirt.click();
		Set<String> w2=driver.getWindowHandles();
		for(String id2:w2) {
			System.out.println(id2);
			driver.switchTo().window(id2);
		}
		WebElement waddtobasket1=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		waddtobasket1.click();
		WebElement wyr=driver.findElement(By.xpath("(//div[@class='jss235'])[8]"));
		wyr.click();
		WebElement waddtobasket2=driver.findElement(By.xpath("(//span[text()='ADD TO BASKET'])[2]"));
		waddtobasket2.click();
		driver.switchTo().window(pw1);
		WebElement browntop=driver.findElement(By.xpath("//a[text()='MAX Solid Knitted Top']"));
		browntop.click();
		Set<String> b3=driver.getWindowHandles();
		for(String id3:b3) {
			System.out.println(id3);
			driver.switchTo().window(id3);
		}
		WebElement baddtobasket1=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		baddtobasket1.click();
		WebElement bsize=driver.findElement(By.xpath("(//span[text()='XXL'])[2]"));
		bsize.click();
		WebElement baddtobasket2=driver.findElement(By.xpath("(//span[text()='ADD TO BASKET'])[2]"));
		baddtobasket2.click();
		driver.switchTo().window(pw1);
		WebElement yshirt=driver.findElement(By.xpath("(//a[text()='MAX Printed Crew Neck T-shirt'])[7]"));
		yshirt.click();
		Set<String> y4=driver.getWindowHandles();
		for(String id4:y4) {
			System.out.println(id4);
			driver.switchTo().window(id4);
		}
		WebElement yaddtobasket1=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		yaddtobasket1.click();
		WebElement yyrs=driver.findElement(By.xpath("(//span[text()='11-12 Y'])[2]"));
		yyrs.click();
		WebElement yaddtobasket2=driver.findElement(By.xpath("(//span[text()='ADD TO BASKET'])[2]"));
		yaddtobasket2.click();
		driver.switchTo().window(pw1);
		
		WebElement blshirt=driver.findElement(By.xpath("(//a[text()='MAX Printed Crew Neck T-shirt'])[2]"));
		blshirt.click();
		Set<String> bl5=driver.getWindowHandles();
		for(String id5:bl5) {
			System.out.println(id5);
			driver.switchTo().window(id5);
		}
		WebElement bladdtobasket1=driver.findElement(By.xpath("//span[text()='ADD TO BASKET']"));
		bladdtobasket1.click();
		WebElement blyrs=driver.findElement(By.xpath("(//span[text()='15-16 Y'])[2]"));
		blyrs.click();
		WebElement bladdtobasket2=driver.findElement(By.xpath("(//span[text()='ADD TO BASKET'])[2]"));
		yaddtobasket2.click();
		driver.switchTo().window(pw1);
		driver.quit();	
	}
}
