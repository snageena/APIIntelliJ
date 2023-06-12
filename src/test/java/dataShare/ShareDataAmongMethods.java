package dataShare;
//vid-42
//share data from one API to another API

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

public class ShareDataAmongMethods
{
    private int bookingId;

    @Order(2)
    @Test()
    public void createandRetrieveBooking()
    {
         bookingId= RestAssured.given()
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


            }
    @Test
    public void retrieveBooking()
    {
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
