package responsePkg;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.Map;

public class ConvertNestedJsonObjectResponseToMap
{
    @Test
        public void getResponseAsMap()
        {
           Map jsonRespAsMap= RestAssured
                   .get("https://run.mocky.io/v3/4b3d76b3-544a-4aea-90f5-19cebe9d3cc3")
                   .as(Map.class);

           String k= (String) jsonRespAsMap.get("first_name");
           System.out.println(k);
           Map<String,String> skillsMap= (Map<String, String>) jsonRespAsMap.get("skills");

           System.out.println(skillsMap.get("name"));
           System.out.println(skillsMap.get("proficiency"));

        }
}
