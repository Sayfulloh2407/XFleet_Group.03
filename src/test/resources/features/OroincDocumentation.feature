@B31G3-260
Feature: Access to the Oroinc Documentation page

  @B31G3-259
  Scenario Outline: Verify access to the Oroinc Documentation page

    Given the user is on the login page
    Given the user logged in as "<userType>"
    And the user click the question mark icon
    Then the user access to the Oroinc Documentation page

    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |