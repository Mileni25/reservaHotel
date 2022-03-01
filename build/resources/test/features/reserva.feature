@Stories
Feature: book a hotel with different conditions

  @scenario1
  Scenario: search hotels in a city
    Given that the user wants to reserve a hotel
    When user fill out the form
    |strDestinationCity|
    |Bogota            |
    Then user successfully reserve
    |strVerif          |
    |Elija un destino  |



