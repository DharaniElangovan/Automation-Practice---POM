package pages;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;


import base.ProjectSpecificMethods;

public class ClaimsPage extends ProjectSpecificMethods{
	public ClaimsPage(ChromeDriver cd) {
		this.cd = cd;
		}

	public ClaimsPage submitClaims() {
		// claims
	
		  cd.findElement(By.xpath("//span[text()='Claim']")).click();
		  cd.findElement(By.linkText("Submit Claim")).click(); 
		  cd.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[1]")).click();
		  cd.findElement(By.xpath("//*[contains(text(),'Medical Reimbursement')]")).click(); 
		  cd.findElement(By.xpath("(//i[@class='oxd-icon bi-caret-down-fill oxd-select-text--arrow'])[2]")).click();
		  cd.findElement(By.xpath("//*[contains(text(),'Indian Rupee')]")).click();
		  cd.findElement(By.tagName("textarea")).sendKeys("Fatty Liver");
		  cd.findElement(By.xpath("//button[@type='submit']")).click();
		  return this;
	}
	public ApplyLeavePage addClaimExpense() {
		  cd.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		  cd.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--text'][1]")).click(); 
		  cd.findElement(By.xpath("//div[@class='oxd-select-text oxd-select-text--active']")).click();
		  cd.findElement(By.xpath("//*[contains(text(),'Planned Surgery')]")).click();
		  cd.findElement(By.xpath("//input[@placeholder='yyyy-dd-mm']")).sendKeys("2026-09-07");
		  cd.findElement(By.xpath("//body/div[@id='app']/div[@class='oxd-layout orangehrm-upgrade-layout']/div[@class='oxd-layout-container']/div[@class='oxd-layout-context']/div[@class='orangehrm-background-container']/div[@class='orangehrm-paper-container']/div[@role='dialog']/div[@class='oxd-dialog-container-default']/div[@class='oxd-dialog-container-default--inner']/div[@role='document']/form[@class='oxd-form']/div[@class='oxd-form-row']/div[@class='oxd-grid-2 orangehrm-full-width-grid']/div[@class='oxd-grid-item oxd-grid-item--gutters']/div[@class='oxd-input-group oxd-input-field-bottom-space']/div/input[1]")).sendKeys("100000"); 
		  //xpath("//input[@xpath='1']")).sendKeys("100000");
		  cd.findElement(By.xpath("//button[@type='submit']")).click();//save button
		  WebDriverWait wait1 = new WebDriverWait(cd, Duration.ofSeconds(10));
		  //WebElement submitButton = cd.findElement(By.xpath("//button[@class='oxd-button oxd-button--medium oxd-button--secondary orangehrm-sm-button']"));//overall claim submit button
		  wait1.until(ExpectedConditions.invisibilityOfElementLocated(By.className("loading-spinner")));
		  cd.findElement(By.xpath("//button[normalize-space()='Submit']")).click();//overall claim submit button
		 return new ApplyLeavePage(cd);
	}


}
