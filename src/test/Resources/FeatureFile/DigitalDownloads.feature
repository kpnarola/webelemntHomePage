Feature: DigitalDownloads
  @digitalDownloads
  Scenario: To verify user is on Digital Downloads page
    Given user is on home page
    When user click on Digital Downloads category
    Then user should be able to navigate on Digital Downloads page