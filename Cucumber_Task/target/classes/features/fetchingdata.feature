 Feature: Datavarification
 @testdata
 Scenario: salary caluculate
 
Given Lanuch the browswer
Then body of the data
#	|FirstName|LastName|Email|PhoneNo|
#	| Ramesh | Raj 	 | rameshraj678@gmail.com 	| 9550335422|
#	| Shrayan | Raj	 | shrayanmychild@gmail.com | 9302949823|
|Name						|Ramesh|
|GrossSalary		|35000		| 
| PF 								|4000			| 
|IncomeTax			|1000			| 
|Netsalary				|40000		| 	
And asserting the data
Then Sumitt the file 
	

#|GrossSalary		|35000		| 
#| PF 								|4000			| 
#|IncomeTax			|1000			| 
#|Netsalary				|40000		| 
#Scenario: verify with positive Testing
#Given User is on register page
#When User should enter fallowing Details
#	|FirstName|LastName|Email|PhoneNo|
#	| prasanna | Kumar | prasannakumar@gmail.com | 9550335422|
#	| pramod | Kumar | kumar@gmail.com | 9550225422|
#Then click on signup button 
#Then It should navigate to HomePage 

# 

