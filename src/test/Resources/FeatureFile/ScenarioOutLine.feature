Feature: Testing different pages
  @scenarioOutline
  Scenario Outline: user should be able to test different page
    Given user is on the home page
    When user click on the "<category>"link
    Then user should be directed to "<categoryPageUrl>" successfully
    Examples:
      | category          | categoryPageUrl                                |
      | Computers         | https://demo.nopcommerce.com/computers         |
      | Electronics       | https://demo.nopcommerce.com/electronics       |
      | Apparel           | https://demo.nopcommerce.com/apparel           |
      | Digital downloads | https://demo.nopcommerce.com/digital-downloads |
      | Books             | https://demo.nopcommerce.com/books             |
      | Jewelry           | https://demo.nopcommerce.com/jewelry           |
      | Gift Cards        | https://demo.nopcommerce.com/gift-cards        |