package NewCucumbertest;

import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class SecondTestSteps {
    @Given("the user is logged in")
    public void the_user_is_logged_in() {
        System.out.println("User logged in");
    }
    @When("the user clicks on my profile icon")
    public void the_user_clicks_on_my_profile_icon() {
      System.out.println("The user clicked on my profile icon");

    }
    @Then("the user should be redirected to my profile page")
    public void the_user_should_be_redirected_to_my_profile_page() {
        System.out.println("The user redirected to my profile icon");
    }
}
