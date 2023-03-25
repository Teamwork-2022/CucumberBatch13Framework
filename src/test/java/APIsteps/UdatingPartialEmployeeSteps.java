package APIsteps;

import com.google.gson.JsonObject;
import io.cucumber.java.en.Given;
import io.cucumber.java.en.Then;
import io.cucumber.java.en.When;
import io.restassured.RestAssured;
import io.restassured.response.Response;
import io.restassured.specification.RequestSpecification;
import org.junit.Assert;
import org.junit.Test;
import utils.APIConstants;
import utils.APIPayloadConstants;


import static io.restassured.RestAssured.given;



public class UdatingPartialEmployeeSteps {
    RequestSpecification request;
    Response response;
    public static String employee_id;


    @Given("a request is preparing for updating Partial of an employee")
    public void a_request_is_preparing_for_updating_partial_of_an_employee()  {
        String st1;
        request = given().header(APIConstants.HEADER_CONTENT_TYPE, APIConstants.CONTENT_TYPE_VALUE).
                header(APIConstants.HEADER_AUTHORIZATION, GenerateTokenSteps.token).
                body(st1=APIPayloadConstants.updatePartialEmployeePayload());
        System.out.println(st1);






    }
    @When("a patch call is made to update partial of an employee")
    public void a_patch_call_is_made_to_update_partial_of_an_employee() {
        response = request.when().patch(APIConstants.UPDATE_PARTIAL_EMPLOYEE_URI);
        response.prettyPrint();


    }

    @Then("the status code for updating partial of an employee is {int}")
    public void the_status_code_for_updating_partial_of_an_employee_is(Integer CheckstatusCode) {
        response.then().assertThat().statusCode(CheckstatusCode);
        response.prettyPrint();








    }
}
