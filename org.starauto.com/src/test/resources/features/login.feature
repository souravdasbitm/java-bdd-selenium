Feature: Login 
Description: The purpose of this feature is to test login.
 
Scenario Outline: Customer logs into the system
	Given user is on Home Page
	When  user clicks onto login option
	And   enters the username
	And   enters the password
	And   clicks onto the login
	Then  user is able to login

Examples:
	|customer|
	|Lakshay|