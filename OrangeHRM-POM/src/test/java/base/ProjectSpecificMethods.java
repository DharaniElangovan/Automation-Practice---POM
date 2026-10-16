package base;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.testng.annotations.BeforeMethod;
import org.testng.annotations.Parameters;

public class ProjectSpecificMethods {
	public ChromeDriver cd=new ChromeDriver();
@Parameters({ "url"})
 @BeforeMethod
	public void openBrowser(String url) {
	
		cd.get(url);
		cd.manage().window().maximize();
		cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
	
		cd.findElement(By.name("username")).sendKeys("Admin");
		// cd.findElement(By.xpath("//input[@name='username']"));
		cd.findElement(By.name("password")).sendKeys("admin123");
		cd.findElement(By.xpath("//button[@type='submit']")).click();
		
	}


}
