
@EndToEndTesting
Feature: To validate the booking functionlaity

  Background: 
    Given The Adactin page should be launched

  @Sanity @Retesting
  Scenario Outline: To book a hotel in adactin webpage with vaild credentials
    When the user enters the "<userName>" and "<password>" and clicks login
    And user selects the "<location>","<hotel>","<roomtype>","<numberofrooms>","<adultsperroom>"and click search
    And user selects the hotel and click continue
    And user enters "<FirstName>","<LastName>","<Address>","<CCNumber>","<CCType>","<ExpiryMonth>","<ExpiryYear>","<CVVNumber>" and click book
    Then user gets the booking id

    Examples: 
      | userName  | password  | location  | hotel       | roomtype | numberofrooms | adultsperroom | FirstName | LastName    | Address | CCNumber         | CCType | ExpiryMonth | ExpiryYear | CVVNumber |
      | kavin8080 | kavin8080 | Melbourne | Hotel Creek | Double   | 1 - One       | 2 - Two       | Kavin     | karthikeyan | Chennai | 8080248110031010 | VISA   | February    |       2022 |       123 |

  @Smoke @Sanity
  Scenario: verifying the user registration
    When User clicking new registration
    Then user created account successfully
