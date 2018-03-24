package GooglePackage;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
//import org.junit.annotations.Test;
import org.testng.annotations.Test;


public class GoogleTest {
	
	WebDriver driver;
	@Test
	public void runGoogle(){
		
		System.setProperty("webdriver.chrome.driver", "C:\\Users\\Sekinat\\Documents\\Selenium_Jars\\chromedriver.exe");
		driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(10, TimeUnit.SECONDS);
		driver.get("https://www.google.com");
		
		driver.findElement(By.id("lst-ib")).sendKeys("Nigeria");
		driver.findElement(By.id("lga")).click();
		driver.findElement(By.name("btnI")).click();
		
	
		
	}

}
