package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class firstTest {

	@Test
	public void facebookTest() {

		WebDriver driver = new ChromeDriver();
		driver.get("https://www.facebook.com/");
		String actualtitle = driver.getTitle();
		System.out.println(actualtitle);
		System.out.println("Hello");
		
	}

}
