package comnopcommercedemo;

import cucumber.api.java.en.Given;
import cucumber.api.java.en.Then;
import cucumber.api.java.en.When;

public class MyStepdefs extends Utils {

    HomePage homePage = new HomePage();
    AssertPage assertPage = new AssertPage();

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

    // test steps for computer page
    @When("^user click on computer category$")
    public void userClickOnComputerCategory() {
        homePage.clickOnComputerCategory();
    }

    @Then("^user should be able to navigate on computer page$")
    public void userShouldBeAbleToNavigateOnComputerPage() {
        assertPage.toVerifyComputerPage();
    }

    //Test steps for Digital Downloads Page
    @When("^user click on Digital Downloads category$")
    public void userClickOnDigitalDownloadsCategory() {
        homePage.clickOnDigitalDownloadsCategory();
    }

    @Then("^user should be able to navigate on Digital Downloads page$")
    public void userShouldBeAbleToNavigateOnDigitalDownloadsPage() {
        assertPage.toVerifyDigitalDownloadsPage();
    }
    //Test steps for Electronic page
    @When("^user click on electronic category$")
    public void userClickOnElectronicCategory() {
        homePage.clickOnElectronicsCategory();
    }
    @Then("^user should be abl eto navigate on electronic page$")
    public void userShouldBeAblEtoNavigateOnElectronicPage() {
        assertPage.toVerifyElectronicsPage();
    }
    //Test steps for gift card page
    @When("^user click on gift card category$")
    public void userClickOnGiftCardCategory() {
    homePage.clickOnGiftCardsCategory();
    }
    @Then("^user should dbe able to navigate on gift card page$")
    public void userShouldDbeAbleToNavigateOnGiftCardPage() {
        assertPage.toVerifyGiftCardsPage();
    }
    //Test steps for Jewelery page
    @When("^user click on jewelry category$")
    public void userClickOnJewelryCategory() {
    homePage.clickOnJewelryCategory();
    }

    @Then("^user should be abl eto navigate on jewelry page$")
    public void userShouldBeAblEtoNavigateOnJewelryPage() {
        assertPage.toVerifyJewelryPage();
    }
}
