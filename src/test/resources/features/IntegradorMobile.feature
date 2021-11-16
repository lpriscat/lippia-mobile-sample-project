Feature: Como usuario de clockify, quiero interactuar con la aplicación mobile

  Scenario Outline: The user starts the application, logins successfully, changes the state of a button, and tracks progress (hours) into a project.
    Given The app is loaded correctly
    When The user goes to the login page
    And The user enters with: <email>, <password>
    Then Clockify Home page is displayed

    @Demo
    Examples:
      | email                  | password |
      | prisco.lucas@gmail.com | Pass123* |


  Scenario Outline: The user is logged in the application and changes the status of a button in a successful way
    Given The user logins successfully with <email> and <password>
    When The user taps on the hamburger menu
    And The user taps on settings
    And The user taps on enable dark mode
    Then Clockify is set to dark mode
    @Demo
    Examples:
      | email                  | password |
      | prisco.lucas@gmail.com | Pass123* |



  Scenario Outline: The user is logged in the application and adds a time entry to a project
    Given The user logins  with <email> and <password>
    When  the user clicks on project
    And   the user adds a <task> to a project
    Then  the user verifies that the <task> has been loaded successfully
    @Demo
    Examples:
      | email                  | password |
      | prisco.lucas@gmail.com | Pass123* |

