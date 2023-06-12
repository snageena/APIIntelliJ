package responsePkg;

import io.restassured.RestAssured;
import io.restassured.common.mapper.TypeRef;
import org.junit.jupiter.api.Test;

import java.util.List;
import java.util.Map;
//vid-40
public class ConvertJsonArrayResponseToList
{
    @Test
    public void test()
    {
        List<Object> allEmployes=RestAssured
                .get("https://run.mocky.io/v3/c9313a01-3659-4574-85d3-49dd76badcbf")
                .as(List.class);

        System.out.println(allEmployes.size());

        Map<String,Object> emp1=(Map<String, Object>) allEmployes.get(0);
        System.out.println(emp1.get("first_name"));
    }
    @Test
    public void test2()
    {
        List<Map<String,Object>> allEmployes= RestAssured
                .get("https://run.mocky.io/v3/c9313a01-3659-4574-85d3-49dd76badcbf")
                //.as(List<Map<String,Object>>.class)--this is not possible directly
                .as(new TypeRef<List<Map<String,Object>>>(){});
        System.out.println(allEmployes.size());

        Map<String,Object> emp1=allEmployes.get(0);

        System.out.println(emp1.get("first_name"));
    }
}
