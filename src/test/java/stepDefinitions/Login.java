package stepDefinitions;

import io.cucumber.java.en.*;
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.testng.Assert;

public class Login {
    private String endPoint;
    private Response response;

    @Given("the API endpoint is {string}")
    public void the_api_endpoint_is(String endPoint) {
        this.endPoint=endPoint;
    }
    @When("I send a GET request")
    public void i_send_a_get_request() {
        response = RestAssured.given()
                .relaxedHTTPSValidation()
                .contentType(ContentType.JSON)
                .get(endPoint);
    }
    @Then("the response status code should be {int}")
    public void the_response_status_code_should_be(Integer int1) {
        System.out.println(response.prettyPrint());
        Assert.assertEquals(response.statusCode(),int1);
    }
}
