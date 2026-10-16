package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.RecruitmentPage;

public class VerifyRecruitment extends ProjectSpecificMethods{
	@Test
	public void runVerifyecruitment() throws InterruptedException {
		
		System.out.println(cd);
		RecruitmentPage rp = new RecruitmentPage(cd);
		rp.verifyRecruitment();
		rp.getCount();
	}

}
