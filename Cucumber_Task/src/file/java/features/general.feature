Feature: Testing
@smoke
Scenario: smoke


 Given user opne the browser
 Then  fetch the url
 And 	fetch the body of the data
 Then user close the browser
 
@regration
Scenario: regration

Given user opne the browser
Then user open the particular maduel 
And Testing all related functionalites
 Then user close the browser

@production
Scenario: production

Given user opne the browser
Then user open the particular maduel 
And Testing particular maduel 
 Then user close the browser





#Examples: 
#| Firstname				|			Lastname						|	 Email																	|Telephone			|Password			|PasswordConfirm|
#| Ramesh					|			Raj											| rameshraj678@gmail.com	|9494684648 |r1m5s899		| r1m5s899|





