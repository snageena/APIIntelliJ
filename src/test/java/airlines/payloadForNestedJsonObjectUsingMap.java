package airlines;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
//vid-35
import java.util.LinkedHashMap;
import java.util.Map;
//{
//    "id": 111,
//    "salary": 204.34,
//    "first_name": "clarie",
//    "last_name": "Dennerley",
//      "email": "clarie123@gmail.com",
//    "gender": "Male",
//    "address":
//    {
//      "no":"#81"
//      "streetname":"ABC Lane",
//      "city":"bnglr"
//      "state":"KA"
//    }
//  }
public class payloadForNestedJsonObjectUsingMap
{
    @Test
    public void test()
    {
        Map<String,Object> payload=new LinkedHashMap<>();
        payload.put("id","111");
        payload.put("first_name","clarie");
        payload.put("last_name","Dennerley");
        payload.put("salary","204.34");
        payload.put("email","clarie123@gmail.com");
        payload.put("gender","Male");

        Map<String,Object> addressMap=new LinkedHashMap<String,Object>();
        addressMap.put("no","#81");
        addressMap.put("streetname","ABC Lane");
        addressMap.put("city","bnglr");
        addressMap.put("state","KA");

        payload.put("address",addressMap);

        RestAssured.given().log().all().body(payload).get();


    }
}
