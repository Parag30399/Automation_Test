package Practice;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import javax.imageio.ImageIO;
import javax.swing.text.Document;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.events.EventFiringWebDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

import ru.yandex.qatools.ashot.AShot;
import ru.yandex.qatools.ashot.Screenshot;
import ru.yandex.qatools.ashot.shooting.ShootingStrategies;

public class Automation_Test_02 {
   @Test
   public void functional_test() throws InterruptedException, IOException {
	   System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
	   WebDriver d=new ChromeDriver();
	   d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
	   d.manage().window().maximize();
	   d.get("https://demo.dealsdray.com/");
	   d.findElement(By.xpath("//input[@id='mui-1']")).sendKeys("prexo.mis@dealsdray.com");
	   d.findElement(By.xpath("//input[@id='mui-2']")).sendKeys("prexo.mis@dealsdray.com");
	   d.findElement(By.xpath("//button[text()='Login']")).click();
	   d.findElement(By.xpath("//span[text()='Order']")).click();
	   d.findElement(By.xpath("//span[text()='Orders']")).click();
	   d.findElement(By.xpath("//button[contains(text(),'Add Bulk Orders')]")).click();
	   WebElement y = d.findElement(By.xpath("//input[@id='mui-7']"));
	   y.sendKeys("D:\\Selenium\\Selenium\\Testdata\\demo-data.xlsx");
	   d.findElement(By.xpath("//button[text()='Import']")).click();
	   d.findElement(By.xpath("//button[text()='Validate Data']")).click();
	   Thread.sleep(4000);
	   d.switchTo().alert().accept();
	   d.findElement(By.xpath("//span[text()='menu']")).click();
	   Thread.sleep(2000); 
	   TakesScreenshot scrShot =((TakesScreenshot)d);
	   File SrcFile=scrShot.getScreenshotAs(OutputType.FILE);
	   File DestFile=new File("D:\\Selenium\\Selenium\\Automation_Test2\\ss.png");
	   FileUtils.copyFile(SrcFile, DestFile);
	   
	   
   }
   
}
