package TestCases;

import org.openqa.selenium.support.PageFactory;
import org.testng.annotations.Test;

import commonFunctions.CommonFunctions;
import pageObjects.selectLocation;
@Test
public class LocationSelection extends CommonFunctions{
	public void crosshairViaLocation() {
		PageFactory.initElements(driver, selectLocation.class);
		selectLocation.locationCrosshair.click();
}
}
