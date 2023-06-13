package pojoExamples;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;
//vid-48--How to create json payload using POJO
public class DummyAPIForStudent
{
    @Test
    public void mthd()
    {
       Student s1=new Student();

       s1.setAccountNo(111);
       s1.setBalance(204.56);
       s1.setEmail("kschleswigholstein0@123-reg.co.uk");
       s1.setFirst_name("Kent");
       s1.setLast_name("mahadev");
       s1.setGender("male");

       RestAssured
               .given()
               .log()
               .all()
               .body(s1)
               .when()
               .get();

    }
}
