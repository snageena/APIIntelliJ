package airlines;

//vid-37

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.*;
//json body in online editor
//[
//  {
//    "id": 1,
//    "first_name": "Kent",
//    "last_name": "Schleswig-Holstein",
//    "email": "kschleswigholstein0@123-reg.co.uk",
//    "gender": "Male",
//    "mobile": [
//      "1234567892",
//      "2345678921"
//    ],
//    "skills": {
//      "name": "Testing",
//      "profiecency": "Medium"
//    }
//  },
//  {
//    "id": 2,
//    "first_name": "Maiga",
//    "last_name": "Ragbourne",
//    "email": "mragbourne1@umich.edu",
//    "gender": "Female",
//    "skills": [
//      {
//        "name": "Testing",
//        "profiecency": "Medium"
//      },
//      {
//        "name": "java",
//        "profiecency": "Medium",
//        "certifications": [
//          "certification_One",
//          "certification_two"
//        ]
//      }
//    ]
//  }
//]
public class createComplexPayloadUsingMapList
{
    @Test
    public void test()
    {
        List<Map<String,Object>> finalPayload=new ArrayList<Map<String,Object>>();

        Map<String,Object> firstjsonObject=new LinkedHashMap<String,Object>();

        firstjsonObject.put("id",1);
        firstjsonObject.put("first_name","Kent");
        firstjsonObject.put("last_name","Schleswig-Holstein");
        firstjsonObject.put("email","kschleswigholstein0@123-reg.co.uk");
        firstjsonObject.put("gender","Male");

//        List<String> mobileNo=new ArrayList<>();
//        mobileNo.add("1234567892");
//        mobileNo.add("2345678921");

        List<String> mobileNo= Arrays.asList("1234567892","2345678921");

        firstjsonObject.put("mobile",mobileNo);

        Map<String,Object> skillSet1=new LinkedHashMap<String,Object>();
        skillSet1.put("name","Testing");
        skillSet1.put("profiecency","Medium");

        firstjsonObject.put("skills",skillSet1);

        finalPayload.add(firstjsonObject);

       // RestAssured.given().log().all().body(finalPayload).get();

        Map<String,Object> secondjsonObject=new LinkedHashMap<String,Object>();

        secondjsonObject.put("id",2);
        secondjsonObject.put("first_name","Maiga");
        secondjsonObject.put("last_name","Ragbourne");
        secondjsonObject.put("email","mragbourne1@umich.edu");
        secondjsonObject.put("gender","Female");

        List<Map<String,Object>> skillsList=new ArrayList<>();

        skillsList.add(skillSet1);

        Map<String,Object> javaSkill=new LinkedHashMap<>();

        javaSkill.put("name","java");
        javaSkill.put("profiecency","Medium");

       List<String> allCertifications= Arrays.asList("certification_One","certification_two");

       javaSkill.put("certifications",allCertifications);

       skillsList.add(javaSkill);

       secondjsonObject.put("skills",skillsList);
       finalPayload.add(secondjsonObject);



        RestAssured.given().log().all().body(finalPayload).get();



    }
}
