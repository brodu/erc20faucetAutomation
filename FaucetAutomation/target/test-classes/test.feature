@all

Feature: Login and doing things
  @random_tag
  Scenario: doing stuff
    Given I login
    When I change network to Goerli
    And I connect MetaMask
    And I enter sum to the pocket
    And I click Mint Free Tockens button
    And I approve transaction
    Then I am assured that balance changed