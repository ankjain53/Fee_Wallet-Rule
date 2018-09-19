//RULE 039a : Customer on negative list [Decline].
//Rule 039d : Card PAN on negative list [Decline].
//Rule 039f : Customer or merchants or beneficiary's phone number on negative list [Decline].
//Rule 200 : Customer device ID on negative list [Decline].
//Rule 165 : Load money credit/debit card present in load money black list [Decline].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;
import org.testng.annotations.BeforeClass;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.Transactions;

public class Feedzai_Rule039a_039d_039f_200_165_Consumer extends FeedzaiTestBaseClass 
{
	@BeforeClass(description="Pulse Login")
	public void searchOpen() throws Exception
	{
		Login_LogOut.Pulse_LogIn();
	}
	
	@Test(priority=35, description="Pulse Changes-Rule 039a")
	public void PulseChange_039a() throws Exception 
	{
		//******************PULSE PORTAL RULE 039a CHANGES
	
		logger1 = extent.createTest("Pulse Changes-Rule 039a");
		
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39a");
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
		Thread.sleep(8000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(10000);
	
		//list

		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
        
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("customer_negative");
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
		logger.info("CheckBox is Selected for 39a");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(10000);
	
		
	}
	
	@Test(priority=36, description="Pulse Changes-Rule 039f")
	public void PulseChange_039f() throws Exception 
	{
		//******************PULSE PORTAL RULE 039f CHANGES
		
		logger1 = extent.createTest("Pulse Changes-Rule 039f");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39f");
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
		Thread.sleep(8000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(9000);
       
		//list

		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("phone");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("+919559559559");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for list 39f");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(10000);

		
	}
	
	@Test(priority=37, description="Pulse Changes-Rule 039d")
	public void PulseChange_039d() throws Exception 
	{
		//************************PULSE PORTAL RULE 039d CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 039d");
		
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39d");
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
		Thread.sleep(8000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(15000);
	
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
        Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("card_pan_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("2812320600688820");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for list 39d");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(10000);


	}
	
	@Test(priority=38, description="Pulse Changes-Rule 165")
	public void PulseChange_165() throws Exception 
	{

		//******************PULSE PORTAL RULE 165 CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 165");
		
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("165");
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
		Thread.sleep(8000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(15000);
	
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("openloop_card_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("OKODc3pWMZdLP6s2Qv9-b7__QHESPAaRO30TA4CZzkU");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for list 165");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(10000);


	}
	
	@Test(priority=39, description="Pulse Changes-Rule 200")
	public void PulseChange_200() throws Exception 
	{

		//******************PULSE PORTAL RULE 200 CHANGES
		logger1 = extent.createTest("Pulse Changes-Rule 200");
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
		Thread.sleep(5000);
		logger.info("Clicked on Rule tab");
		driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("200");
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
		Thread.sleep(8000);
		logger.info("Alert Type Selected");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveRuleChanges"))).click();
		Thread.sleep(15000);

		Login_LogOut.PublishRuleSeperate();
		
		driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
		Thread.sleep(5000);
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("customer_device_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("AddButton"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("NewItemValue"))).sendKeys("ENU7N15C15001133_Huawei Nexus 6P");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("Comment"))).sendKeys("Test");
		Thread.sleep(4000);
		//CHECK LIMIT IS ENABLED
		driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
		logger.info("CheckBox is Selected for list 200");
		driver.findElement(By.xpath(pro.getProperty("pulse_SaveEntry"))).click();
		Thread.sleep(10000);

		Login_LogOut.Pulse_LogOut();
		
	} 

	
	
	
		//*********************Enable below code when RRN is received through Appium
	
	@Test(priority=40, description="Validate 039a_039d_039f_200_165 Rule trigger")
	public void AM_Verify_039a_039d_039f_200_165() throws Exception 
	{
		//LMW transaction
		logger1 = extent.createTest("Validate 039a_039d_039f_200_165 Rule trigger");
		Transactions.AppiumTestSetUp();
		String LMW_RRN1=Transactions.LMW_Transaction();
		Thread.sleep(3000);
		Transactions.LogoutWallet();


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
		 SoftAssert sa=new SoftAssert();
		//TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
		sa.assertTrue(StoreRule.contains("039a"));
		logger.info("Rule 039a Triggered");
		sa.assertTrue(StoreRule.contains("039d"));
		logger.info("Rule 039d Triggered");
		sa.assertTrue(StoreRule.contains("039f"));
		logger.info("Rule 039f Triggered");
		sa.assertTrue(StoreRule.contains("165"));
		logger.info("Rule 165 Triggered");
		Thread.sleep(3000);
		driver.findElement(By.xpath(pro.getProperty("NavigateRight"))).click();
		Thread.sleep(3000);
		String StoreRule1=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
		System.out.println(StoreRule1);
		Thread.sleep(7000);
		
		sa.assertTrue(StoreRule1.contains("200"));
		logger.info("Rule 200 Triggered");
		Login_LogOut.AM_LogOut();

	}
		//REVERT RULE IN PULSE

	@Test(priority=41, description="Pulse Revert changes-039a")
	public void PulseRevert_039a() throws Exception 
	{
		
		logger1 = extent.createTest("Pulse Revert changes-039a");
		Login_LogOut.Pulse_LogIn();

		//039a
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("customer_negative");
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
		Thread.sleep(10000);

		driver.navigate().refresh();
	}
	
	@Test(priority=42, description="Pulse Revert changes-039f")
	public void PulseRevert_039f() throws Exception 
	{
		//039f
		logger1 = extent.createTest("Pulse Revert changes-039f");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("phone");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("+919559559559");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(10000);
		driver.navigate().refresh();

	}
	
	@Test(priority=43, description="Pulse Revert changes-039d")
	public void PulseRevert_039d() throws Exception 
	{
		//039d
		logger1 = extent.createTest("Pulse Revert changes-039d");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("card_pan_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("2812320600688820");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
	}
	
@Test(priority=44, description="Pulse Revert changes-165")
	public void PulseRevert_165() throws Exception 
	{
		//165
	logger1 = extent.createTest("Pulse Revert changes-165");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("openloop_card_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("OKODc3pWMZdLP6s2Qv9-b7__QHESPAaRO30TA4CZzkU");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(10000);
		driver.navigate().refresh();
	} 
	
	@Test(priority=45, description="Pulse Revert changes-200")
	public void PulseRevert_200() throws Exception 
	{
		//200
		logger1 = extent.createTest("Pulse Revert changes-200");
		driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("customer_device_negative");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ClickonList"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).click();
		Thread.sleep(6000);
		driver.findElement(By.xpath(pro.getProperty("ListItemEntry"))).sendKeys("H5312X5720123456_Infinix X572");
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteFromTrash"))).click();
		Thread.sleep(4000);
		driver.findElement(By.xpath(pro.getProperty("DeleteButton"))).click();
		Thread.sleep(10000);
		Login_LogOut.Pulse_LogOut();
	}
}
