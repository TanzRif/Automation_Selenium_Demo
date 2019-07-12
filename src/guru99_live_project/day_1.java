package guru99_live_project;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.remote.server.handler.SendKeys;

public class day_1 {

	public static WebDriver driver;

	public static void main(String[] args) throws InterruptedException {

		System.setProperty("webdriver.chrome.driver", "C:\\Users\\tanzi\\Desktop\\java-selenium\\geckodriver.exe");

		driver = new ChromeDriver();

		driver.get("http://www.demo.guru99.com/V4/");
		Thread.sleep(5000);
		driver.manage().window().maximize();

		driver.findElement(By.name("uid")).sendKeys("mngr208713");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='password']")).sendKeys("UdYvUhU");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//input[@name='btnLogin']")).click();

		System.out.println("page title: " + driver.getTitle());
		driver.close();

	}

}
