package Practice;

import java.io.File;
import java.io.IOException;
import java.nio.file.Paths;
import java.time.Duration;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;
import com.google.common.io.Files;

public class FireFox {
	
	@Test(priority=1)
	public void test_19() throws InterruptedException, IOException {
		
		System.setProperty("webdriver.firefox.driver","D:\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
		WebDriver d=new FirefoxDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().setSize(new Dimension(1920,1080));
		d.get("https://www.getcalley.com/page-sitemap.xml");
		d.findElement(By.linkText("https://www.getcalley.com/")).click();
		 Thread.sleep(1000);
		byte[] imageBytes = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1920x1080\\s1.png");
		Files.write(imageBytes, f);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		byte[] imageBytes1 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f1=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1920x1080\\s2.png");
		Files.write(imageBytes1, f1);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		//
		byte[] imageBytes2 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f2=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1920x1080\\s3.png");
		Files.write(imageBytes2, f2);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		byte[] imageBytes3 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f3=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1920x1080\\s4.png");
		Files.write(imageBytes3, f3);
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		byte[] imageBytes4 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f4=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1920x1080\\s5.png");
		Files.write(imageBytes4, f4);
		d.navigate().back();
		d.close();
	}	
         @Test(priority=2)
		public void test_15() throws IOException {
        		System.setProperty("webdriver.firefox.driver","D:\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
        		WebDriver d=new FirefoxDriver();
        		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
        		d.get("https://www.getcalley.com/page-sitemap.xml");
        		d.findElement(By.linkText("https://www.getcalley.com/")).click();
		d.manage().window().setSize(new Dimension(1536,864));
		byte[] imageBytes = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1536×864\\s1.png");
		Files.write(imageBytes, f);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		byte[] imageBytes1 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f1=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1536×864\\s2.png");
		Files.write(imageBytes1, f1);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		//
		byte[] imageBytes2 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f2=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1536×864\\s3.png");
		Files.write(imageBytes2, f2);
			
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		byte[] imageBytes3 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f3=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1536×864\\s4.png");
		Files.write(imageBytes3, f3);
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		byte[] imageBytes4 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
		File f4=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1536×864\\s5.png");
		Files.write(imageBytes4, f4);
		d.navigate().back();
		d.close();
		}
	    @Test(priority=3)
		public void test_13() throws IOException {
	    	System.setProperty("webdriver.firefox.driver","D:\\Selenium\\Selenium\\Drivers\\geckodriver.exe");
			WebDriver d=new FirefoxDriver();
			d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
			d.get("https://www.getcalley.com/page-sitemap.xml");
			d.findElement(By.linkText("https://www.getcalley.com/")).click();
			byte[] imageBytes = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
			File f=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1366×768\\s1.png");
			Files.write(imageBytes, f);
				
			d.navigate().back();
			d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
			byte[] imageBytes1 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
			File f1=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1366×768\\s2.png");
			Files.write(imageBytes1, f1);
				
			d.navigate().back();
			d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
			//
			byte[] imageBytes2 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
			File f2=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1366×768\\s3.png");
			Files.write(imageBytes2, f2);
				
			d.navigate().back();
			d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
			byte[] imageBytes3 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
			File f3=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1366×768\\s4.png");
			Files.write(imageBytes3, f3);
			d.navigate().back();
			d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
			byte[] imageBytes4 = ((FirefoxDriver)d).getFullPageScreenshotAs(OutputType.BYTES); 
			File f4=new File("D:\\Selenium\\Selenium\\DeskTop\\FireFox\\1366×768\\s5.png");
			Files.write(imageBytes4, f4);
			d.navigate().back();
			d.close();
	}
	}
