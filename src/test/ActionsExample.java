package test;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;

public class ActionsExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver","chromedrive");

		WebDriver driver = new ChromeDriver();
		
		driver.get("http://demo.guru99.com/test/drag_drop.html");
		
		driver.manage().window().maximize();
		WebElement From = driver.findElement(By.xpath("//*[@id='credit2']/a"));
        
        WebElement To = driver.findElement(By.xpath("//*[@id='bank']/li"));
        
        Actions actions = new Actions(driver);
        
        actions.dragAndDrop(From, To).build().perform();
        
        actions.sendKeys(Keys.PAGE_DOWN);
		
	}

}
