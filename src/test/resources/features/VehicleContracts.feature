@B31G3-270
Feature: Access to Vehicle contracts page

   User story:
   US4- As a user, I want to access to Vehicle contracts page

  Background:
    Given The user is on log in page
  @B31G3-267
  Scenario: Log in as a Store Manager
    When user logs in as store manager
    And user clicks on Fleet module
    Then user clicks on Vehicle Contracts option
    Then user sees All - Vehicle Contract - Entities - System - Car - Entities - System in title
  @B31G3-268
  Scenario: Log in as a Sales Manager
    When user logs in as sales manager
    And user clicks on Fleet module
    Then user clicks on Vehicle Contracts option
    Then user sees All - Vehicle Contract - Entities - System - Car - Entities - System in title

  @B31G3-269
  Scenario: Log in as a Driver
    When user logs in as driver
    And user clicks on Fleet module
    Then user clicks on Vehicle Contracts option
    Then user sees You do not have permission to perform this action. message displayed

