package NewCucumbertest;

import helpers.HeaderHelper;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.WebDriver;
import pages.HeaderPage;

public class Steps {
    WebDriver driver;

    HeaderPage headerPage;

    HeaderHelper headerHelper;

    @Given("the user is on login page")
    public void the_user_is_on_login_page() {
        System.out.println("The user is on login page");
    }
    @When("the user enter valid credentials")
    public void the_user_enter_valid_credentials() {
        System.out.println("Entered username and password");
    }
    @When("clicks on submit")
    public void clicks_on_submit() {
        System.out.println("Clicked in submit");
    }
    @Then("the user should be able to login successfully")
    public void the_user_should_be_able_to_login_successfully() {
        System.out.println("User logged in");
    }
}