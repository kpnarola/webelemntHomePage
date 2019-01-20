package comnopcommercedemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils {

HomePage homePage = new HomePage();
AssertPage assertPage= new AssertPage();
    @Given("^user is on the home page$")
    public void userIsOnTheHomePage() {
    }

    @When("^user click on Apparel category$")
    public void userClickOnApparelCategory() {
        homePage.clickOnAppareal();

    }

    @Then("^user should be abl eto navigate on apparel page$")
    public void userShouldBeAblEtoNavigateOnApparelPage() {
        assertPage.toVerifyApparealPage();

    }
//test steps for book category
    @Given("^user is on home page$")
    public void userIsOnHomePage() {

    }

    @When("^user click on book category$")
    public void userClickOnBookCategory() {
        homePage.clickOnBookCategory();

    }

    @Then("^user should be abl eto navigate on book page$")
    public void userShouldBeAblEtoNavigateOnBookPage() {
        assertPage.toVerifyBookPage();
    }
}
