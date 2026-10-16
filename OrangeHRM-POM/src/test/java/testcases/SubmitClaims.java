package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.ClaimsPage;

public class SubmitClaims extends ProjectSpecificMethods{
@Test
	public void runSubmitClaims() throws InterruptedException {
		ClaimsPage cp = new ClaimsPage(cd);
		cp.submitClaims().addClaimExpense();
	}
}
