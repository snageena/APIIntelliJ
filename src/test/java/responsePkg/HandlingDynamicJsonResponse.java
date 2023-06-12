package responsePkg;

import io.restassured.RestAssured;
import io.restassured.response.Response;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
//vid-41
//json online editor is also available
//designer.mocky.io website is used to generate the url by giving body in body box by clicking on new mock
// body we are giving here is
//[
//  {
//    "accountNo": 111,
//    "balance": 20.34,
//    "first_name": "clarie",
//    "last_name": "Dennerley",
//    "email": "clarie123@gmail.com",
//    "gender": "Male"
//  },
//  {
//    "accountNo": 222,
//    "balance": 205.34,
//    "first_name": "clarie",
//    "last_name": "Dennerley",
//    "email": "clarie123@gmail.com",
//    "gender": "Male"
//  }
//]
public class HandlingDynamicJsonResponse {

    //if we start writing the code for response without knowing what response we get when we are hitting API,
    //we will get mismatchedinput exceptions like below

    @Test
    public void mthd()
    {
        Response resp=RestAssured.get("https://run.mocky.io/v3/f4b79f08-ab9c-4197-b47c-a9f2135f3971");

        // as i dont know what kind of response i am getting, i am deserializing the response into map
        Map respMap=resp.as(Map.class);
        System.out.print(respMap.keySet());
        //after giving this and running we get error in console like
        // cannot convert array to linkedHashMap...means response is in form of array, but we are trying to
        //deserialize into map..so we got error
        //error
        //com.fasterxml.jackson.databind.exc.MismatchedInputException:
        // Cannot deserialize value of type `java.util.LinkedHashMap<java.lang.Object,java.lang.Object>`
        // from Array value (token `JsonToken.START_ARRAY`)
    }

    @Test
    public void mthdtwo()
    {
        Response resp=RestAssured.get("https://run.mocky.io/v3/718fb8aa-1729-45ab-a43a-507344a6af6c");

        List respList=resp.as(List.class);
        System.out.println(respList.size());
    //we get error message like cannot deserialize json object to list...as error below
        //Cannot deserialize value of type `java.util.ArrayList<java.lang.Object>`
        // from Object value (token `JsonToken.START_OBJECT`)

    }
}
