package pageObjects;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;

public class Grocery {
	@FindBy(xpath = "//img[@class='_2puWtW _3a3qyb'][@alt='Grocery']")
	public static WebElement clickGrocery;
	@FindBy(xpath = "//img[@class='_396cs4'][@alt='Staples']")
	public static WebElement clickStaples;

}
