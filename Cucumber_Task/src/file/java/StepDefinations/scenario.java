package StepDefinations;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;

public class scenario {
	
	
	
	@Given("Launch the browser {string}")
	public void launch_the_browser(String name) {
	    System.out.println("Name of the Employee:"+name);
	}


	@Then("employe grossSalary\"{int}\"")
	public void employe_gross_salary(Integer int1) {
	 System.out.println("Emp gross salary:"+int1);
		
	}

	@Then("employe pf {string} and Income tax {string}")
	public void employe_pf_and_income_tax(String lng1, String lng2) {
	   System.out.println("PF:"+lng1);
	   System.out.println("IncomeTax:"+lng2);
	}

	@Then("employe profissionaltax {string}")
	public void employe_profissionaltax(String lng) {
	   System.out.println("ProfissionalTax:"+lng);
	}

	@Then("employe netsalary\"{int}\"")
	public void employe_netsalary(Integer ns) {
	    
		System.out.println("Netsalary:"+ns);
		
	}

	@Then("close the data alzlizing")
	public void close_the_data_alzlizing() {
	 
		System.out.println("After salary calulating completed");
		System.out.println("---------------------------");
	}


}
