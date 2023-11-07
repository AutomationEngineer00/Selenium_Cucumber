package StepsDefinition;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import resources.utility.BrowserDriver;

import java.util.concurrent.TimeUnit;

public class LoginDemoTest extends BrowserDriver {
    @Given("the user have browser open")
    public void user_has_navigated_to_the_system_under_test() {
        setUp();
    }

    @When("user has navigated to the System Under Test - Search for something")
    public void user_navigates_then_search() {
        wd.get("https://www.google.co.za/");
        wd.findElement(By.name("q")).sendKeys("Automation Step by step");
        wd.findElement(By.name("q")).sendKeys(Keys.ENTER);
    }

    @And("user clicks on the first results on the list")
    public void select_first_result_on_the_list() {
        wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//a[@href='https://automationstepbystep.com/']")).click();
    }

    @Then("user should be able to see the landing dashboard page")
    public void user_should_be_able_to_see_the_landing_dashboard_page() {
        wd.manage().timeouts().pageLoadTimeout(30, TimeUnit.SECONDS);
        wd.findElement(By.xpath("//a[text()='Automation Step by Step']")).isDisplayed();
        closeDriverGracefully();

    }

}
