package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class LoginTest {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver","chromedrive.exe");
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		driver.manage().window().maximize();
		
		WebElement LoginLink = driver.findElement(By.className("login"));
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("asd@xyz.com");
		
		WebElement password = driver.findElement(By.id("password"));
		password.sendKeys("Aswd@123");
		
		WebElement submit = driver.findElement(By.name("btn_login"));
		submit.click();
		
		WebElement Error = driver.findElement(By.id("msg_box"));
		String Actualmsg = Error.getText();
		
		String Expmsg = "The email or password you have entered is invalid.";

		if(Actualmsg.equals(Expmsg)) {
		System.out.println("Test passed");
		}
		else {
		System.out.println("Test failed");
		}

		
		WebElement FogotPass = driver.findElement(By.partialLinkText("Forgot "));
		FogotPass.click();
				
		List<WebElement> links = driver.findElements(By.tagName("a"));
		System.out.println("Total links are: " + links.size());
		

        for(WebElement data : links) {
            System.out.println(data.getText());
        	//System.out.println("Target URL is: " + data.getAttribute("href"));
        }
        
        System.out.println(driver.getTitle());
        System.out.println(driver.getCurrentUrl());
		
		
	}

}
