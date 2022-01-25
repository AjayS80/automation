package cucumber.steps;

import io.cucumber.java.en.And;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;

public class PostWithParameter {
    @Given("^The link to test$")
    public void the_link_to_test() throws Throwable {
        System.out.println("^11111");
    }

    @When("^I type the \"([^\"]*)\" in the box$")
    public void i_type_the_something_in_the_box(String strArg1) throws Throwable {
        System.out.println("22222");
    }



    @Then("^the message should get posted$")
    public void the_message_should_get_posted() throws Throwable {
        System.out.println("3333");
    }

    @Then("^the  link should be opened$")
    public void the_link_should_be_opened() throws Throwable {
        System.out.println("77777");
    }

    @And("^Click on the Post button$")
    public void click_on_the_post_button() throws Throwable {
        System.out.println("44444");
    }

    @And("^Click on the okay button$")
    public void click_on_the_okay_button() throws Throwable {
        System.out.println("55555");
    }


    @When("I on the given {string} link")
    public void iOnTheGivenLink(String arg0) {
        System.out.println(66666);
    }
}
