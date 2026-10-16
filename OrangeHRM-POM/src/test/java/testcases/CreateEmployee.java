package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.PIMPage;

public class CreateEmployee extends ProjectSpecificMethods{
	@Test
	public void runCreateEmployee() throws InterruptedException {
		System.out.println(cd);
		
		PIMPage pim = new PIMPage(cd);
		pim.clickPIMLink();
		pim.enterEmployeeDetails();
		pim.clickSubmitButton();	
	}

}
