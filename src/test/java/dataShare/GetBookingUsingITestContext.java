package dataShare;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.ITestContext;
//vid-45
//it didnt run as it is related to testNG and testNG.xml file has some error in this prjct

//we have to run both SharingDataUsingITextContextOfTestNG and GetBookingUsingITestContext at the same time using
//testNG.xml file, otherwise when we run GetBookingUsingITestContext..we get null id

//under <test <2 classes> </test>, then only it works..means in one test tag..2 clases must be included
// if we place 2 test tags and separate the classes ...cannot share data b/w 2 test tags


public class GetBookingUsingITestContext
{
    @Test
    public void getbooking(ITestContext context)
    {

        //get booking details using booking ID
        Response resp= RestAssured
                .given()
                .log()
                .all()
                .get("https://restful-booker.herokuapp.com/booking/"+context.getAttribute("bookingId"))
                .then()
                .log()
                .all().extract().response();
    }
}
