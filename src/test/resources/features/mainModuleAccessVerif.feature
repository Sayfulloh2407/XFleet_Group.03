@B31G3-277
Feature: Main module access verification for all type of users

#  Background:
#    Given The user is on log in page
@B31G3-275
  Scenario Outline: Main module access verification for Store and Sales Manager
    When The user logins on the login page as "<userType>"
    Then On the Main Page user can access all the main modules of the app as a "<userType>"
      | Dashboards         |
      | Fleet              |
      | Customers          |
      | Sales              |
      | Activities         |
      | Marketing          |
      | Reports & Segments |
      | System             |
    Examples:
      | userType      |
      | sales manager |
      | store manager |
@B31G3-276
  Scenario Outline: Main module access verification for Driver
    When user logs in as driver
    Then On the Main Page user can access all the main modules of the app as a "<userType>"
      | Fleet      |
      | Customers  |
      | Activities |
      | System     |

    Examples:
      | userType |
      | driver   |