package convertJsonObjectResponseToPOJO;
//create mock API from https://designer.mocky.io/design/confirmation
import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

//vid-53
public class JsonObjectResponseToPOJO
{
    @Test
    public void mthd()
    {
    //here we converted json object response to pojo class type
        Employee emp=RestAssured.given().log().all()
                .get("https://run.mocky.io/v3/a177a7fd-700e-49f5-ad79-aed58da8e5f5")
                .as(Employee.class);

        int age= emp.getAge();

        System.out.println("age");
    }
}
