@all

Feature: Login and doing things
  @random_tag
  Scenario: doing stuff
    Given I login
    When I change network to Goerli
    And I connect MetaMask
    And I click Mint Free Tockens button
    Then I approve transaction