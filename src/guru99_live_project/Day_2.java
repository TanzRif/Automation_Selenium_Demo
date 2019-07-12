package guru99_live_project;

import javax.print.DocFlavor.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Day_2 {
	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java standlon\\chromedriver.exe");

		WebDriver driver = new ChromeDriver();

		driver.manage().window().fullscreen();

		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='uid']")).sendKeys("mngr208713");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UdYvUhU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();
		Thread.sleep(2000);

		String CurrentUrl = driver.getCurrentUrl();

		System.out.println("currentUrl:  " + driver.getCurrentUrl());
		if (driver.findElement(By.xpath("//td[contains(text(),'Manger Id : mngr208713')]")).isDisplayed()) {
			System.out.println("test passed");
		} else {
			System.out.println("test fail");
		}
		driver.findElement(By.xpath("//a[contains(text(),'Log out')]")).click();
		Thread.sleep(3000);
		driver.close();

	}
}
