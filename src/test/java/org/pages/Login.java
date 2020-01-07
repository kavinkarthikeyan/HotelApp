package org.pages;

import java.util.List;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Login extends HelperClass {
	public  Login() {
	PageFactory.initElements(driver,this);

	}
	
	
@FindBy(id="username")
private List<WebElement> username;
@FindBy(id="password")
private List<WebElement> password;
@FindBy(id="login")
private List<WebElement> btnClick;


@FindBy(xpath="//a[text()='New User Register Here']")
private WebElement cli;
public WebElement getCli() {
	return cli;
}
public List<WebElement> getBtnClick() {
	return btnClick;
}
public List<WebElement> getUsername() {
	return username;
}
public List<WebElement> getPassword() {
	return password;
}
}
