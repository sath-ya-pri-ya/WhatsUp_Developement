package selenium;

import java.awt.AWTException;
import java.awt.Dimension;
import java.awt.Rectangle;
import java.awt.Robot;
import java.awt.Toolkit;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TakesScreenShot_Demo {
	
	public static void main (String[] args) throws IOException, AWTException {
	//System.setProperty("webdriver.chrome.driver", "C:\\Users\\a864209\\Desktop\\sathya\\automation\\chromedriver.exe");
		
		WebDriver driver = new ChromeDriver();
		
		//driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(20));
		
		driver.navigate().to("https://www.leafground.com/alert.xhtml;jsessionid=node014son5a8ll5eyar8h3865wbqt136325.node0");
		
		//takes screen shot
		
		/*
		 * TakesScreenshot screenShot = (TakesScreenshot) driver;
		 * 
		 * File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destinationFile = new
		 * File("C:\\Users\\a864209\\Desktop\\sathya\\automation\\sample.png");
		 * 
		 * FileHandler.copy(sourceFile, destinationFile);
		 */
		
		WebElement simple_Alert = driver.findElement(By.xpath("//button[@id='j_idt88:j_idt91']"));
		
		simple_Alert.click();
		
		WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
		
		wait.until(ExpectedConditions.alertIsPresent());
		
		/*
		 * TakesScreenshot screenShot = (TakesScreenshot) driver;
		 * 
		 * File sourceFile = screenShot.getScreenshotAs(OutputType.FILE);
		 * 
		 * File destinationFile = new
		 * File("C:\\Users\\a864209\\Desktop\\sathya\\automation\\sample.png");
		 * 
		 * FileHandler.copy(sourceFile, destinationFile);
		 */
		
		Robot robot = new Robot();//create obj for robot
		Dimension screenSize = Toolkit.getDefaultToolkit().getScreenSize();//awt
		Rectangle rectangle = new Rectangle(screenSize);// obj for rec class and pass the size
		BufferedImage source = robot.createScreenCapture(rectangle);
		
		File destinationFile = new File("C:\\\\Users\\\\a864209\\\\Desktop\\\\sathya\\\\automation\\\\robotsample.png");
		
		ImageIO.write(source, "png", destinationFile);
		
		driver.quit();
		
		
		
		
		
		
	}

}
