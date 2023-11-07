package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.utility.BrowserDriver;

public class loginSteps  extends BrowserDriver {
    @Given("user is on login page")
    public void user_is_on_login_page() {
        System.out.println("INSIDE STEPS: user is on login page");
    }

    @When("user enters valid username and password")
    public void user_enters_valid_username_and_password() {
        System.out.println("INSIDE STEPS: user enters valid username and password");
    }

    @And("clicks on login button")
    public void clicks_on_login_button() {
        System.out.println("INSIDE STEPS: clicks on login button");
    }

    @Then("user navigated into the home page")
    public void user_navigated_into_the_home_page() {
        System.out.println("INSIDE STEPS: user navigated into the home page");
        //wd.close();
    }

}
