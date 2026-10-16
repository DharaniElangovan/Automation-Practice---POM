package testcases;

import org.testng.annotations.Test;

import base.ProjectSpecificMethods;
import pages.ApplyLeavePage;

public class ApplyLeave extends ProjectSpecificMethods{
	@Test
	public void applyLeaves() throws InterruptedException {
		ApplyLeavePage ap = new ApplyLeavePage(cd);
		ap.applyLeave().getLeaveCount();
		
		
	}

}
