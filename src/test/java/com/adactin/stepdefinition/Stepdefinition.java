package com.adactin.stepdefinition;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.Select;

import com.adactin.runner.Runner_Adactin;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class Stepdefinition {

	public static WebDriver driver = Runner_Adactin.driver;


@Given("^user Lunch The Adactin Application$")
public void user_Lunch_The_Adactin_Application() throws Throwable {
	driver.get("https://adactinhotelapp.com/");
	
}

@When("^user Enter The Username In Username Field$")
public void user_Enter_The_Username_In_Username_Field() throws Throwable {
	WebElement username = driver.findElement(By.id("username"));
	username.sendKeys("namachu30");
    
    
}

@When("^user Enter The Password In Password Field$")
public void user_Enter_The_Password_In_Password_Field() throws Throwable {
	WebElement password = driver.findElement(By.xpath("//input[@type='password']"));
	password.sendKeys("Namachi88@krr");
}

@Then("^user Click The Login Button And It Navigates To Search Hotel Page$")
public void user_Click_The_Login_Button_And_It_Navigates_To_Search_Hotel_Page() throws Throwable {
   WebElement login = driver.findElement(By.id("login"));
   login.click();
}

@When("^user Select Hotel Location$")
public void user_Select_Hotel_Location() throws Throwable {
    WebElement location = driver.findElement(By.xpath("//select[@name='location']"));
    location.click();
    Select a = new Select(location);
    a.selectByIndex(2);
}

@When("^user Select The Hotel Name$")
public void user_Select_The_Hotel_Name() throws Throwable {
    WebElement hotels = driver.findElement(By.xpath("//select[@name='hotels']"));
    hotels.click();
    Select b = new Select(hotels);
    b.selectByIndex(2);
    
}

@When("^user Select The Room Type$")
public void user_Select_The_Room_Type() throws Throwable {
	WebElement roomtype = driver.findElement(By.xpath("//select[@name='room_type']"));
	roomtype.click();
	Select c = new Select(roomtype);
	c.selectByIndex(3);
}

@When("^user Select The Number Of Rooms$")
public void user_Select_The_Number_Of_Rooms() throws Throwable {
    WebElement noofroom = driver.findElement(By.xpath("//select[@name='room_nos']"));
    noofroom.click();
    Select d = new Select(noofroom);
    d.selectByIndex(2);
}

@When("^user Enter The Check In Date$")
public void user_Enter_The_Check_In_Date() throws Throwable {
	//WebElement checkindate = driver.findElement(By.xpath("//input[@name='datepick_in']"));
WebElement checkindate = driver.findElement(By.id("datepick_in"));
checkindate.sendKeys("02/12/2022");
}

@When("^user Enter The Check Out Date$")
public void user_Enter_The_Check_Out_Date() throws Throwable {
	//WebElement checkoutdate = driver.findElement(By.xpath("input[@name='datepick_out']"));
	WebElement checkoutdate = driver.findElement(By.id("datepick_out"));
	checkoutdate.sendKeys("05/12/2022");
}

@When("^user Select The Adults Per Room$")
public void user_Select_The_Adults_Per_Room() throws Throwable {
	WebElement adultsperroom = driver.findElement(By.xpath("//select[@name='adult_room']"));
	adultsperroom.click();
	Select e = new Select(adultsperroom);
	e.selectByIndex(2);
}

@When("^user Select The Children Per Room$")
public void user_Select_The_Children_Per_Room() throws Throwable {
    
    WebElement noofchildren = driver.findElement(By.xpath("//select[@name='child_room']"));
    noofchildren.click();
    Select f = new Select(noofchildren);
    f.selectByIndex(3);
}

@Then("^user Click The Search Button And It Navigates To Select Hotel Page$")
public void user_Click_The_Search_Button_And_It_Navigates_To_Select_Hotel_Page() throws Throwable {
    WebElement search = driver.findElement(By.id("Submit"));
    search.click();
}

@When("^user Select The Hotel$")
public void user_Select_The_Hotel() throws Throwable {
	WebElement select = driver.findElement(By.id("radiobutton_0"));
	select.click();
}

@Then("^user Click THe Continue Button And It Navigates To Book A Hotel Page$")
public void user_Click_THe_Continue_Button_And_It_Navigates_To_Book_A_Hotel_Page() throws Throwable {
     WebElement submit= driver.findElement(By.id("continue"));
     submit.click();
}

@When("^user Enter The First Name$")
public void user_Enter_The_First_Name() throws Throwable {
	WebElement firstname = driver.findElement(By.id("first_name"));
	firstname.sendKeys("Namachivayam");    
}

@When("^user Enter The Last Name$")
public void user_Enter_The_Last_Name() throws Throwable {
	WebElement lastnames = driver.findElement(By.id("last_name"));
	lastnames.sendKeys("Munusamy");
}

@When("^user Enter The Billing Address$")
public void user_Enter_The_Billing_Address() throws Throwable {
	WebElement address = driver.findElement(By.id("address"));
	address.sendKeys("No 10, Loganathan Street, V V G Nagar, Vengamedu, Karur-639006");
}

@When("^user Enter The Credit Number$")
public void user_Enter_The_Credit_Number() throws Throwable {
	WebElement cardno = driver.findElement(By.id("cc_num"));
	cardno.sendKeys("1234567891234567");   
}

@When("^user Select The Card Type$")
public void user_Select_The_Card_Type() throws Throwable {
	WebElement cardtype = driver.findElement(By.id("cc_type"));
cardtype.click();
Select g = new Select(cardtype);
g.selectByIndex(1);
}

@When("^user Select The Expiry Date$")
public void user_Select_The_Expiry_Date() throws Throwable {
	WebElement expirydate = driver.findElement(By.id("cc_exp_month"));
expirydate.click();
	Select h = new Select(expirydate);
	h.selectByIndex(8);
    
}

@When("^user Enter The CVV Number$")
public void user_Enter_The_CVV_Number() throws Throwable {
	WebElement cvvno = driver.findElement(By.id("cc_cvv"));
	cvvno.sendKeys("123");
}

@Then("^user Click The Book Now Button And It Navigates To Booking Confirmation Page$")
public void user_Click_The_Book_Now_Button_And_It_Navigates_To_Booking_Confirmation_Page() throws Throwable {
	WebElement booknow = driver.findElement(By.id("book_now"));
	booknow.click();    
}

@Then("^user Click The Logout Button$")
public void user_Click_The_Logout_Button() throws Throwable {
	WebElement logout = driver.findElement(By.xpath("//a[text()='Logout']"));
	logout.click();
    
}


}
