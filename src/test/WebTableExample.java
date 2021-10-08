package test;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class WebTableExample {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		System.setProperty("webdriver.chrom.driver","chromedrive");

		WebDriver driver = new ChromeDriver();
		
		driver.get("https://www.w3schools.com/html/html_tables.asp");
		
		driver.manage().window().maximize();
		
		List<WebElement> rows = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr"));
		System.out.println("Total number of rows are: " + rows.size());
		
		List<WebElement> col = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/th"));
		System.out.println("Total number of columns are: " + col.size());
		
		WebElement data = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[4]/td[1]"));
		System.out.println(data.getText());
		
		System.out.println();
		
		for(int i=2;i<=rows.size();i++) {
            
            WebElement data1 = driver.findElement(By.xpath("//table[@id='customers']/tbody/tr[" + i + "]/td[1]"));
            System.out.println(data1.getText());
        }
		
		
		/*System.out.println();
		List<WebElement> data2 = driver.findElements(By.xpath("//table[@id='customers']/tbody/tr/td"));
        List <String> dta = new ArrayList<>();
        for(WebElement ele : data2) {
            dta.add(ele.getText());
            System.out.println(ele.getText());
        }*/
		
        WebElement elem = driver.findElement(By.xpath("//*[text()='Define an HTML Table']"));
        
        
        JavascriptExecutor js = (JavascriptExecutor) driver;
        js.executeScript("arguments[0].scrollIntoView();", elem);
		
		
	}

}
