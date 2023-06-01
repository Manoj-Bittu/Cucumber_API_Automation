Feature: Demo API test
  Scenario: Demo API test
    Given the API endpoint is "https://reqres.in/api/users?page=1&per_page=10"
    And the request body is:
      """
      {
        "username": "admin",
        "psswrd": "Admin@123"
      }
      """
    When I send a GET request
    Then the response status code should be 200
#    And the response body should contain "Login Successful"
#    And the response body should contain "johndoe@example.com"

