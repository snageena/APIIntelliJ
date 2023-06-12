package airlines;
//[
//  {
//    "id": 1,
//    "first_name": "Kent",
//    "last_name": "Schleswig-Holstein",
//    "email": "kschleswigholstein0@123-reg.co.uk",
//    "gender": "Male",
//    "ip_address": "138.216.242.245"
//  }
//]

import io.restassured.RestAssured;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
//vid-36
//https://www.mockaroo.com/---to generate simple api body from this website
public class JsonArrayPayloadUsingJavaList
{
    @Test
    public void test()
    {
        Map<String,Object> empdetails= new LinkedHashMap<>();
        empdetails.put("id",1);
        empdetails.put("first_name","Kent");
        empdetails.put("last_name","Schleswig-Holstein");
        empdetails.put("email","kschleswigholstein0@123-reg.co.uk");
        empdetails.put("gender","Male");

        Map<String,Object> empdetails2= new LinkedHashMap<>();
        empdetails2.put("id",2);
        empdetails2.put("first_name","Maiga");
        empdetails2.put("last_name","Ragbourne");
        empdetails2.put("email","mragbourne1@umich.edu");
        empdetails2.put("gender","Female");


        List<Map<String,Object> >allemp=new ArrayList<>();
        allemp.add(empdetails);
        allemp.add(empdetails2);
        RestAssured.given().log().all().body(allemp).get();




    }
}
