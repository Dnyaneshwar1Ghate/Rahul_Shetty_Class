package RS;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class DroupDown {
	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.gecko.driver", "F:\\Software\\geckodriver-v0.32.2-win32\\geckodriver.exe");
		WebDriver driver =new FirefoxDriver();
		driver.get("https://www.spicejet.com");
		Thread.sleep(3000);
		driver.findElement(By.xpath("/html/body/div[2]/div/div/div[1]/div[3]/div[2]/div[3]/div/div[1]/div/div[1]")).click();
		Thread.sleep(3000);
		driver.findElement(By.cssSelector("div.r-1g40b8q:nth-child(3) > div:nth-child(1) > div:nth-child(1) > div:nth-child(1) > div:nth-child(2) > input")).sendKeys("Bengaluru");
		Thread.sleep(3000);
	//	driver.findElement(By.xpath("//input[@value='Bengaluru (BLR)']")).click();
		
		//driver.findElement(By.xpath("//input[@value='Chennai (MAA)")).click();
		WebElement s=driver.findElement(By.cssSelector("div.r-1g40b8q:nth-child(3) > div:nth-child(1) > div:nth-child(3) > div:nth-child(1) > div:nth-child(2) > input:nth-child(1)"));
		s.clear();
		s.sendKeys("Chennai");
		Thread.sleep(3000);
		
	}
	

}
