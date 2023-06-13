package convertNestedObjectResponseToPOJO;
//create mock API from https://designer.mocky.io/design/confirmation
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

//{
//    "first_name": "Amod",
//    "last_name": "mahadev",
//    "profession": "Software Engineer",
//    "age":30,
//    "salary": 30.45,
//    "address":
//    {
//      "houseNo": 342,
//      "streetName": "abcstreet",
//      "city": "NY",
//     "Country":"IND"
//    }
//  }
//vid-55
//create mock api using above body

//if we want to only fetch some part of response, not whole response, we can do it by using following code
public class PartOfJsonNestedObjectResponseToPOJO
{
    @Test
    public void mthd()
    {
    //here we converted json object response to pojo class type
        Address add=RestAssured
                .get("https://run.mocky.io/v3/09685ec4-37c0-43d9-b1bc-8c62bf76071e")
                .jsonPath()
                .getObject("address",Address.class);


        System.out.println(add.getCity());
    }
}
