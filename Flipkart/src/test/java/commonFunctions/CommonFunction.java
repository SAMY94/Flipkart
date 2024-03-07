package commonFunctions;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;

public class CommonFunction {

	WebDriver driver;
	@BeforeTest
	public void browserLaunch() {
		driver = new ChromeDriver();
		driver.get("https://www.flipkart.com/");
		driver.manage().window().maximize();
	}
	@AfterTest
	public void tearDown() {
		driver.quit();
	}
}
