package nz.co.deverall.selenium.example;

import java.util.concurrent.TimeUnit;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Main {

	private WebDriver driver;
	private String baseUrl;
	
	public static void main(String args[]) throws Exception { 
		Main test = new Main();
		test.setUp();
		test.playAwesomeVideo();
		test.tearDown();
	}
	
	public void setUp() throws Exception {
		driver = new FirefoxDriver();
		baseUrl = "https://www.youtube.com";
		driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);
	}

	public void playAwesomeVideo() throws Exception {
		driver.get(baseUrl + "/results?search_query=rick+astley+never+gonna+give+you+up");
	    driver.findElement(By.id("masthead-search-term")).clear();
	    driver.findElement(By.id("masthead-search-term")).sendKeys("rick astley never gonna give you up");
	    driver.findElement(By.linkText("Rick Astley - Never Gonna Give You Up [HQ]")).click();
	}

	public void tearDown() throws Exception {
		//driver.quit(); // remove this comment to exit the browser
	}
}
