package org.stepdefinition;

import java.util.concurrent.TimeUnit;

import org.base.HelperClass;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.Select;
import org.pages.Booking;
import org.pages.Login;
import org.pages.SearchHotel;
import org.pages.SelectHotel;

import cucumber.api.java.en.*;

public class BookingStep extends HelperClass {
	Login l;
	SearchHotel searchtHotel;
	SelectHotel selectHotel;
	Booking booking;

	@Given("The Adactin page should be launched")
	public void the_Adactin_page_should_be_launched() {
		
	}

	@When("the user enters the {string} and {string} and clicks login")
	public void the_user_enters_the_and_and_clicks_login(String name, String pass) {

		l = new Login();
		WebElement userName = l.getUsername().get(0);
		setText(userName, name);

		WebElement password = l.getPassword().get(0);
		setText(password, pass);

		WebElement loginBtn = l.getBtnClick().get(0);
		l.buttonClick(loginBtn);
	}

	@When("user selects the {string},{string},{string},{string},{string}and click search")
	public void user_selects_the_and_click_search(String location, String hotel, String type, String rooms,
			String adroom) {

		searchtHotel = new SearchHotel();

		sbvt(searchtHotel.getLocation().get(0), location);
		sbvt(searchtHotel.getHotels().get(0), hotel);
		sbvt(searchtHotel.getRoomType().get(0),type);
		sbvt(searchtHotel.getRoomno().get(0),rooms);
		sbvt(searchtHotel.getAdultroom().get(0),adroom);
		buttonClick(searchtHotel.getSubmit().get(0));
	}

	@When("user selects the hotel and click continue")
	public void user_selects_the_hotel_and_click_continue() {
		selectHotel = new SelectHotel();
		buttonClick(selectHotel.getRadioBtn().get(0));
		buttonClick(selectHotel.getCntBtn().get(0));

	}

	@When("user enters {string},{string},{string},{string},{string},{string},{string},{string} and click book")
	public void user_enters_and_click_book(String fname, String lname, String address, String ccnum, String cctype,
			String ccexmonth, String ccexyear, String cvv) throws InterruptedException {

		booking = new Booking();
		setText(booking.getFname().get(0), fname);
		setText(booking.getLname().get(0), lname);
		setText(booking.getAddress().get(0), address);
		setText(booking.getCcnum().get(0), ccnum);
		sbvt(booking.getCctype().get(0), cctype);
		sbvt(booking.getExpmonth().get(0), ccexmonth);
		sbvt(booking.getExpyear().get(0), ccexyear);
		setText(booking.getCvv().get(0), cvv);
		buttonClick(booking.getBook().get(0));
		Thread.sleep(6000);

	}

	@Then("user gets the booking id")
	public void user_gets_the_booking_id() {

		printText(getTextByAttribute(booking.getOrderid().get(0)));
	}
 
	
	
	@When("User clicking new registration")
	public void user_clicking_new_registration() {
		l = new Login();
	    l.getCli().click();
	}

	@Then("user created account successfully")
	public void user_created_account_successfully() {
	  System.out.println("User is in account creation page");
	}

	
}
