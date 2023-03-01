Feature: progress bar testing

  Scenario: stop progress bar when it reaches your age
    Given progress bar on the page
    When user clicks of Start button
    And when bar shows "23"
    Then user closes the page
