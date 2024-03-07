package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.OrderTracking;

public class OrderTrackingFunction extends CommonFunctions {
	@Test
	public void orderTracking() {

		PageFactory.initElements(driver, OrderTracking.class);
		OrderTracking.clickOrderTracking.click();
}
}
