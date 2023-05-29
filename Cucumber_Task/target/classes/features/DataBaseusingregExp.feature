Feature: Verify dashboard page functionalities

@ReTest
Scenario: Transfermoney data 


Given opne the dashboard page
When user should click the transfermoney link
Then user should enter the account number "7584930"and name"Rameshraj"
And user should ente the transfer amount 12000
And user should enter the bank ifsc code"HSBC0002"
And user should enter the bank name "HSBC Bank"


@Regration
Scenario: Verifying appling loan functionalites

Given opne the dashboard page
When user should open the request loan link
Then user should enter the LoanAmount 40000 and Downpayment 4000
Then user select which account need as a loan "SBI"

