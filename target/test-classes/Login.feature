Feature: Generating OrderId from Adactin Hotel Website

  Scenario Outline: Login with incorrect username and password
    Given user is on Adactin Hotel page
    When user enter "<username>" and "<password>"
    And user should click login button
    And user is on search Hotel
    And user is on select Hotel and move to Book Hotel page
    When user enter "<firstname>" and "<lastname>" and "<Address>" and "<CCnum>" and "<Ccvno>"
    Then user will be on confirm page and orderId will be generated

    Examples: 
      | username      | password | firstname | lastname | Address | CCnum            | Ccvno |
      | gokulkrishnan | HARIHARI | Hari      | Haran    | Chennai | 8798465312213216 |  4567 |
