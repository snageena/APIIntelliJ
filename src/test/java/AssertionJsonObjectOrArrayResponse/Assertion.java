package AssertionJsonObjectOrArrayResponse;

//json Object body for mock API response url
//{
//  "name": "aaa",
//  "age": 20,
//  "mob": [
//    "1234",
//    "3456"
//  ]
//}

import io.restassured.RestAssured;
import org.hamcrest.Matchers;
import org.testng.annotations.Test;

import java.util.List;
import java.util.Map;

//json array body for mock api response url
//[
//  {
//    "name": "aaa",
//    "age": 20
//  },
//  {
//    "name": "aaa",
//    "age": 20
//  }
//]
// we dont get output here..just this is the process of assertion
public class Assertion
{
    @Test
    public void test()
    {
        //To verify response is a json object I.e. Map
        RestAssured.get("https://run.mocky.io/v3/36efe493-c8e7-49c1-a353-494603d86cfc")
                .then()
                .body(" ", Matchers.instanceOf(Map.class));
        //To verify response is a json Array I.e. List
        RestAssured.get("https://run.mocky.io/v3/87aef67e-b829-42b7-a6f8-1efa03318c6d")
                .then()
                .body(" ", Matchers.instanceOf(List.class));
        //To verify response of json object and inside it mobile is array I.e. List
        RestAssured.get("https://run.mocky.io/v3/87aef67e-b829-42b7-a6f8-1efa03318c6d")
                .then()
                .body("mob ", Matchers.instanceOf(List.class));
    }
}
