package com.ril.Feedzai.Utility;

import com.ril.Feedzai.BaseClass.FeedzaiTestBaseClass;
import org.openqa.selenium.Capabilities;
import org.openqa.selenium.remote.DesiredCapabilities;

public class App_Permission extends FeedzaiTestBaseClass{
	
	public static void AppPermit() {
	
		DesiredCapabilities capabilities = new DesiredCapabilities();
		capabilities.setCapability("newCommandTimeout",10000);
		capabilities.setCapability("autoAcceptAlerts",true);
		System.out.println("inside accept true");
		capabilities.setCapability("autoDismissAlerts",true);
	
		}
		 
	}  

	

