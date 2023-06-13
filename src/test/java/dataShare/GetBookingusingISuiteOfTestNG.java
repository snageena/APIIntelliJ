package dataShare;
//vid-46
//here in previous video means using ItextContext, we cannot share data if we are giving 2 classes
//separately under 2 seaprate test taga in TestNG.xml file, so we can overcome that by using Isuite of TESTNG using below code

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.ITestContext;

public class GetBookingusingISuiteOfTestNG {
    @Test
    public void getbokingdetails(ITestContext context) {
        Response resp = RestAssured
                .given()
                .log()
                .all()
                .get("https://restful-booker.herokuapp.com/booking/" + context.getSuite().getAttribute("bookingId"))
                .then()
                .log()
                .all().extract().response();
    }
}
