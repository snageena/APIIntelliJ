package convertNestedObjectResponseToPOJO;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import java.util.List;

//vid-57
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
public class ConvertSimpleJsonArrayResponseToPOJOUsingList
{
    @Test
    public void test()
    {
        List<Address> addr=RestAssured
                .get("https://run.mocky.io/v3/c8cf124c-647b-4414-a402-89c7a92b01cd")
                .as(new TypeRef<List<Address>>(){});

        System.out.println("No of addreses "+addr.size());
        System.out.println(addr.get(0).getCity());
        System.out.println(addr.get(1).getCity());

    }
}
