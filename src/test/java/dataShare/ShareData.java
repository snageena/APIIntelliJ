package dataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
//vid-42
// go to restfull booker website and click on "api doc" and scoll down and click on createbooking

public class ShareData
{
    @Test
    public void createandRetrieveBooking()
    {
        int bookingId=RestAssured.given()
                .log()
                .all()
                .baseUri("https://restful-booker.herokuapp.com/")
                .basePath("booking")
                .body("{\n" +
                        "    \"firstname\" : \"Jim\",\n" +
                        "    \"lastname\" : \"Brown\",\n" +
                        "    \"totalprice\" : 111,\n" +
                        "    \"depositpaid\" : true,\n" +
                        "    \"bookingdates\" : {\n" +
                        "        \"checkin\" : \"2018-01-01\",\n" +
                        "        \"checkout\" : \"2019-01-01\"\n" +
                        "    },\n" +
                        "    \"additionalneeds\" : \"Breakfast\"\n" +
                        "}")
                .contentType(ContentType.JSON)
                .post()
                .then()
                .log()
                .all().statusCode(200)
                .extract()
                .jsonPath()
                .getInt("bookingid");

        //get booking details using booking ID
       Response resp= RestAssured
               .given()
               .log()
               .all()
               .get("https://restful-booker.herokuapp.com/booking/"+bookingId)
               .then()
               .log()
               .all().extract().response();



    }
}
