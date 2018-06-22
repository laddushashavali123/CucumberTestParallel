package com.github.kevbradwick;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;

public class ExampleSteps {
    @Given("^I want to run a scenario example in parallel$")
    public void i_want_to_run_a_scenario_example_in_parallel() throws Throwable {
    }

    @Given("^I am using the parallel plugin$")
    public void i_am_using_the_parallel_plugin() throws Throwable {
    }

    @Given("^this is the (\\d+) example$")
    public void this_is_the_example(int arg1) throws Throwable {
    }

    @Then("^there should be a total of (\\d+) scenarios run$")
    public void there_should_be_a_total_of_scenarios_run(int arg1) throws Throwable {
    }
}
