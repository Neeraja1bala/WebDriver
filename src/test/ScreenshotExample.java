package test;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class ScreenshotExample {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub

System.setProperty("webdriver.chrom.driver","chromedrive");
		
		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.simplilearn.com/");
		
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(4000, TimeUnit.MILLISECONDS);
		
		WebElement LoginLink = driver.findElement(By.linkText("Log in"));
		WebDriverWait wait = new WebDriverWait(driver,30);
		wait.until(ExpectedConditions.visibilityOf(LoginLink));
		
		LoginLink.click();
		
		WebElement UserName = driver.findElement(By.name("user_login"));
		UserName.sendKeys("asd@xyz.com");
		
		WebElement Password = driver.findElement(By.id("password"));
		Password.sendKeys("aSwd@123");
		
		WebElement LoginButton = driver.findElement(By.name("btn_login"));
		LoginButton.click();
		
		WebElement remember = driver.findElement(By.className("rememberMe"));
        remember.click();
        
        WebElement Error = driver.findElement(By.id("msg_box"));
        String Actualmsg = Error.getText();
        String Expmsg = "The email or password you have entered is invalid.";
        
        TakesScreenshot tsobj = (TakesScreenshot) driver;
        File image = tsobj.getScreenshotAs(OutputType.FILE);
        
        FileUtils.copyFile(image, new File("screenshot.png"));
        
        if(Actualmsg.equals(Expmsg)) {
        	System.out.println("Test passed");
        }
        else {
        	System.out.println("Test failed");
        }
		
	}

}
