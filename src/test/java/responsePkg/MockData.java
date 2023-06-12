package responsePkg;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

//vid-38
//to mock the response go to https:://designer.mocky.io and get any jsonbody and paste it in body section clicking
//new mock then click on generate http response and u will get one api url

//here when we are working on integration testing and want to communicate from one API to another API,
//but the other API is not ready but we know the response we are expecting from second API...so untill
//we get the new API url, we just create one response json body in json editor and create mock Api
// and we continue testing...later after getting real API, we just replace the mock API with real API

public class MockData
{
    @Test
    public void test()
    {
        RestAssured.given().log().all()
                .get("https://run.mocky.io/v3/b071c714-a40d-450e-9e6c-0968afcbd241")
                .then().log().all();
    }
}
