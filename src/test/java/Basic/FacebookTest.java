package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class FacebookTest {

	
	@Test
	public void ActitimeTest() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://www.facebook.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	System.out.println("Hello");
		
	}
	
	@Test
	public void OrangeTest() {
	WebDriver driver = new ChromeDriver();
	driver.get("https://opensource-demo.orangehrmlive.com/");
	String actualtitle = driver.getTitle();
	System.out.println(actualtitle);
	System.out.println("Hello");
		
	}
	
	
}
