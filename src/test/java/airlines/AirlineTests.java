package airlines;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import restUtils.RestUtils;

import java.util.HashMap;

public class AirlineTests {

    // creating airline by using post method

    @Test
    public void createAirline()
    {

        String endPoint="https://api.instantwebtools.net/v1/airlines";
        String payLoad="{\n" +
                "    \"_id\": \"6479db8d07a46c33b01581db\",\n" +
                "    \"id\": 11222334455,\n" +
                "    \"name\": \"Sri Lankan Airways\",\n" +
                "    \"country\": \"Sri Lanka\",\n" +
                "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                "    \"slogan\": \"From Sri Lanka\",\n" +
                "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                "    \"website\": \"www.srilankaairways.com\",\n" +
                "    \"established\": \"1990\",\n" +
                "    \"__v\": 0\n" +
                "}";

        Response resp= RestUtils.performPost(endPoint,payLoad,new HashMap<>());


        /*Response resp=RestAssured.given().log().all()
        .baseUri("https://api.instantwebtools.net/v1/airlines")
                .contentType(ContentType.JSON)
                .body("{\n" +
                        "    \"id\": 112223344,\n" +
                        "    \"name\": \"Sri Lankan Airways\",\n" +
                        "    \"country\": \"Sri Lanka\",\n" +
                        "    \"logo\": \"https://upload.wikimedia.org/wikipedia/en/thumb/9/9b/Qatar_Airways_Logo.svg/sri_lanka.png\",\n" +
                        "    \"slogan\": \"From Sri Lanka\",\n" +
                        "    \"head_quaters\": \"Katunayake, Sri Lanka\",\n" +
                        "    \"website\": \"www.srilankaairways.com\",\n" +
                        "    \"established\": \"1990\",\n" +
                        "    \"__v\": 0\n" +
                        "}").post().then().log().all().extract().response();*/

        Assert.assertEquals(resp.getStatusCode(),200);
    }
}
