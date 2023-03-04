package selenium;

import java.io.IOException;
import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Windows_Auth {

	public static void main(String[] args) throws IOException {
		// TODO Auto-generated method stub
		
		//System.setProperty("webdriver.chrome.driver","C:\\Users\\a864209\\Desktop\\sathya\\automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		
		driver.get("https://opensource-demo.orangehrmlive.com/web/index.php/pim/addEmployee");
		
		WebElement userName = driver.findElement(By.xpath("//input[@placeholder='Username']"));
		userName.sendKeys("Admin");
		
		WebElement password = driver.findElement(By.xpath("//input[@placeholder='Password']"));
		password.sendKeys("admin123");
		
		WebElement login = driver.findElement(By.xpath("//button[normalize-space()='Login']"));
		login.click();
		
		driver.findElement(By.xpath("//i[@class='oxd-icon bi-plus']")).click();	
		
		
		
		Runtime.getRuntime().exec("C:\\Users\\a864209\\Desktop\\sathya\\automation\\Auto-IT\\fileupload1");
		
		
		
	}

}
