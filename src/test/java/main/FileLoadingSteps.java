package main;

import java.io.File;

import static org.junit.Assert.*;
import cucumber.api.PendingException;
import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;
import wrapper.DynAlloyRunner;

public class FileLoadingSteps {
	
	String filename;
		
	DynAlloyRunner runner;
	
	Boolean invalidFile = null;
	
	int numberOfAssertions;

	@Given("^that the user provides a file called (.*)$")
	public void that_the_user_provides_a_file(String filename) throws Throwable {
		this.filename = filename;
	}

	@When("^I (?:open|load) the file")
	public void i_open_filename() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		try {
			File f = new File(this.filename);
			this.runner = new DynAlloyRunner(f);
			this.invalidFile = new Boolean(false);
		}
		catch (IllegalArgumentException e) {
			this.invalidFile = new Boolean(true);
		}
		
	}

	@Then("^the system should check whether the file contains a valid Alloy model$")
	public void the_system_should_check_whether_the_file_contains_a_valid_Alloy_model() throws Throwable {
	    assertTrue(this.invalidFile != null);
	}

	@Then("^the system should check that the model contains a repOK predicate\\.$")
	public void the_system_should_check_that_the_model_contains_a_repOK_predicate() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertTrue(this.invalidFile != null);
	}
	
	@Given("^the file contains a valid Alloy model with (\\d+) assertions$")
	public void the_file_contains_a_valid_Alloy_model_with_expected_number_of_assertions(int numberOfAssertions) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
		this.numberOfAssertions = numberOfAssertions;
	}

	@Then("^the system should inform that the number of assertions is (\\d+)\\.$")
	public void the_system_should_inform_that_the_number_of_assertions_is(int expectedNumberOfAssertions) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    assertEquals(expectedNumberOfAssertions, runner.getNumberOfAssertions());
	}

	@When("^I start the learning process$")
	public void i_start_the_learning_process() throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	@Then("^the system should create an initial population of length-(\\d+) chromosomes$")
	public void the_system_should_create_an_initial_population_of_length_chromosomes(int arg1) throws Throwable {
	    // Write code here that turns the phrase above into concrete actions
	    throw new PendingException();
	}

	
	
}
