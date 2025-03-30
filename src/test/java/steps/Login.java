package steps;

import common.Googlebase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class Login extends Googlebase{

    @Given("i am on the amazon home page")
    public void i_am_on_the_amazon_home_page() {
       launchBrowser("www.amazon.com");
    }
    @When("i enter {string} in the email text  box")
    public void i_enter_in_the_email_text_box(String string) {

    }
    @When("i click on the continue button")
    public void i_click_on_the_continue_button() {

    }
    @When("i enter {string} in the password text box")
    public void i_enter_in_the_password_text_box(String string) {
    }
    @When("i click on the sign in button")
    public void i_click_on_the_sign_in_button() {

    }
    @Then("i can loginto my account successful")
    public void i_can_loginto_my_account_successful() {

    }


}
