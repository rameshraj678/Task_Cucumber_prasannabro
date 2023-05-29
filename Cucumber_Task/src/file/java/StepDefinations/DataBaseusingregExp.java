package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class DataBaseusingregExp {
	
	
//	@Given("opne the dashboard page")
//	public void opne_the_dashboard_page() {
//	   System.out.println("open the user dashboard page");
//	}
//
//	@When("user should click the transfermoney link")
//	public void user_should_click_the_transfermoney_link() {
//		
//		System.out.println("click the Money Transfer link");
//	}
//
//	@Then("user should enter the account number \"{int}\"and name{string}")
//	public void user_should_enter_the_account_number_and_name_rameshraj(Integer int1, String name) {
//	    
//		System.out.println("Enter Account number ;"+int1);
//		System.out.println("Eenter the account holder name:"+name);
//		
//	}
//
//	@Then("user should ente the transfer amount {int}")
//	public void user_should_ente_the_transfer_amount(Integer int2) {
//	 
//		System.out.println("Enter the transfer amount:"+int2);
//	}
//
//	@Then("user should enter the bank ifsc code{string}")
//	public void user_should_enter_the_bank_ifsc_code_hsbc0002(String bankif) {
//	 System.out.println("bank IFSC Code:"+bankif);
//	}
//
//	@Then("user should enter the bank name {string}")
//	public void user_should_enter_the_bank_name(String string) {
//	  System.out.println("bank name :"+string);
//	  System.out.println("--------------------------");
//	}
//
//	@When("user should open the request loan link")
//	public void user_should_open_the_request_loan_link() {
//	
//		System.out.println("user navigate the request loan link");
//	}
//
//	@Then("user should enter the LoanAmount {int} and Downpayment {int}")
//	public void user_should_enter_the_loan_amount_and_downpayment(Integer int1, Integer int2) {
//		System.out.println("Eligible Loan Amount:"+int1);
//		System.out.println("Down Payment:"+int2);
//		
//	}
//
//	@Then("user select which account need as a loan {string}")
//	public void user_select_which_account_need_as_a_loan(String string) {
//		System.out.println(" In which bank does the cutomer wants to credit this loan amount:"+string);
//	}
//}

	
	// ------------Regex --------------
	
	@Given("opne the dashboard page")
	public void opne_the_dashboard_page() {
	   System.out.println("open the user dashboard page");
	}

	@When("user should click the transfermoney link")
	public void user_should_click_the_transfermoney_link() {
		
		System.out.println("click the Money Transfer link");
	}

	@Then("user should enter the account number \"{int}\"and name{string}")
	public void user_should_enter_the_account_number_and_name_rameshraj(Integer int1, String name) {
		System.out.println("Enter Account number ;"+int1);
		System.out.println("Eenter the account holder name:"+name);
	}
//	@Then("^user should enter the account number \"(\\d+)\"and name\"([^\"])\"$")
//	public void user_should_enter_the_account_number_and_name_rameshraj(Integer int1, String name) {
//	    
//		System.out.println("Enter Account number ;"+int1);
//		System.out.println("Eenter the account holder name:"+name);
//		
//	}
	
	@Then("user should ente the transfer amount {int}")
	public void user_should_ente_the_transfer_amount(Integer int1) {
		System.out.println("Enter the transfer amount:"+int1);
	}
	
//	@Then("^user should ente the transfer amount \"([0-9a-z]+)\"$")
//	public void user_should_ente_the_transfer_amount(Integer int1) {
//	 
//		System.out.println("Enter the transfer amount:"+int1);
//	}
	
	@Then("^user should enter the bank ifsc code\"([0-9A-Z]+)\"$")									// pass////
	public void user_should_enter_the_bank_ifsc_code_hsbc0002(String bankif) {
	 System.out.println("bank IFSC Code:"+bankif);
	}


	
	@Then("user should enter the bank name {string}")
	public void user_should_enter_the_bank_name(String string) {
		 System.out.println("bank name :"+string);
		  System.out.println("--------------------------");
	}
	
//	@Then("^user should enter the bank name\"([^\"]+)\"$")
//	public void user_should_enter_the_bank_name(String string) {
//	  System.out.println("bank name :"+string);
//	  System.out.println("--------------------------");
//	}
	
	@When("user should open the request loan link")
	public void user_should_open_the_request_loan_link() {
	
		System.out.println("user navigate the request loan link");
	}

	@Then("user should enter the LoanAmount {int} and Downpayment {int}")
	public void user_should_enter_the_loan_amount_and_downpayment(Integer int1, Integer int2) {
		System.out.println("Eligible Loan Amount:"+int1);
		System.out.println("Down Payment:"+int2);
	}
	
//	@Then("^user should enter the LoanAmount \"([0-9]+)\" and Downpayment \"([0-9]+)\"$")
//	public void user_should_enter_the_loan_amount_and_downpayment(Integer int1, Integer int2) {
//		System.out.println("Eligible Loan Amount:"+int1);
//		System.out.println("Down Payment:"+int2);
//		
//	}

	@Then("^user select which account need as a loan \"([^\"]+)\"$")								// pass///
	public void user_select_which_account_need_as_a_loan(String string) {
		System.out.println(" In which bank does the cutomer wants to credit this loan amount:"+string);
	}
}