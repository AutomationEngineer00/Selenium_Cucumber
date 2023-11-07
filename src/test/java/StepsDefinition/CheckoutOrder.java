package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import resources.utility.BrowserDriver;

public class CheckoutOrder extends BrowserDriver {

    @Given("the user have browser open")
    public void verify_browser_is_open() {
        System.out.println("the user have browser open");
        setUp();
    }

    @And("user is logged into the e-commerce site")
    public void verify_user_has_successfully_logged_into_site() {
        System.out.println("user is logged into the e-commerce site");
    }

    @When("logged in, user must order a bottle of Beyerskloof Pinotage 2019 from the shop")
    public void user_places_an_order() {
        System.out.println("logged in, user must order a bottle of Beyerskloof Pinotage 2019 from the shop");
    }

    @And("Checkout the order")
    public void user_checkout_order() {
        System.out.println("Checkout the order");
    }

    @Then("Print the order number")
    public void print_order_number() {
        System.out.println("Print the order number");
        System.out.println("QUIT BROWSER!!");
        closeDriverGracefully();
    }
}
