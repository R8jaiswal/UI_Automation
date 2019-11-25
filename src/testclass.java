import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

import javax.sound.sampled.AudioFileFormat.Type;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;

public class testclass {
public static void main(String[] args) {
	System.setProperty("Webdriver.chrome.driver","C:\\chromedriver.exe" );
	WebDriver driver=new ChromeDriver();
	System.out.println("Welcome to DXC AWS Application");
	 driver.manage().window().maximize();
	driver.get("https://test.lscp.dxc.technology/login");
	//driver.get("https://google.co.in");
	System.out.println(driver.getTitle());	
	System.out.println(driver.getCurrentUrl());
	
	//System.out.println(driver.getPageSource());
	driver.get("https://test.lscp.dxc.technology/login");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	//driver.findElement(By.xpath("//*[@id=\'username\']")).sendKeys("admin@lscp.com");  we can also use this xpath directly by selecting the field and riht click-> copy -> xpath
	driver.findElement(By.id("username")).sendKeys("Sanity1018@dxc.com");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.findElement(By.id("password")).sendKeys("Admin@123");
	driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	driver.findElement(By.xpath("//*[@id=\"PagePanelId\"]/app-root/app-login/div[1]/form/div[4]/div/button")).click();
	//driver.manage().timeouts().implicitlyWait(3000, TimeUnit.MILLISECONDS);
	//driver.navigate().back();
	
	//driver.close();
	
}
}
