package dataShare;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;
import org.junit.jupiter.api.Order;
import org.junit.jupiter.api.Test;

//vid-43
// in this when we are running testmoduleone and testmoduletwo classes parallely using testNG.xml file,
// these both are running by single thread and they are creating 2 different booking id's...but when
// retriving they are taking only one booking id data...so in parallel execution facing this issue
// thread is not safe here...as we have to get 2 different booking id data
public class TestModuleOne
{
    @Order(1)
    @Test
    public void createandRetrieveBooking()
    {
        int id= RestAssured.given()
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

        DataStoreAsMap.setValue(Constants.BOOKINNG_ID,id);

        System.out.println("Thread id is--- "+Thread.currentThread().getId()+
                "Created booking id---"+DataStoreAsMap.getValue(Constants.BOOKINNG_ID));
    }
    @Order(2)
    @Test
    public void retrieveBooking() throws InterruptedException {
        Thread.sleep(10000);

        System.out.println("Thread id is--- "+Thread.currentThread().getId()+
                "Created booking id---"+DataStoreAsMap.getValue(Constants.BOOKINNG_ID));
        int id= (int) DataStoreAsMap.getValue("bookingId");
        //get booking details using booking ID
        Response resp= RestAssured
                .given()
                .log()
                .all()
                .get("https://restful-booker.herokuapp.com/booking/"+id)
                .then()
                .log()
                .all().extract().response();
    }
}
