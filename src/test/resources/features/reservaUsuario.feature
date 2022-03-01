@Stories2
  Feature: book a hotel with a registered user

    @scenario2
    Scenario:search hotels with a registered user
      Given that the user wants to reserve a hotel with his user
      When user log in and record the data of reservation data
        |strDestination  |strBedrooms     |
        |Cúcuta          |1               |
      And choose the hotel with their preferences
      Then user successfully
         |strVerif     |
         |Último paso  |



