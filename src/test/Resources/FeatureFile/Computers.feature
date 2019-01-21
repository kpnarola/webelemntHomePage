Feature: Computer
  @computer
  Scenario: To verify user should be on computer page
    Given user is on home page
    When user click on computer category
    Then user should be able to navigate on computer page
