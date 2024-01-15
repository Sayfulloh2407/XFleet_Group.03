@B31G3-265
Feature: Default

#	Background:
#		#@B31G3-261
#		Given The user is on the login page

#	@B31G3-262
	Scenario Outline: US7-TC01 The user see all checkboxes as unchecked.
		When The user logins on the login page as "<userType>"
		And The user hovers over fleet button on the top menu of the Dashboard page.
		And The user clicks Vehicles button on the dropdown.
		Then The user see all the checkboxes as unchecked.
		Examples:
			|userType|
			|sales manager|
			|store manager|
#	@B31G3-263
	Scenario Outline: US7-TC02 Verify checking the first checkbox makes all checkboxes checked.
		When The user logins on the login page as "<userType>"
		And The user hovers over fleet button on the top menu of the Dashboard page.
		And The user clicks Vehicles button on the dropdown.
		And The user checks the first checkbox on the title line
		Then The user see all the checkboxes as checked.
		Examples:
		    |userType|
			|sales manager|
			|store manager|
#	@B31G3-264
	Scenario Outline: US7-TC03 Verify to be able to check any checkbox.
		When The user logins on the login page as "<userType>"
		And The user hovers over fleet button on the top menu of the Dashboard page.
		And The user clicks Vehicles button on the dropdown.
		And The user checks the checkboxes rundem.
		Then The user see all the checkboxes, which user checked has, as checked.
		Examples:
		    |userType|
			|sales manager|
			|store manager|