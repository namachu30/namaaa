Feature: Hotel Booking In Adactin Application 

Scenario: user Login In The Web Application
	Given user Lunch The Adactin Application
	When user Enter The Username In Username Field
	And user Enter The Password In Password Field
	Then user Click The Login Button And It Navigates To Search Hotel Page 
	 
Scenario: search Hotel Page
	When user Select Hotel Location
	And user Select The Hotel Name
	And user Select The Room Type
	And user Select The Number Of Rooms
	And user Enter The Check In Date
	And user Enter The Check Out Date
	And user Select The Adults Per Room
	And user Select The Children Per Room
	Then user Click The Search Button And It Navigates To Select Hotel Page
	
Scenario: select Hotel Page
	When user Select The Hotel
	Then user Click THe Continue Button And It Navigates To Book A Hotel Page
Scenario: book A Hotel
	When user Enter The First Name
	And user Enter The Last Name
	And user Enter The Billing Address
	And user Enter The Credit Number
	And user Select The Card Type
	And user Select The Expiry Date
	And user Enter The CVV Number
	Then user Click The Book Now Button And It Navigates To Booking Confirmation Page
Scenario: booking Confirmation Page
	Then user Click The Logout Button
	