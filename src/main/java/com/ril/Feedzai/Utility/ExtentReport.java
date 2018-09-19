package com.ril.Feedzai.Utility;
 
import org.testng.Assert;
import org.testng.ITestResult;
import org.testng.SkipException;
import org.testng.annotations.AfterMethod;
import org.testng.annotations.AfterTest;
import org.testng.annotations.BeforeTest;
import org.testng.annotations.Test;
 
import com.aventstack.extentreports.ExtentReports;
import com.aventstack.extentreports.ExtentTest;
import com.aventstack.extentreports.Status;
import com.aventstack.extentreports.markuputils.ExtentColor;
import com.aventstack.extentreports.markuputils.MarkupHelper;
import com.aventstack.extentreports.reporter.ExtentHtmlReporter;
import com.aventstack.extentreports.reporter.configuration.ChartLocation;
import com.aventstack.extentreports.reporter.configuration.Theme;
 
 
 
public class ExtentReport{
 ExtentHtmlReporter htmlReporter;
 ExtentReports extent;
 ExtentTest logger;
 
 
 @BeforeTest
 public void startReport(){
 
 htmlReporter = new ExtentHtmlReporter(System.getProperty("user.dir") +"/test-output/STMExtentReport3.html");
 extent = new ExtentReports ();
 extent.attachReporter(htmlReporter);
 extent.setSystemInfo("Host Name", "Feedzai Test Automation");
 extent.setSystemInfo("Environment", "Feedzai Automation Testing Report");
 extent.setSystemInfo("User Name", "Ankur Jain");
 
 htmlReporter.config().setDocumentTitle("Feedzai Automation Testing Report");
 htmlReporter.config().setReportName("Feedzai Test Automation");
 htmlReporter.config().setTestViewChartLocation(ChartLocation.TOP);
 htmlReporter.config().setTheme(Theme.DARK);
 }
 
 @Test
 public void passTest(){
 logger = extent.createTest("passTest");
 Assert.assertTrue(true);
 logger.log(Status.PASS, MarkupHelper.createLabel("Test Case Passed is passTest", ExtentColor.GREEN));
 }
 
 @Test
 public void failTest(){
 logger = extent.createTest("failTest");
 Assert.assertTrue(false);
 logger.log(Status.PASS, "Test Case (failTest) Status is passed");
 logger.log(Status.PASS, MarkupHelper.createLabel("Test Case (failTest) Status is passed", ExtentColor.GREEN));
 }
 
 @Test
 public void skipTest(){
 logger = extent.createTest("skipTest");
 throw new SkipException("Skipping - This is not ready for testing ");
 }
 
 @AfterMethod
 public void getResult(ITestResult result){
 if(result.getStatus() == ITestResult.FAILURE){
 //logger.log(Status.FAIL, "Test Case Failed is "+result.getName());
 //MarkupHelper is used to display the output in different colors
 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getName() + " - Test Case Failed", ExtentColor.RED));
 logger.log(Status.FAIL, MarkupHelper.createLabel(result.getThrowable() + " - Test Case Failed", ExtentColor.RED));
 }else if(result.getStatus() == ITestResult.SKIP){
 //logger.log(Status.SKIP, "Test Case Skipped is "+result.getName());
 logger.log(Status.SKIP, MarkupHelper.createLabel(result.getName() + " - Test Case Skipped", ExtentColor.ORANGE)); 
 }
 }
 @AfterTest
 public void endReport(){
 extent.flush();
    }
}
