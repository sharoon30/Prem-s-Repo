package basic_programs_selenium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
public class A4_navigateTo {
	public static void main(String[] args) {
		System.setProperty("webdriver.chrome.driver", "./Drivers/chromedriver.exe");
		WebDriver d1=new ChromeDriver();
		d1.manage().window().maximize();
		d1.navigate().to("https://www.qspiders.com/");
	String s1=	d1.getCurrentUrl();
	String s2=	d1.getTitle();
		System.out.println(s1+" "+s2);
		
	}

}
