Feature: Book
  @book
  Scenario: User should be able to navigate on book page
    Given user is on home page
    When user click on book category
    Then user should be abl eto navigate on book page
