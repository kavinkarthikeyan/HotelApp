package org.pages;

import java.util.List;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class Booking extends HelperClass {
	public Booking() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "first_name")
	private List<WebElement> fname;
	@FindBy(id = "last_name")
	private List<WebElement> lname;
	@FindBy(id = "address")
	private List<WebElement> address;
	@FindBy(id = "cc_num")
	private List<WebElement> ccnum;
	@FindBy(id = "cc_type")
	private List<WebElement> cctype;
	@FindBy(id = "cc_exp_month")
	private List<WebElement> expmonth;
	@FindBy(id = "cc_exp_year")
	private List<WebElement> expyear;
	@FindBy(id = "cc_cvv")
	private List<WebElement> cvv;
	@FindBy(id = "book_now")
	private List<WebElement> book;
	@FindBy(id = "order_no")
	private List<WebElement> orderid;

	public List<WebElement> getFname() {
		return fname;
	}

	public List<WebElement> getLname() {
		return lname;
	}

	public List<WebElement> getAddress() {
		return address;
	}

	public List<WebElement> getCcnum() {
		return ccnum;
	}

	public List<WebElement> getCctype() {
		return cctype;
	}

	public List<WebElement> getExpmonth() {
		return expmonth;
	}

	public List<WebElement> getExpyear() {
		return expyear;
	}

	public List<WebElement> getCvv() {
		return cvv;
	}

	public List<WebElement> getBook() {
		return book;
	}

	public List<WebElement> getOrderid() {
		return orderid;
	}

}
