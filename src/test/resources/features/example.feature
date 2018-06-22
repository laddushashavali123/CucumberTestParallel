@example
Feature: Example

  Scenario Outline: Running examples in parallel
    Given I want to run a scenario example in parallel
    And I am using the parallel plugin
    And this is the <num> example
    Then there should be a total of <total> scenarios run

    Examples:
      | num | total |
      | 1   | 2     |
      | 2   | 2     |