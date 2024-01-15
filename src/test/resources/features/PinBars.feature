@B31G3-274
Feature: As a user, I want to learn how to use  pinbar
  User Story: As a user, I want to learn how to use the pinbar

  Background:
    Given The user is on log in page
@B31G3-272
  Scenario Outline: Verify pinbar's functionality

    Given The user logins on the login page as "<userType>"
    Then user clicks on "How to use this space" bar
    Then user sees "How to use pinbar"
    And user clicks pin icon on the top right corner
Examples:
  | userType      |
  | driver        |
  | sales manager |
  | store manager |



@B31G3-273
  Scenario Outline: Verify that  users see an image on the page
  Given The user logins on the login page as "<userType>"
  Then user clicks on "How to use this space" bar
  Then user sees an expected image
    Examples:
      | userType      |
      | driver        |
      | sales manager |
      | store manager |