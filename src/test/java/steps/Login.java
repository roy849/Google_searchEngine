package steps;

import common.Googlebase;
import io.cucumber.java.en.When;

public class Login extends Googlebase{

    @When("i enter {string} in the email text  box")
    public void i_enter_in_the_email_text_box() {
       launchBrowser("www.amazon.com");

    }

    @When("i click on the continue button")
    public void i_click_on_the_continue_button() {
// hello world  kfjjgjgknjjkjklg
      //  lfjjfgj


    }

    @When("i enter {string} in the password text box")
    public void i_enter_in_the_password_text_box(String string) {

    }

    @When("i click on the sign in button")
    public void i_click_on_the_sign_in_button() {

    }
}
