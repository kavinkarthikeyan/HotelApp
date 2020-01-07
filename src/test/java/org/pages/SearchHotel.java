package org.pages;

import java.util.List;

import org.base.HelperClass;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

public class SearchHotel extends HelperClass {

	public SearchHotel() {
		PageFactory.initElements(driver, this);
	}

	@FindBy(id = "location")
	private List<WebElement> location;
	@FindBy(id = "hotels")
	private List<WebElement> hotels;
	@FindBy(id = "room_type")
	private List<WebElement> roomType;
	@FindBy(id = "room_nos")
	private List<WebElement> roomno;
	@FindBy(id = "adult_room")
	private List<WebElement> adultroom;
	@FindBy(id = "child_room")
	private List<WebElement> childroom;
	@FindBy(id = "Submit")
	private List<WebElement> submit;

	public List<WebElement> getLocation() {
		return location;
	}

	public List<WebElement> getHotels() {
		return hotels;
	}

	public List<WebElement> getRoomType() {
		return roomType;
	}

	public List<WebElement> getRoomno() {
		return roomno;
	}

	public List<WebElement> getAdultroom() {
		return adultroom;
	}

	public List<WebElement> getChildroom() {
		return childroom;
	}

	public List<WebElement> getSubmit() {
		return submit;
	}

}
