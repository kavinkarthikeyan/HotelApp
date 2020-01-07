package org.pages;

import java.util.List;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SelectHotel extends HelperClass {
	public SelectHotel() {
		PageFactory.initElements(driver, this);
	}
	
@FindBy(id="radiobutton_0")
private List<WebElement> radioBtn;
@FindBy(id="continue")
private List<WebElement> cntBtn;
public List<WebElement> getRadioBtn() {
	return radioBtn;
}
public List<WebElement> getCntBtn() {
	return cntBtn;
}
}
