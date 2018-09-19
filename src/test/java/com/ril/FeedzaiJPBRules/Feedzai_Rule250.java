//#RULE 250 : JPB - Too many cash deposits by an agent to a bank account in a day over the limit [Alert]
//RULE250a : JPB - Too many cash deposits by an agent to a bank account in a calendar month is over the limit[Alert].
//RULE 250D : JPB - Too many agents depositing cash to a bank account in a day is over the limit [Alert].

package com.ril.FeedzaiJPBRules;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Agent_Services;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.TakeScreenshot;

public class Feedzai_Rule250 extends FeedzaiTestBaseClass{
	@BeforeClass(description="Pulse Login")
	public void searchOpen() throws Exception
	{
		Login_LogOut.Pulse_LogIn();
	}
	
	@Test(priority=30,description="Pulse Revert changes-250")
	public void AgentRuleTest_250() throws Exception{
		
		//PULSE PORTAL RULE#250 CHANGE
		logger1 = extent.createTest("Pulse Changes-Rule 250");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("Rule#250 Selected");
		
		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();
		
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Tye Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
		logger.info("RULE 250 CHANGES SAVED");
		Thread.sleep(5000);
		
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
		Thread.sleep(4000);
		logger.info("RULE 250 LIMIT SELECTED");
		//driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
		//Thread.sleep(6000);
		
		Login_LogOut.EnableLimitCheckbox();
		Thread.sleep(1000);
		logger.info("LIMIT CHECKBOX VERIFIED");
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("2");
		Thread.sleep(1000);
		logger.info("AMOUNT LIMIT SET");
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).clear();
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("0");
		logger.info("COUNT LIMIT SET");
		Thread.sleep(1000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(7000);
		logger.info("RULE 250 CHANGES COMPLETED");
	}

	
	@Test(priority=31,description="Pulse Revert changes-250a")
	public void AgentRuleTest_250A() throws Exception{
		//PULSE PORTAL RULE#250a CHANGE
		        logger1 = extent.createTest("Pulse Changes-Rule 250a");
		        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		        Thread.sleep(2000);
		      //  driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		       // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
		      //  Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250a");
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
				Thread.sleep(7000);
				logger.info("Rule#250a Selected");
				
				//CHECK RULE IS ENABLED
				Login_LogOut.EnableCheckbox();
				
				driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
				Thread.sleep(4000);
				logger.info("Alert Tye Selected");
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
				Thread.sleep(9000);
				logger.info("RULE 250a CHANGES SAVED");
				Thread.sleep(5000);
				
				logger.info("RULE 250a CHANGES SAVED");
				Thread.sleep(5000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250a_limit");
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
				Thread.sleep(6000);
				
				Login_LogOut.EnableLimitCheckbox();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("7");
				Thread.sleep(1000);
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
				Thread.sleep(1000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
				Thread.sleep(9000);
			}

	@Test(priority=31,description="Pulse Changes-250d")
	public void AgentRuleTest_250d() throws Exception{
		//PULSE PORTAL RULE#250 CHANGE
		        logger1 = extent.createTest("Pulse Changes-Rule 250d");
		        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		        Thread.sleep(2000);
	           // driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).clear();
	           // Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("250d");
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
				Thread.sleep(7000);
				logger.info("Rule#250d Selected");
				
				//CHECK RULE IS ENABLED
				Login_LogOut.EnableCheckbox();
				
				driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
				Thread.sleep(3000);
				driver.findElement(By.xpath(pro.getProperty("pulse_ActionAlert"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
				Thread.sleep(2000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE3"));
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
				Thread.sleep(4000);
				logger.info("Alert Tye Selected");
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
				Thread.sleep(9000);
				logger.info("RULE 250d CHANGES SAVED");
				Thread.sleep(5000);
		
				driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
				Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250d_limit");
				Thread.sleep(4000);
			//	driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
				//Thread.sleep(4000);
				driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
				Thread.sleep(6000);
				
				Login_LogOut.EnableLimitCheckbox();
				Thread.sleep(1000);
				
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("3");
				Thread.sleep(1000);
				driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
				Thread.sleep(1000);
				driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
				Thread.sleep(4000);
				Login_LogOut.Pulse_LogOut();
			

				String TransactionId=Agent_Services.CashDeposit_BCServices();	
				
	
	
				
	//RULE VERIFICATION IN ALERT MANAGER
	Login_LogOut.AM_LogIn();
	driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
	Thread.sleep(4000);
	logger.info("Clicked on Search Page");
	driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
	Thread.sleep(4000);
	//driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(TransactionId);
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
	Thread.sleep(7000);
	logger.info("BillPayment Transaction Viewed");
	String StoreRule = driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
	System.out.println(StoreRule);
	Thread.sleep(3000);

	SoftAssert sa=new SoftAssert();
	TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
	sa.assertTrue(StoreRule.contains("Rule #250"));
	sa.assertTrue(StoreRule.contains("Rule #250a"));
	sa.assertTrue(StoreRule.contains("Rule #250d")); 

	
}  
	
	@Test(priority=32, description="Pulse Revert changes-250")
	public void PulseRevert_250() throws Exception {
	
	logger1 = extent.createTest("Pulse Revert changes-250");
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250_limit");
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("10000");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("0");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	Thread.sleep(4000);
}
	
	
	@Test(priority=33, description="Pulse Revert changes-250a")
	public void PulseRevert_250a() throws Exception {
	
	logger1 = extent.createTest("Pulse Revert changes-250a");
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250a_limit");
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	Thread.sleep(6000);
	
	
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("100000");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
	Thread.sleep(9000);
}
	@Test(priority=34, description="Pulse Revert changes-250d")
	public void PulseRevert_250d() throws Exception {
	
    logger1 = extent.createTest("Pulse Revert changes-250d");
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r250d_limit");
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clicklimit"))).click();
	Thread.sleep(4000);
	driver.findElement(By.xpath(pro.getProperty("pulse_clickGloballimit"))).click();
	Thread.sleep(6000);
	
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).clear();
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleamountEntry"))).sendKeys("300000");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_RuleCountEntry"))).sendKeys("1");
	Thread.sleep(1000);
	driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
	Thread.sleep(4000);
	Login_LogOut.Pulse_LogOut();

}
	
}
