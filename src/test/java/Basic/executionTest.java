package Basic;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.Test;

public class executionTest {
	
	@Test(groups="Food")
	public void Swiggy() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.swiggy.com");
	}
	
	@Test(groups="Food")
	public void Zomato() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.zomato.com/");
	}
	
	@Test
	public void Instagram() {
		WebDriver driver = new ChromeDriver();
		driver.get("https://www.instagram.com/");
	}

	
}
