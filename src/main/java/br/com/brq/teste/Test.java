package br.com.brq.teste;

import java.util.concurrent.TimeUnit;

import org.junit.Assert;
import org.junit.BeforeClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Test {

	private static FirefoxDriver driver;
	WebElement element;

	@BeforeClass
	public static void openBrowser() {
		System.setProperty("webdriver.gecko.driver", "C:/DEV/LIB/geckodriver.exe");
		driver = new FirefoxDriver();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
	}

	@org.junit.Test
	public void test() {
		
		 System.out.println("Starting test " + new Object(){}.getClass().getEnclosingMethod().getName());
	     driver.get("http://www.store.demoqa.com");	
	     driver.findElement(By.xpath(".//*[@id='account']/a")).click();
	     driver.findElement(By.id("log")).sendKeys("testuser_3");
	     driver.findElement(By.id("pwd")).sendKeys("Test@123");
	     driver.findElement(By.id("login")).click();
	     try{
			 element = driver.findElement (By.xpath(".//*[@id='account_logout']/a"));
		 }catch (Exception e){
			}
	     Assert.assertNotNull(element);
	     System.out.println("Ending test " + new Object(){}.getClass().getEnclosingMethod().getName());
   

	}

}
