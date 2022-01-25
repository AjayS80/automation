Feature: post feature on facebook

  Background: Steps to perform
    Given The link to test
 @SmokeTest
  Scenario: post a message
    When I type the "Post" in the box
    And Click on the Post button
    Then the message should get posted
  @hello
    Scenario: open a link
      When I on the given "https://www.google.com" link
      And Click on the okay button
      Then the  link should be opened