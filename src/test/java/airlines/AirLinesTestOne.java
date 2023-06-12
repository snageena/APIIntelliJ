package airlines;

import io.restassured.response.Response;
import org.junit.jupiter.api.Test;
import org.testng.Assert;
import restUtils.RestUtils;
import utils.JsonUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

import static airlines.PayLoads.getCreateAirlinePayloadfromMap;
import static airlines.PayLoads.getCreateAirlinePayloadfromString;

public class AirLinesTestOne
{
    @Test
    public void createAirlineNew()
    {
        String endPoint="https://api.instantwebtools.net/v1/airlines";
        String payload= getCreateAirlinePayloadfromString("11223344344453", "ABC Airlines",  "IN", "ABC",  "ABC slogan",  "Mumbai", "www.abc.com", " 1990");
        Response resp= RestUtils.performPost(endPoint,payload,new HashMap<>());
        Assert.assertEquals(resp.getStatusCode(), 200);
    }
    @Test
    public void createAirlineusingMap()
    {
        String endPoint="https://api.instantwebtools.net/v1/airlines";
        Map payload= getCreateAirlinePayloadfromMap("1122334434344453", "ABC Airlines",  "IN", "ABC",  "ABC slogan",  "Mumbai", "www.abc.com", " 1990");
        Response resp= RestUtils.performPostMap(endPoint,payload,new HashMap<>());
        Assert.assertEquals(resp.getStatusCode(), 200);
    }

    //here under resources we have to create arilines and under that crate qa and dev 2 seaprate folders..so that we
   // can give environment names and select the required env...but its creating like airlines.qa.dev
    @Test
    public void createAirlineusingJsonFile() throws IOException {

        String env=System.getProperty("env")==null?"qa":System.getProperty("env");
        Map<String,String> data=JsonUtils.getJsonDataAsMap("airlines/"+env+"/QAairlinesAPIData.json");
        //Map<String,String> data=JsonUtils.getJsonDataAsMap("airlines/qa/dev/DEVAirlinesAPIData.json");
        String endPoint=data.get("createAirLineEndpoint");
        String payload= getCreateAirlinePayloadfromString("1221223344344453", "ABC Airlines",  "IN", "ABC",  "ABC slogan",  "Mumbai", "www.abc.com", " 1990");
        Response resp= RestUtils.performPost(endPoint,payload,new HashMap<>());
        Assert.assertEquals(resp.getStatusCode(), 200);

    }


}
