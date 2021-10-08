package test;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class FbLogin {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver", "chromedriver.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://en-gb.facebook.com/");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement header = driver.findElement(By.xpath("//h2"));
		if(header.isDisplayed()) {
			System.out.println("Header is display");
		}
		else {
			System.out.println("Header is not display");
		}
		
		WebElement username = driver.findElement(By.xpath("//input[@name='email']"));
		System.out.println(username.getAttribute("placeholder"));
		username.sendKeys("asde@wem.com");
		
		WebElement password = driver.findElement(By.xpath("//input[@id='pass']"));
		System.out.println(password.getAttribute("placeholder"));
		password.sendKeys("SDe@34543d");
		
		WebElement login = driver.findElement(By.xpath("//button[@name='login']"));
		System.out.println(login.getAttribute("type"));
		login.click();
		
		
	}

}
