//Rule 040 : Customer on watch list [Alert]
//Rule 067a : Customer present in suspicious account list [Alert].
//Rule 108a : Prohibited transaction from blacklisted BIN [Decline - Ignore]
//Rule 166 : Load money amount for credit/debit card present in load money grey list is over the defined limit [Decline Limit].

package com.ril.FeedzaiTestScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Transactions;

public class Feedzai_Rule040_067a_108a_166_Consumer extends FeedzaiTestBaseClass
{

	//******************PULSE PORTAL RULE 040 CHANGES
	
	@Test(priority=46, description="Pulse Changes-Rule 040")
	public void PulseChange_040() throws Exception 
	{

		Login_LogOut.Pulse_LogIn();
		logger1 = extent.createTest("Pulse Changes-Rule 040");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("40");
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
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("watch_list_customer");
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
		logger.info("CheckBox is Selected for 040");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);
	}

	//******************PULSE PORTAL RULE 067a CHANGES
	@Test(priority=47, description="Pulse Changes-Rule 067a")
	public void PulseChange_067a() throws Exception 
	{

		logger1 = extent.createTest("Pulse Changes-Rule 067a");
		
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("067a");
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
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("suspicious_customer");
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
		logger.info("CheckBox is Selected for 067a");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

	}

	//******************PULSE PORTAL RULE 108a CHANGES
	@Test(priority=48, description="Pulse Changes-Rule 108a")
	public void PulseChange_108a() throws Exception 
	{

		logger1 = extent.createTest("Pulse Changes-Rule 108a");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("108a");
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
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("bins_blacklist");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("532676");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for 108a");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);
	}

	//******************PULSE PORTAL RULE 166 CHANGES
	@Test(priority=49, description="Pulse Changes-Rule 166")
	public void PulseChange_166() throws Exception 
	{

		logger1 = extent.createTest("Pulse Changes-Rule 166");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");

		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("166");
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

		//list
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("loadmoney_greylist");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("Loadmoney_greylist_entry"))).sendKeys("532676XXXXXX4591");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for 166");
		driver.findElement(By.xpath(pro.getProperty("Amount"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Amount"))).sendKeys("5");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(4000);

		Login_LogOut.Pulse_LogOut(); 
	}

	//*********************Enable below code when RRN is received through Appium

	@Test(priority=50, description="Validate Rule 040_067a_108a_166 trigger")
	public void AM_Verify_040_067a_108a_166() throws Exception 
	{
		//LMW transaction
		logger1 = extent.createTest("Validate Rule 040_067a_108a_166 trigger");
		Transactions.AppiumTestSetUp();
		String LMW_RRN1=Transactions.LMW_Transaction();
	

		/*	//Bill pay through closed loop
				Transactions.BillPayClosedLoop();
				String IBW_RRN=driver.findElement(By.id("tvTransactionId")).getText();
				logger.info("IBW RRN is "+IBW_RRN);
				Thread.sleep(4000);
				driver.findElement(By.id("btnHome")).click();
				Thread.sleep(4000); */

		//RULE VERIFICATION IN ALERT MANAGER

		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(LMW_RRN1);
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
		SoftAssert sa=new SoftAssert();
		sa.assertTrue(StoreRule.contains("040"));
		logger.info("Rule 040 Triggered");
		sa.assertTrue(StoreRule.contains("067a"));
		logger.info("Rule 067a Triggered");
		sa.assertTrue(StoreRule.contains("108a"));
		logger.info("Rule 108a Triggered");
		sa.assertTrue(StoreRule.contains("166"));
		logger.info("Rule 166 Triggered");
		Thread.sleep(3000);
		/*	driver.findElement(By.xpath(pro.getProperty("NavigateRight"))).click();
				Thread.sleep(3000);
				String StoreRule1=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
				System.out.println(StoreRule1);
				Thread.sleep(3000);
				Assert.assertTrue(StoreRule1.contains("200"));
				logger.info("Rule 200 Triggered"); */
		Login_LogOut.AM_LogOut();
	}

	@Test(priority=51, description="Pulse Revert changes-040")
	public void PulseRevert_040() throws Exception 
	{

		//REVERT RULE IN PULSE
		Login_LogOut.Pulse_LogIn();

		//040
		logger1 = extent.createTest("Pulse Revert changes-040");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("watch_list_customer");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("1100231978");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(4000);

	}

	@Test(priority=52, description="Pulse Revert changes-067a")
	public void PulseRevert_067a() throws Exception 
	{
		//067a
		logger1 = extent.createTest("Pulse Revert changes-067a");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("suspicious_customer");
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

	}

	@Test(priority=53, description="Pulse Revert changes-108a")
	public void PulseRevert_108a() throws Exception 
	{
		//108a
		logger1 = extent.createTest("Pulse Revert changes-108a");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("bins_blacklist");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("532676");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(4000);

	}

	@Test(priority=54, description="Pulse Revert changes-166")
	public void PulseRevert_166() throws Exception 
	{
		//166
		logger1 = extent.createTest("Pulse Revert changes-166");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("loadmoney_greylist");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("532676XXXXXX4591");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(8000);

	}
}
