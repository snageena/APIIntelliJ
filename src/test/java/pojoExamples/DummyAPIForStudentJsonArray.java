package pojoExamples;

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.List;
//vid-49
//[{
//  "accountNo": 111,
//  "balance": 204.56,
//  "first_name": "Kent",
//  "last_name": "mahadev",
//  "email": "kschleswigholstein0@123-reg.co.uk",
//  "gender": "male"
//},
//{
//  "accountNo": 222,
//  "balance": 24.56,
//  "first_name": "abc",
//  "last_name": "def",
//  "email": "kschleswigholstein0@123-reg.co.uk",
//  "gender": "male"
//}
//]
public class DummyAPIForStudentJsonArray
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


        Student s2=new Student();

        s2.setAccountNo(222);
        s2.setBalance(24.56);
        s2.setEmail("abcdef@123-reg.co.uk");
        s2.setFirst_name("abc");
        s2.setLast_name("def");
        s2.setGender("male");

        List<Student > jsonArrayStudent=new ArrayList<>();
        jsonArrayStudent.add(s1);
        jsonArrayStudent.add(s2);

        RestAssured
                .given()
                .log()
                .all()
                .body(jsonArrayStudent)
                .when()
                .get();

    }
}
