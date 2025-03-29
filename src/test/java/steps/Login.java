package steps;

import io.cucumber.java.en.When;
import org.openqa.selenium.chrome.ChromeDriver;

import java.util.concurrent.TimeUnit;

public class Login {
    ChromeDriver driver;
    @When("i enter {string} in the email text  box")
    public void i_enter_in_the_email_text_box() {
        driver = new ChromeDriver();
        driver.get("https://www.google.com/");

        driver.manage().window().maximize();
        driver.manage().timeouts().implicitlyWait(30, TimeUnit.SECONDS);

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
}
