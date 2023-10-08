Feature: Checkout the textbox form functionality 


@Smoke
Scenario: Enter the data into the given fields 

  Given User is on Text Box page "https://demoqa.com/text-box"
    When User enters his FullName as "Nitin"
    And Email as "Nitin@gmail.com"
    And Current address as "Mohali" and Parmanent address as "Dehradun"
    And Clicks on the submit button
    Then Entered data should display below the form