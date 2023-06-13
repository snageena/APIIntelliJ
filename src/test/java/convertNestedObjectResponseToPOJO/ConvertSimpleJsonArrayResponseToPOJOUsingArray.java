package convertNestedObjectResponseToPOJO;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
//vid-56
//[
//   {
//      "houseNo": 342,
//      "streetName": "abcstreet",
//      "city": "NY",
//     "country":"IND",
//      "state":"NAA"
//    },
// {
//      "houseNo": 343,
//      "streetName": "street3",
//      "city": "NY2",
//     "country":"IND",
//      "state":"NAA2"
//    }
//]
public class ConvertSimpleJsonArrayResponseToPOJOUsingArray
{
    @Test
    public void test()
    {
        Address add[]=RestAssured
                .get("https://run.mocky.io/v3/c8cf124c-647b-4414-a402-89c7a92b01cd")
                .as(Address[].class);

        System.out.println("No of addreses "+add.length);
        System.out.println(add[0].getCity());
        System.out.println(add[1].getCity());

    }
}
