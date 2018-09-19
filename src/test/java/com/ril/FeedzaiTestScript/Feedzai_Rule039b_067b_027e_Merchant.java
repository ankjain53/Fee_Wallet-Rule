//Rule 039b : Merchant on negative list [Decline].
//Rule 067b : Merchant present in suspicious merchant list [Alert].
//Rule 027e : Attempted transaction amount exceeds the limit for merchant as per the business type [Alert].

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
public class Feedzai_Rule039b_067b_027e_Merchant extends FeedzaiTestBaseClass

{
	@Test(priority=86,description="Validation of merchant rules")
	      
	public void Rule39b() throws Exception
    {
		   logger1 = extent.createTest("Validation of Rule 39a ");
		    Login_LogOut.Pulse_LogIn();
		   driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("39b");
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
	        logger.info("Rule 39b rule setup is done ");
	       
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("merchant_negative");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Add_merchant1"))).click();
	        driver.findElement(By.xpath(pro.getProperty("MID"))).sendKeys(pro.getProperty("mid_dt"));
	        driver.findElement(By.xpath(pro.getProperty("mid_comment"))).sendKeys("Merchant id on negative list");
	       
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
	        //driver.findElement(By.xpath(pro.getProperty("mid_cancle"))).click();
    }
	
	@Test(priority=87,description="Validation of merchant rules")
    
	public void Rule67b() throws Exception
    {
		
	        //Rule 67b
		   logger1 = extent.createTest("Validation of Rule 67b ");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        Thread.sleep(5000);
	        logger.info("Clicked on Rule");
	       Thread.sleep(2000);
		    driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("67b");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#39b Selected");
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
	        logger.info("Rule 67b rule setup is done ");
	       
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("suspicious_merchant");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Add_merchant1"))).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("MID"))).sendKeys(pro.getProperty("mid_dt"));
	        driver.findElement(By.xpath(pro.getProperty("mid_comment"))).sendKeys("Merchant id on negative list");
	       
	        boolean checkbox2=driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
	        if(checkbox2==true) {
	        logger.info("CheckBox is Selected");

	         }
	        else
	        {
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
	        logger.info("CheckBox is now Selected");
	         }
	       
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("mid_save"))).click();
	        //driver.findElement(By.xpath(pro.getProperty("mid_cancle"))).click(); 
	       
    }   
	        //Rule 27e
	@Test(priority=88,description="Validation of merchant rules")
    
	public void Rule27e() throws Exception
    {
		    logger1 = extent.createTest("Validation of Rule 27e ");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_Rule"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).click();
	        Thread.sleep(5000);
	        logger.info("Clicked on Rule");
	        Thread.sleep(2000);
		    driver.findElement(By.xpath(pro.getProperty("pulse_SearchRule"))).sendKeys("27e");
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clickRule"))).click();
	        Thread.sleep(7000);
	        logger.info("Rule#39b Selected");
	        Login_LogOut.EnableCheckbox();
	        
	        driver.findElement(By.xpath(pro.getProperty("pulse_delAction"))).click();
	        Thread.sleep(3000);
	        driver.findElement(By.xpath(pro.getProperty("rule_act"))).click();
	        Thread.sleep(4000);
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
	        logger.info("27e rule setup is done");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_publish"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_Rpublish"))).click();
	        Thread.sleep(5000);
	        driver.findElement(By.xpath("//span[@class='txt'][contains(text(),'Close')]")).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("27e");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("Add_merchant1"))).click();
	        Thread.sleep(2000);
	        driver.findElement(By.xpath(pro.getProperty("27e_key"))).sendKeys(pro.getProperty("mcc_code"));
	        driver.findElement(By.xpath(pro.getProperty("mid_comment"))).sendKeys("100 added in the list");
	       
	        
	        boolean checkbox4=driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).isSelected();
	        if(checkbox4==true) {
	        logger.info("CheckBox is Selected");

	         }
	        else
	        {
	        driver.findElement(By.xpath(pro.getProperty("pulse_RuleEnabled"))).click();
	        logger.info("CheckBox is now Selected");
	         }
	        
	        driver.findElement(By.xpath(pro.getProperty("27e_amt"))).sendKeys(pro.getProperty("amount"));
	      
	        driver.findElement(By.xpath(pro.getProperty("mid_save"))).click();
	        Login_LogOut.Pulse_LogOut(); 
    
	    //P2M utility
	        
	        Transactions.AppiumTestSetUp();
	        Transactions.P2M_Transaction();  
	        
	        }
  @Test(priority=89,description="Validation of AM rules") 
	      
	public void AM_TranCheck() throws Exception
    {
	       logger1 = extent.createTest("Validation of AM rules");
	      //RULE VERIFICATION IN ALERT MANAGER
	        Login_LogOut.AM_LogIn();
	        SoftAssert SA =new SoftAssert();
	        driver.findElement(By.xpath(pro.getProperty("AM_search"))).click();
	        Thread.sleep(4000);
	        logger.info("Clicked on Search Page");
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).click();
	        Thread.sleep(4000);
	        
	        
	        
	        //Agent_BillPayment.Agent_MobileBillPayment();
	        driver.findElement(By.xpath(pro.getProperty("AM_EnterTransactionId"))).sendKeys("110000194998");
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
	        SA.assertTrue(StoreRule.contains("39b"));
	        SA.assertTrue(StoreRule.contains("67b"));
	        SA.assertTrue(StoreRule.contains("27e"));
	       // Assert.assertTrue(StoreRule.contains("57"));
	        logger.info("Rule 39b 67b 27e 007a Triggered");
	        Login_LogOut.AM_LogOut();    
    }       
		
  @Test(priority=90,description="Revert 39b")
  
	public void R39b() throws Exception
    {
		     
       //REVERT RULE IN PULSE 39b
	        logger1 = extent.createTest("Revert 39b");
	        Login_LogOut.Pulse_LogIn();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("merchant_negative");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
            driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("mid_dt"));
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click(); 
    }
	      
  @Test(priority=91,description="Revert 67b")
  
 	public void R67b() throws Exception
     {
             // //REVERT RULE IN PULSE 67b
	        logger1 = extent.createTest("Revert 67b");
            driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("suspicious_merchant");
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
	        Thread.sleep(4000);
	        driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("mid_dt"));
	        Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
            Thread.sleep(4000);
            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click();
            
     }   	       
	          //revert rule 27e
  @Test(priority=92,description="Revert 27e")
  
 	public void R27e() throws Exception
     {            logger1 = extent.createTest("Revert 27e");
	            driver.findElement(By.xpath(pro.getProperty("pulse_clicklist"))).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("pulse_searchlist"))).sendKeys("27e");
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("list_hrf"))).click();
		        Thread.sleep(4000);
		        driver.findElement(By.xpath(pro.getProperty("merchant_revert_search"))).sendKeys(pro.getProperty("mcc_code"));
		        Thread.sleep(4000);
	            driver.findElement(By.xpath(pro.getProperty("merchant_dl"))).click();
	            Thread.sleep(4000);
	            driver.findElement(By.xpath(pro.getProperty("merchant_dlt"))).click(); 
	            
	           
		        Login_LogOut.Pulse_LogOut();
	        
	       
	 }
		
}
