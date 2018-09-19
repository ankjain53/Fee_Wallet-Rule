//Rule 039f : Customer or merchants or beneficiary's phone number on negative list [Decline].
//Rule 027f : Attempted transaction amount at the merchant is above the specified limit [Decline].
//Rue 146 : Cumulative amount of merchant transactions in Jio Money cards today above daily limit [Decline Limit].

package com.ril.FeedzaiTestScript;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.testng.Assert;
import org.testng.annotations.Test;
import org.testng.asserts.SoftAssert;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import com.ril.Feedzai.Utility.Login_LogOut;
import com.ril.Feedzai.Utility.TakeScreenshot;
import com.ril.Feedzai.Utility.Transactions;
public class Feedzai_Rule039f_027f_146_Merchant extends FeedzaiTestBaseClass

{
	
	/*@Test(priority=80,description="Validation of merchant rules 39f")
	      
	public void Rule39f() throws Exception
    
	{
		
		//39f  
		    logger1 = extent.createTest("Validation of merchant rules 39f");
		   Login_LogOut.Pulse_LogIn();
		   driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39f");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#39b Selected");
	        Login_LogOut.EnableCheckbox();
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("rule_act"))).click();
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
	        driver.findElement(By.xpath(pro.getProperty("rule_save"))).click();
	        logger.info("Rule 39f rule setup is done ");
	       
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("phone_number_negative");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Add_merchant1"))).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("MID"))).sendKeys(pro.getProperty("phone_no"));
	        driver.findElement(By.xpath(pro.getProperty("mid_comment"))).sendKeys("Merchant phone number added in negative list");
	       
	        boolean checkbox=driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
	        if(checkbox==true) {
	        logger.info("CheckBox is Selected");

	         }
	        else
	        	
	        {
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
	        logger.info("CheckBox is now Selected");
	         }
	        
	        driver.findElement(By.xpath(pro.getProperty("mid_save"))).click();
	        logger.info("39F list Setup is done");
	        logger.info("39F setup is done");
	        //driver.findElement(By.xpath(pro.getProperty("mid_cancle"))).click();
     }  */
	
	
	   @Test(priority=81,description="Validation of merchant rules #146")      
	   public void Rule146() throws Exception
	       
	    {
       
		   //Rule 146
		   logger1 = extent.createTest("Validation of merchant rules #146");
	       Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        Thread.sleep(5000);
	        logger.info("Clicked on Rule");
	        Thread.sleep(4000);
		    driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("146");
		    logger.info("Searched 146k");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#146b Selected");
	        Login_LogOut.EnableCheckbox();
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("rule_act"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_ActionBlock"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).clear();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SelectAlertType"))).sendKeys(pro.getProperty("ALERTTYPE2"));
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SaveAlertType"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("rule_save"))).click();
	        logger.info("146 list rule updated");
	      
	        logger.info("146 list updated");  
	    
	   }      
	        
	 
	   @Test(priority=82,description="Validation of merchant rules #27f")
		      
	    public void Rule27f() throws Exception
	      {
		    logger1 = extent.createTest("Validation of merchant rules #27f");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        Thread.sleep(5000);
	        logger.info("Clicked on Rule");
	       Thread.sleep(4000);
		    driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("27f");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#27f Selected");
	        Thread.sleep(2000);
	        Login_LogOut.EnableCheckbox();
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("rule_act"))).click();
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
	        driver.findElement(By.xpath(pro.getProperty("rule_save"))).click();
	        logger.info("Alert Tye Selected");
	        logger.info("Rule#27f Setup done");
	        //publish 
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_publish"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_Rpublish"))).click();
	        Thread.sleep(6000);
	        driver.findElement(By.xpath("//span[@class='txt'][contains(text(),'Close')]")).click();
	        Thread.sleep(2000);
	        logger.info("Publish is done");
	        //list
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("27f");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Add_merchant1"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("27e_key"))).sendKeys(pro.getProperty("mid_dt"));
	        driver.findElement(By.xpath(pro.getProperty("mid_comment"))).sendKeys("Merchant id 27F rule list");
	       
	        boolean checkbox2=driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
	        if(checkbox2==true) {
	        logger.info("CheckBox is Selected");

	         }
	        else
	        {
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
	        logger.info("CheckBox is now Selected");
	         }
	        driver.findElement(By.xpath(pro.getProperty("27e_amt"))).sendKeys(pro.getProperty("amount"));
	        
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("mid_save"))).click();
	        logger.info("27F list updated");
	       
	        Login_LogOut.Pulse_LogOut(); 
	    
	     
} 
	   
	   
	 @Test(priority=83,description="Validation of 27f_146 in alert manager")
		      
	  public void AM() throws Exception
	      {    
			logger1 = extent.createTest("Validate Rule 155c_204_168_168a trigger");
			Transactions.AppiumTestSetUp();
			String P2M_RRN1=Transactions.P2M_Transaction();
			Transactions.LogoutWallet();
		   
		    SoftAssert SA=new SoftAssert();
		    logger1 = extent.createTest("Validation of 27f_146 in alert manager");
	        Login_LogOut.AM_LogIn();      
	        driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
	        Thread.sleep(4000);
	        logger.info("Clicked on Search Page");
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
	        Thread.sleep(4000);
	        //Agent_BillPayment.Agent_MobileBillPayment();
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys(P2M_RRN1);
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("AM_SearchTransactionId"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("AM_ViewTransactionId"))).click();
	        Thread.sleep(7000);
	        logger.info("Transaction Viewed");
	        //Login_LogOut.ScrollPage();
	       String StoreRule=driver.findElement(By.xpath(pro.getProperty("AM_VerifyRuleTriggered"))).getText();
	        System.out.println(StoreRule);
	        Thread.sleep(3000);
	        TakeScreenshot.captuerScreenshot(driver, "Rules Captured ");
	       // SA.assertTrue(StoreRule.contains("39f"));
	        SA.assertTrue(StoreRule.contains("27f"));
	        SA.assertTrue(StoreRule.contains("146"));
	       // Assert.assertTrue(StoreRule.contains("146"));
	      
	        logger.info("Rule 27f Triggered");
	        logger.info("AM part executed");
	        Login_LogOut.AM_LogOut();    
	    
	      }      
	 
	        
	/*  @Test(priority=84,description="Revert rule 39f")
     
	  public void R39f() throws Exception
	      {   
	       
		    logger1 = extent.createTest("Revert rule 39f");
		    Login_LogOut.Pulse_LogIn();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("phone_number_negative");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
            driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("phone_no"));
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click(); 
            logger.info("Reverted 39f rule");
	      } */
	    /*REVERT RULE IN PULSE 146b
           
            driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("146b");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("mid_dt"));
	        Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click();  */
           
	  
	   @Test(priority=85,description="Revert rule 27f")
	     
	    public void R27f() throws Exception
	      {   
	             
	          //revert rule 27e
		        Thread.sleep(4000);
		        logger1 = extent.createTest("Revert rule 27f");
                driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
                Thread.sleep(4000);
	            driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("27f");
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("mid_dt"));
		        Thread.sleep(4000);
	            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
	            Thread.sleep(4000);
	            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click(); 
	            Thread.sleep(2000);
		        logger.info("Reverted 27f rule");
		        Login_LogOut.Pulse_LogOut();
	           
	       
	 }
		
}
