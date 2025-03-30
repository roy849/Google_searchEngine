package steps;

import common.Googlebase;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import org.testng.Assert;
import page.googleHomepage;

public class Searchingproduct extends Googlebase {



    @Given("i am on the google home page")
    public void i_am_on_the_google_home_page() {


        launchBrowsertest("https://www.google.com/");


    }





    @When("i enter {string} in the search bar")
    public void i_enter_in_the_search_bar(String  product_name) {

        googleHomepage Gh = new googleHomepage(dr);

        Gh.enterProduct(product_name);


    }

    @When("i click on the search button")
    public void i_click_on_the_search_button() {

        googleHomepage Gh = new googleHomepage(dr);

        Gh.ClickonSearchButton();
    }

    @Then("i can see the search result successful")
    public void i_can_see_the_search_result_successful() {

        googleHomepage Gh = new googleHomepage(dr);


       Assert.assertTrue(Gh.validateAllTab());

      closeAll();
    }


}
