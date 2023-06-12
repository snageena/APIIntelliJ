package responsePkg;


import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
//vid-41
public class  HandlingDynamicResponseUsingInstanceOf
{
    @Test
    public void getDynamicResponse()
    {
        Response resp= RestAssured.get("https://run.mocky.io/v3/f4b79f08-ab9c-4197-b47c-a9f2135f3971");

        Object respAsObject=resp.as(Object.class);
        if(respAsObject instanceof List)
        {
            List respAsList=(List) respAsObject;//casting response as Object to response as List

            System.out.println(respAsList.size());
        } else if (respAsObject instanceof Map)
        {
            Map respAsMap=(Map)respAsObject;

            System.out.println(respAsMap.keySet());
        }

    }
}
