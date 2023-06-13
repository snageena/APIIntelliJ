package convertNestedObjectResponseToPOJO;
//create mock API from https://designer.mocky.io/design/confirmation
import convertJsonObjectResponseToPOJO.Employee;
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
//vid-54
//create mock api using above body
public class JsonNestedObjectResponseToPOJO
{
    @Test
    public void mthd()
    {
    //here we converted json object response to pojo class type
        EmployeeWithAddress emp=RestAssured
                .get("https://run.mocky.io/v3/09685ec4-37c0-43d9-b1bc-8c62bf76071e")
                .as(EmployeeWithAddress.class);

        Address addr= emp.getAddress();


        int age= emp.getAge();
        System.out.println(age);
        System.out.println(addr.getStreetName());
    }
}
