@api
Feature: Rest API

  @api
  Scenario: Test get status
    Given prepare url
    When hit api get list users
    Then validation status code is equals 200