package responsePkg;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import java.util.Map;
//Vid-39:channel:Retargetcommon

//Body: {
//    "accountNo": 222,
//    "balance": 205.34,
//    "first_name": "clarie",
//    "last_name": "Dennerley",}
//here in above body we have both integers and string values, so first we are receving them as String,Object
//key and value pair but we cannot define(Map<String,Object>.class) like this, so we are using TypeRef abstract class
// and getting the values in the format of Objects and converting them into string or integer based on our flexibility
public class ConvertJsonObjectResponseToJavaMapWithGenerics {
    @Test
    public void testResponseWithGenerics() {
        Map jsonRespAsMap = RestAssured
                .get("https://run.mocky.io/v3/4b3d76b3-544a-4aea-90f5-19cebe9d3cc3")
                .as(new TypeRef<Map<String,Object>>(){});

        int acc_no= (int) jsonRespAsMap.get("accountNo");
        String k= (String) jsonRespAsMap.get("first_name");
        System.out.println("acc no "+acc_no);
        System.out.println(k);
        Map<String,String> skillsMap= (Map<String, String>) jsonRespAsMap.get("skills");

        System.out.println(skillsMap.get("name"));
        System.out.println(skillsMap.get("proficiency"));
    }
}
