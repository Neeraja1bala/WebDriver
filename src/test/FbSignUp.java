package test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbSignUp {
	public static void main(String[] args) {
		
		System.setProperty("webdriver.chrom.driver", "chromedriver");
		WebDriver driver = new ChromeDriver();
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		
		WebElement createaccount = driver.findElement(By.xpath("//a[text()='Create New Account']"));
		createaccount.click();
		
		WebElement name = driver.findElement(By.xpath("//input[@name='firstname']"));
		name.sendKeys("Neeraja");
		
	}

}
