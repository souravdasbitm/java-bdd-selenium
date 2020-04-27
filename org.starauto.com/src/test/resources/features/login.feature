Feature: Login 
	Description: The purpose of this feature is to test login.
@severity=blocker 
Scenario Outline: Customer logs into the system 
	Given user is on the home page
	When  user clicks onto login option 
	And   enters the username "<username>" and password "<password>"  
	And   clicks onto the login 
	Then  user is able to login 
	
	Examples: 
		|username				 | password 	 |
		|souravdasbitm@gmail.com | Orga1234! |