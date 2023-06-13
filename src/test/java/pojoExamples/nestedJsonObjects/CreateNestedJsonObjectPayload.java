package pojoExamples.nestedJsonObjects;
//vid-50
import io.restassured.RestAssured;
import org.apache.commons.math3.analysis.function.Add;
import org.junit.jupiter.api.Test;

public class CreateNestedJsonObjectPayload {

    @Test
    public void methd()
    {
        Employee e1=new Employee();

        e1.setFirstName("Amod");
        e1.setLastName("raja");
        e1.setProfession("software");

        Address addr=new Address();
        addr.setHouseNo(43/5);
        addr.setStreetName("rahstreet");
        addr.setCity("bnglr");
        addr.setCountry("IND");
        addr.setState("KA");

        e1.setAddress(addr);

        RestAssured.given().log().all()
                .body(e1)
                .post();
    }
}
