@B31G3-282
Feature: View columns on the Vehicle models page

  User Story:
  US5- As a user, I want to view columns on the Vehicles Model page. (web-table)

  Background:
    Given The user is on log in page

  @B31G3-279
  Scenario: Log in as a Store Manager
    When user logs in as store manager
    And user clicks on Fleet module
    Then user clicks on Vehicle Model option
    Then the user sees 10 columns -MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS


  @B31G3-280
  Scenario: Log in as a Sales Manager
    When user logs in as sales manager
    And user clicks on Fleet module
    Then user clicks on Vehicle Model option
    Then the user sees 10 columns -MODEL NAME, MAKE, CAN BE REQUESTED, CVVI, CO2 FEE (MONTH), COST (DEPRECIATED), TOTAL COST (DEPRECIATED), CO2 EMISSIONS, FUEL TYPE, VENDORS


  @B31G3-281
  Scenario: Log in as a Driver
    When user logs in as driver
    And user clicks on Fleet module
    Then user clicks on Vehicle Model option
    Then user sees You do not have permission to perform this action. message screen