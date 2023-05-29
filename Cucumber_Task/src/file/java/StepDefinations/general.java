package StepDefinations;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class general {

	@Given("user opne the browser")
	public void user_opne_the_browser() {
	   
		System.out.println("open the browser");
	}

	@Then("fetch the url")
	public void fetch_the_url() {
	 
		System.out.println("Automation works");
	}

	@And("fetch the body of the data")
	public void fetch_the_body_of_the_data() {
	  System.out.println("funtional data");
	}

	@Then("user close the browser")
	public void user_close_the_browser() {
	  System.out.println(("close the browser"));
	  System.out.println("------------------");
	}

	@Then("user open the particular maduel")
	public void user_open_the_particular_maduel() {
	    System.out.println("open particular madual");
	}

	@And("Testing all related functionalites")
	public void testing_all_related_functionalites() {
	   System.out.println("Regration testing");
	}

	@And("Testing particular maduel")
	public void testing_particular_maduel() {
	System.out.println("testing particular maduel");
	}
	
}
