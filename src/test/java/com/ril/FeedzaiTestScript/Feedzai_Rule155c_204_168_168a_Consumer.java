//Rule 155c : Loadmoney instrument which starts with 6 is attempted for an amount more than a limit [Alert].
//Rule 204 : Block all outgoing transactions from wallet for a specific customer [Decline].
//Rule 168 : Too many bill payments in a single day from the same credit card, debit card or account and the same sender [Decline Limit - Ignore].
//Rule 168a : Number many bill payments in a single day from the same customer exceed the limit [Decline - Ignore].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Transactions;

public class Feedzai_Rule155c_204_168_168a_Consumer extends FeedzaiTestBaseClass 
{

	//******************PULSE PORTAL RULE 155c CHANGES
	@Test(priority=55, description="Pulse Changes-Rule 155c")
	public void PulseChange_155c() throws Exception 
	{
		
		Login_LogOut.Pulse_LogIn();
		logger1 = extent.createTest("Pulse Changes-Rule 155c");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		//Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("155c");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE1"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		//list
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r155c_limit");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("LowKycItem"))).click();
		Thread.sleep(3000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		logger.info("CheckBox is Selected for 155c");
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).sendKeys("5");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

	}

	//******************PULSE PORTAL RULE 204 CHANGES

	@Test(priority=56, description="Pulse Changes-Rule 204")
	public void PulseChange_204() throws Exception 
	{
		logger1 = extent.createTest("Pulse Changes-Rule 204");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("204");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();

		Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE1"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		//list

		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("outgoing_block");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("1100231978");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for 204");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

	}

	//******************PULSE PORTAL RULE 168 CHANGES

	@Test(priority=57, description="Pulse Changes-Rule 168")
	public void PulseChange_168() throws Exception 
	{

		logger1 = extent.createTest("Pulse Changes-Rule 168");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("168");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();
		
		driver.findElement(By.xpath(pro.getProperty("pulse_variable"))).click();
		Thread.sleep(5000);
		//case "setcodemirrortextbox":
		JavascriptExecutor js = (JavascriptExecutor) driver;
		//System.out.println(ObjectSetVal);
		String ObjectSetVal = "attempted_sender_billpay_day_count = (approved_sender_billpay_day[event.sender_id, event.sender_pan].count ?? 0) + 1;limit = 0;";
		String condition = ObjectSetVal.toString();
		//System.out.println(condition);
		js.executeScript("arguments[0].CodeMirror.setValue('" + ObjectSetVal.trim() + "');", driver.findElement(By.xpath(pro.getProperty("pulse_conditionstatement"))));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_savechanges"))).click();
		Thread.sleep(4000);
		logger.info("VariableDetailsUpdated");

		Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE1"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

	}

	//******************PULSE PORTAL RULE 168a CHANGES

	@Test(priority=58, description="Pulse Changes-Rule 168a")
	public void PulseChange_168a() throws Exception 
	{

		logger1 = extent.createTest("Pulse Changes-Rule 168a");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("168a");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		Login_LogOut.EnableCheckbox();
		
		Login_LogOut.ScrollPage();
		driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("RuleAct"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE1"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		Login_LogOut.PublishRuleSeperate();
		
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r168a_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		Login_LogOut.EnableLimitCheckbox();
		logger.info("CheckBox is Selected for 168a");
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).sendKeys("0");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

		Login_LogOut.Pulse_LogOut(); 

	} 
	
		
	//*********************Enable below code when RRN is received through Appium

	@Test(priority=59, description="Validate Rule 155c_204_168_168a trigger")
	public void AM_Verify_155c_204_168_168a() throws Exception 
	{

		// ************** For rule 155c 
		//LMW transaction
		logger1 = extent.createTest("Validate Rule 155c_204_168_168a trigger");
		Transactions.AppiumTestSetUp();
		/*String LMW_RRN1=Transactions.LMW_155c();
		driver1.findElement(By.id("btnHome")).click(); 
	
		//*************** For rule 204, 168, 168a
		//Bill pay through closed loop
		
		Thread.sleep(5000);*/
		String IBW_RRN1=Transactions.BillPayClosedLoop();
		//String IBW_RRN1=Transactions.BillPayOpenLoop();
		logger.info("IBW RRN is "+IBW_RRN1);
	

		//RULE VERIFICATION IN ALERT MANAGER

		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		//driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(LMW_RRN1);
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("Transaction Viewed");
		String StoreRule=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule);
		Thread.sleep(3000);
		//TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		SoftAssert sa = new SoftAssert();
		sa.assertTrue(StoreRule.contains("155c"));
		logger.info("Rule 155c Triggered");


		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(IBW_RRN1);
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
		Thread.sleep(7000);
		logger.info("Transaction Viewed");
		String StoreRule1=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule1);
		Thread.sleep(3000);
		//TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		sa.assertTrue(StoreRule1.contains("204"));
		logger.info("Rule 204 Triggered");
		sa.assertTrue(StoreRule1.contains("168"));
		logger.info("Rule 168 Triggered");
		sa.assertTrue(StoreRule1.contains("168a"));
		logger.info("Rule 168a Triggered");

		Login_LogOut.AM_LogOut();

	}
	//REVERT RULE IN PULSE

	@Test(priority=60, description="Pulse Revert changes-155c")
	public void PulseRevert_155c() throws Exception 
	{

		Login_LogOut.Pulse_LogIn();

		//155c
		logger1 = extent.createTest("Pulse Revert changes-155c");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r155c_limit");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("LowKycItem"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).click();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).clear();
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("limit_Amount"))).sendKeys("50000");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

	}

	@Test(priority=61, description="Pulse Revert changes-204")
	public void PulseRevert_204() throws Exception 
	{

		//204
		logger1 = extent.createTest("Pulse Revert changes-204");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("outgoing_block");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("1100231978");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

	}

	@Test(priority=62, description="Pulse Revert changes-168a")
	public void PulseRevert_168a() throws Exception 
	{
		//168a
		logger1 = extent.createTest("Pulse Revert changes-168a");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("r168a_limit");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).clear();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("globalLimit"))).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(8000);

		Login_LogOut.Pulse_LogOut();
	}
}
