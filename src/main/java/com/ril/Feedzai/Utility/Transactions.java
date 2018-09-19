package com.ril.Feedzai.Utility;

import java.net.MalformedURLException;
import java.net.URL;

import org.openqa.selenium.By;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;
import org.openqa.selenium.remote.RemoteWebDriver;
//import io.appium.java_client.service.local.AppiumDriverLocalService;
import org.testng.annotations.Test;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;

public class Transactions extends FeedzaiTestBaseClass {

//	@Test(priority=1)
	//public void  AppiumTestSetUp() throws MalformedURLException, Exception {
	 public static void AppiumTestSetUp() throws MalformedURLException, Exception {
		
		
		String url = "http://0.0.0.0:4723/wd/hub";
		// driver1.manage().timeouts().implicitlyWait(120, TimeUnit.SECONDS);

		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("platformName", "Android");
		capabilities.setCapability("udid", "H5312X5720123456");
		capabilities.setCapability("appPackage", "com.corpay.mwallet.preprod.dev");
		capabilities.setCapability("appActivity", "com.corpay.mwallet.app.ui.flows.login.AppLoginActivity");
		capabilities.setCapability("deviceName", "X9009");
	
		capabilities.setCapability("autoAcceptAlerts", true);
		System.out.println("inside accept true");
		capabilities.setCapability("autoGrantPermissions",true);
		
		System.out.println("got the capabilities");
		URL remoteAddress = new URL(url);
		driver1 = new RemoteWebDriver(remoteAddress, capabilities);
		logger.info("opened driver1");
		Thread.sleep(9000);
		logger.info("App launched");
		//Thread.sleep(5000);
		//App_Permission.AppPermit();
		Thread.sleep(8000);
		
		driver1.findElement(By.id("etMobileNumber")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("etMobileNumber")).sendKeys(pro.getProperty("Cred1"));
		 driver1.navigate().back();
		
		driver1.findElement(By.id("btnSignin")).click();
		Thread.sleep(2000);
	
		driver1.findElement(By.id("etPassword")).sendKeys(pro.getProperty("Credpwd"));
		driver1.navigate().back();
		driver1.findElement(By.id("btnSignin")).click();
		Thread.sleep(5000);
		
		driver1.findElement(By.id("tv1")).click();
		driver1.findElement(By.id("tv3")).click();
		driver1.findElement(By.id("tv5")).click();
		driver1.findElement(By.id("tv7")).click();
		Thread.sleep(5000);
	} 


	public static String P2M_Transaction() throws MalformedURLException, InterruptedException {

		driver1.findElement(By.id("btnPayAtShop")).click();
		Thread.sleep(5000);
		// driver1.findElement(By.name("Mobile")).click();
		driver1.findElement(By.xpath(pro.getProperty("Mobile"))).click();
		Thread.sleep(2000);
		driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum"))).click();
		
	//	driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum1"))).sendKeys("8");
	//	Thread.sleep(1000);
		//driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum1"))).clear();
		driver1.findElement(By.xpath(pro.getProperty("MerchantMobileNum1"))).sendKeys("8899550000");
		driver1.findElement(By.xpath(pro.getProperty("Amount"))).click();
		driver1.findElement(By.xpath(pro.getProperty("Amount"))).sendKeys("5");
		Thread.sleep(1000);
		driver1.findElement(By.xpath("//android.view.ViewGroup[@index='16']")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(10000);

	String P2M_RRN = driver1.findElement(By.id("tvDebitTransactionId")).getText();
		logger.info("P2M RRN is " + P2M_RRN);
		//String P2M_Amount = driver1.findElement(By.id("tvTransactionAmount")).getText();
		//logger.info("P2M Amount is " + P2M_Amount);
			return P2M_RRN;
	}


	public static String LMW_Transaction() throws InterruptedException {
		driver1.findElement(By.id("btnLoadMoney")).click();
		System.out.println("Clicked on Load money tab");
		Thread.sleep(3000);
		driver1.findElement(By.id("etAmount")).click();
		driver1.findElement(By.id("etAmount")).sendKeys("5");
		Thread.sleep(3000);
		driver1.findElement(By.id("btnLoad")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("TestCard"))).click();
		driver1.findElement(By.id("etCvv")).click();
		driver1.findElement(By.id("etCvv")).sendKeys("456");
		Thread.sleep(2000);
		driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(9000);
	/*	driver1.findElement(By.className("android.widget.Spinner")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("Success"))).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("SubmitForm")).click();
		Thread.sleep(7000);
		logger.info("LMW transaction successful"); */
		String LMW_RRN = driver1.findElement(By.id("tvCreditTransactionId")).getText();
		logger.info("LMW RRN is " + LMW_RRN);
		Thread.sleep(4000);
		return LMW_RRN;

	}

	
	public static String LMW_155c() throws InterruptedException {
		driver1.findElement(By.id("btnLoadMoney")).click();
		System.out.println("Clicked on Load money tab");
		Thread.sleep(3000);
		driver1.findElement(By.id("etAmount")).click();
		driver1.findElement(By.id("etAmount")).sendKeys("50");
		Thread.sleep(3000);
		driver1.findElement(By.id("btnLoad")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("StartSixCard"))).click();
		driver1.findElement(By.id("etCvv")).click();
		driver1.findElement(By.id("etCvv")).sendKeys("456");
		Thread.sleep(2000);
		driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(6000);
		driver1.findElement(By.className("android.widget.Spinner")).click();
		Thread.sleep(5000);
		driver1.findElement(By.xpath(pro.getProperty("Success"))).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("SubmitForm")).click();
		Thread.sleep(4000);
		logger.info("LMW transaction successful");
		String LMW_RRN1 = driver1.findElement(By.id("tvCreditTransactionId")).getText();
		logger.info("LMW RRN is " + LMW_RRN1);
		Thread.sleep(8000);
		return LMW_RRN1;

	}


	public static String BillPayClosedLoop() throws InterruptedException {
		driver1.findElement(By.id("btnPayments")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("tv_list_item_biller_name")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("actNameOrNumber")).sendKeys("9136057878");
		driver1.findElement(By.id("btnPayOptions")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("llCurrencyLayout")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("btnPayOptions")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(40000);
    	logger.info("Bill Pay through closed loop successful");
		String IBW_RRN = driver1.findElement(By.id("tvDebitTransactionId")).getText();
		logger.info("IBW RRN is " + IBW_RRN);
		Thread.sleep(4000);
		return IBW_RRN;
	
	}


	public static String BillPayOpenLoop() throws InterruptedException {
		driver1.findElement(By.id("btnPayments")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("tv_list_item_biller_name")).click();
		Thread.sleep(1000);
		driver1.findElement(By.id("actNameOrNumber")).sendKeys("9136057878");
		driver1.findElement(By.id("btnPayOptions")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("llCurrencyLayout")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("btnPayOptions")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("tvRadioButton")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("etCvv")).click();
		Thread.sleep(5000);
		driver1.findElement(By.id("etCvv")).sendKeys("8357");
		Thread.sleep(6000);
		driver1.findElement(By.id("btnPay")).click();
		//Thread.sleep(2000);
	//	driver1.findElement(By.id("btnPay")).click();
		Thread.sleep(2000);
		driver1.findElement(By.id("btnConfirm")).click();
		Thread.sleep(7000);
		logger.info("Bill pay through open loop success");
		String BIW_RRN = driver1.findElement(By.id("tvDebitTransactionId")).getText();
		logger.info("BIW RRN is " + BIW_RRN);
		Thread.sleep(4000);
		return BIW_RRN;

	}
	
	public static void LogoutWallet() throws Exception {
		
		driver1.findElement(By.id("btnHome")).click();
		Thread.sleep(4000);
		driver1.findElement(By.id("tv_profile_pic_small")).click();
		Thread.sleep(4000);
	/*	driver.findElement(By.id("tvLogOut")).click();
		Thread.sleep(2000);
		driver.findElement(By.id("tvYes ")).click();
		logger.info("Logged Out Successfully"); */
		
	}
}
