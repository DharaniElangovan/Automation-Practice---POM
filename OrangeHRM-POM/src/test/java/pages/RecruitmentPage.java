package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.ProjectSpecificMethods;

public class RecruitmentPage extends ProjectSpecificMethods{
	public RecruitmentPage(ChromeDriver cd) {
		this.cd = cd;
		}

	public RecruitmentPage verifyRecruitment(){
		
		
		  cd.findElement(By.xpath("//span[normalize-space()='Recruitment']")).click();
		  cd.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		  cd.findElement(By.xpath("//*[contains(text(),'Payroll Administrator')]")).click();
		  //cd.findElement(By.xpath("//*[contains(text(),'Junior Account Assistant')]")).click(); 
		  cd.findElement(By.xpath("//button[@type='submit']")).click();
		  return this;
	}
    public ClaimsPage getCount() {
		  WebDriverWait wait = new WebDriverWait(cd, Duration.ofSeconds(10));
		  
		  WebElement recordFound =wait.until(ExpectedConditions.visibilityOfElementLocated(By.xpath("//span[@class='oxd-text oxd-text--span']"))); 
		  String text = recordFound.getText(); System.out.println(text);
		  if(recordFound.isDisplayed()) { 
			   System.out.println(text);} 
		  else { 
		     System.out.println("No Records Found"); 
		     
	    
		  }
		  return new ClaimsPage(cd);
	}

}
