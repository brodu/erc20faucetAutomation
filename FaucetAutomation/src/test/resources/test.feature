@all

Feature: Auto tests for erc20faucet.com
  @random_tag
  Scenario: Connecting MetaMask and doing initial transaction
    Given I login
    When I change network to Goerli
    And I connect MetaMask
    And I click Mint Free Tockens button
    Then I approve transaction
