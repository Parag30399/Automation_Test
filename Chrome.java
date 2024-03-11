package Practice;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.Dimension;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;

import com.assertthat.selenium_shutterbug.core.Capture;
import com.assertthat.selenium_shutterbug.core.Shutterbug;

public class Chrome {
	@Test(priority=1)
   public void chrome_1920() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().setSize(new Dimension(1920,1080));
		d.get("https://www.getcalley.com/page-sitemap.xml");
		d.findElement(By.linkText("https://www.getcalley.com/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1920x1080");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1920x1080");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1920x1080");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1920x1080");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1920x1080");
		d.close();
	}
	@Test(priority=2)
	public void chrome_1536() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().setSize(new Dimension(1536,864));
		d.get("https://www.getcalley.com/page-sitemap.xml");
		d.findElement(By.linkText("https://www.getcalley.com/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1536×864");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1536×864");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1536×864");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1536×864");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1536×864");
		d.close();
	}
	@Test(priority=3)
	public void chrome_1366() {
		System.setProperty("webdriver.chrome.driver","D:\\Selenium\\Selenium\\Drivers\\chromedriver.exe");
		WebDriver d=new ChromeDriver();
		d.manage().timeouts().implicitlyWait(Duration.ofSeconds(10));
		d.manage().window().setSize(new Dimension(1366,768));
		d.get("https://www.getcalley.com/page-sitemap.xml");
		d.findElement(By.linkText("https://www.getcalley.com/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1366×768");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-call-from-browser/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1366×768");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/calley-pro-features/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1366×768");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/best-auto-dialer-app/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1366×768");
		d.navigate().back();
		d.findElement(By.linkText("https://www.getcalley.com/how-calley-auto-dialer-app-works/")).click();
		Shutterbug.shootPage(d,Capture.FULL,true).save("D:\\Selenium\\Selenium\\DeskTop\\ChromeSS\\1366×768");
		d.close();
	}
	
	
  
}
