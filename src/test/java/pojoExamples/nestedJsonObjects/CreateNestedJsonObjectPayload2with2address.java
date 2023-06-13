package pojoExamples.nestedJsonObjects;
//vid-51
import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;

//{
//    "first_name": "Amod",
//    "last_name": "mahadev",
//    "profession": "Software Engineer",
//    "address":[{
//      "houseNo": 404,
//      "StreetName": "Not found street",
//      "city":"bnglr",
//      "state": "KA",
//      "country":"ind"
//    },
//      {
//      "houseNo": 424,
//      "StreetName": " found street",
//      "city":"bnglrrr",
//      "state": "KAA",
//      "country":"ind"}
//    ]
//  }
public class CreateNestedJsonObjectPayload2with2address {

    @Test
    public void methd()
    {
        Employee2 e1=new Employee2();

        e1.setFirstName("Amod");
        e1.setLastName("raja");
        e1.setProfession("software");

        Address addr=new Address();
        addr.setHouseNo(43/5);
        addr.setStreetName("rahstreet");
        addr.setCity("bnglr");
        addr.setCountry("IND");
        addr.setState("KA");

        Address addr2=new Address();
        addr2.setHouseNo(43/2);
        addr2.setStreetName("street2");
        addr2.setCity("bnglrrr");
        addr2.setCountry("IND");
        addr2.setState("KAaa");

        List<Address> allAddresses=new ArrayList<>();

        allAddresses.add(addr);
        allAddresses.add(addr2);

        e1.setAddress(allAddresses);

        RestAssured.given().log().all().contentType(ContentType.JSON).body(e1).post();



    }
}
