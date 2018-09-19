//Rule 029 : Transaction MCC matches list of blocked MCCs (Porn, Child Porn, Gambling, etc.) [Decline].


package com.ril.FeedzaiTestScript;

import org.apache.log4j.Logger;
import org.openqa.selenium.By;
import org.testng.Assert;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Transactions;

public class Feedzai_Rule029_Merchant extends FeedzaiTestBaseClass
{
	@Test(priority=31, description="Pulse Changes-Rule 029")
	public void PulseChange_029() throws Exception 
	{
		//******************PULSE PORTAL RULE 029 CHANGES
		logger = Logger.getLogger("Pulse Changes-Rule 029");
		Login_LogOut.Pulse_LogIn();
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("029");
		Thread.sleep(2000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
		Thread.sleep(7000);
		logger.info("RuleSelected");	

		//CHECK RULE IS ENABLED
		boolean checkbox5=driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
		if(checkbox5==true) {
			logger.info("CheckBox is Selected");
		}
		else
		{
			driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
			logger.info("CheckBox is now Selected");
		}


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
		driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE2"));
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
		Thread.sleep(4000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);

		Login_LogOut.PublishRuleSeperate();

	}

	// *****************LISTS for 029

	//029
	@Test(priority=32, description="List changes-Rule 029")
	public void ListChange_029() throws Exception 
	{

		logger = Logger.getLogger("List changes-Rule 029");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("mcc_blocked");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("5511");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for 029");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		//Thread.sleep(4000);
	}   

	//*********************Enable below code when RRN is received through Appium
	//P2M transaction
	@Test(priority=33, description="Validate 029 Rule trigger")
	public void AM_Verify_029() throws Exception 
	{
		logger = Logger.getLogger("Validate 029 Rule trigger");
		Transactions.AppiumTestSetUp();
		Transactions.P2M_Transaction();
		String P2M_RRN1=driver1.findElement(By.id("tvTransactionId")).getText();
		logger.info("P2M RRN is "+P2M_RRN1);
		Thread.sleep(8000);
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(10000);


		//RULE VERIFICATION IN ALERT MANAGER

		Login_LogOut.AM_LogIn();
		driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
		Thread.sleep(4000);
		logger.info("Clicked on Search Page");
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(P2M_RRN1);
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
		Assert.assertTrue(StoreRule.contains("029"));
		logger.info("Rule 029 Triggered");
		Thread.sleep(3000);

		Login_LogOut.AM_LogOut();
		
	}

	//REVERT RULE IN PULSE
	@Test(priority=34, description="Pulse Revert changes-029")
	public void PulseRevert_029() throws Exception 
	{
		logger = Logger.getLogger("Pulse Revert changes-029");
		Login_LogOut.Pulse_LogIn();

		//029
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("mcc_blocked");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("5511");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(8000);

	}

}
