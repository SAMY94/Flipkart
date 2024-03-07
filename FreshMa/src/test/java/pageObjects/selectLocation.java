package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class selectLocation {

	@FindBy(xpath = "//span[@class='input-group-text'][@id='location-search']")
	public static WebElement locationCrosshair;
	
}
