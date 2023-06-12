package airlines;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ConvertJsonObjectResponseToMap
{
    @Test
    public void convertResponseIntoMap()
    {
        Map jsonRespAsMap= RestAssured
                .get("https://run.mocky.io/v3/5b46bde7-eb0e-4b08-b0d8-70b9723eec98")
                .as(Map.class);
        String firstname= (String) jsonRespAsMap.get("first_name");
        System.out.println("name is "+firstname);
        jsonRespAsMap.keySet().forEach(k->System.out.println(k));
        //or
        System.out.println(jsonRespAsMap.keySet());
    }
}
