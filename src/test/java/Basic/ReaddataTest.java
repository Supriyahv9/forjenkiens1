package Basic;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.testng.annotations.Test;


public class ReaddataTest {
	
	public WebDriver driver;
	@Test
	public void Readdataexcel() throws IOException {
	
	FileInputStream fis = new FileInputStream("src\\test\\resources\\file.properties");
	Properties p = new Properties();
	p.load(fis);
	String BROWSER = p.getProperty("browser");
	String URL = p.getProperty("url");
	String USERNAME = p.getProperty("username");
	String PASSWORD = p.getProperty("password");
	
	if(BROWSER.equalsIgnoreCase("Chrome")) {
		driver = new ChromeDriver();
	}else if(BROWSER.equalsIgnoreCase("Firefox")) {
		driver = new FirefoxDriver();
	}else {
		driver = new EdgeDriver();
	}
	
	driver.get(URL);
	driver.findElement(By.name("user_name")).sendKeys(USERNAME);
	driver.findElement(By.name("user_password")).sendKeys(PASSWORD);
	driver.findElement(By.id("submitButton")).click();
	
	
	

}
}
