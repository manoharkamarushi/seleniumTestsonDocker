package docker.tests;

import java.net.URL;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.remote.RemoteWebDriver;
import org.testng.annotations.Test;

public class SeleniumGridTest {
	WebDriver driver=null;
	String pageTitle=null;

	@Test
	public void init() throws Exception {

		ChromeOptions options = new ChromeOptions();
		driver = new RemoteWebDriver(new URL("http://localhost:4444/wd/hub"), options);
		System.out.println("init");

	}
	
	@Test
	public void t1() {
		
		driver.get("https://www.google.com");
		pageTitle= driver.getTitle();
		System.out.println("Test 1 "+pageTitle);
	}

	@Test
	public void teardown() {
		System.out.println("teardown");
		driver.quit();
	}

}
