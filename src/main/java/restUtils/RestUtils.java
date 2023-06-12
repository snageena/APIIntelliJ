package restUtils;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import io.restassured.response.Response;

import java.util.Map;

public class RestUtils
{
    public static Response performPost(String endPoint, String requestPayload, Map<String,String> heders)
    {
        Response resp=RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(heders)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then()
                .log().all()
                .extract().response();
        return resp;
    }

    public static Response performPostMap(String endPoint, Map<String,Object> requestPayload, Map<String,String> heders)
    {
        Response resp=RestAssured.given().log().all()
                .baseUri(endPoint)
                .headers(heders)
                .contentType(ContentType.JSON)
                .body(requestPayload)
                .post()
                .then()
                .log().all()
                .extract().response();
        return resp;
    }
}
