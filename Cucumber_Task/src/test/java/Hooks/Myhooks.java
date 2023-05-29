package Hooks;

import io.cucumber.java.After;
import io.cucumber.java.AfterStep;
import io.cucumber.java.Before;
import io.cucumber.java.BeforeStep;

public class Myhooks {

	@Before
	public void open() {
		System.out.println("Before lanuch browser");
		System.out.println("============");
	}
	
	@After
	public void close() {
		
		System.out.println("after execution completed");
		System.out.println("=============");
	}
	
	@BeforeStep
	public void beforesteps() {
	
		System.out.println("Before Step files 'timeswaits' ");
		System.out.println("-------------------");
	}
	@AfterStep
	public void aftersteps() {
		
		System.out.println("After step files 'screen shots' ");
		System.out.println("........................");
	}
	
}
