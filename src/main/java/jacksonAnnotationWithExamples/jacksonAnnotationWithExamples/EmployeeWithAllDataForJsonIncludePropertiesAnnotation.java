package jacksonAnnotationWithExamples.jacksonAnnotationWithExamples;
//vid-64
import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojoclassesJacksonAnnotation.EmployeeSkills;
import pojoclassesJacksonAnnotation.EmployeerWithJsonIncludeAnnotationLatest;

import java.util.ArrayList;
import java.util.HashMap;

// if we dont give the value of Age by using setter method, it will print as zero which means its
// printing defalut value, which we dont want...so here we can avoid it by using @jsoninclude annotation

public class EmployeeWithAllDataForJsonIncludePropertiesAnnotation
{
    @Test
    public void test() throws JsonProcessingException
    {

        EmployeeSkills e=new EmployeeSkills();
        e.setName("Aaa");
        e.setAge(28);
       e.setAddress("bnglr");
        e.setMarried(false);
        //e.setMobileNo("45678");
        e.setFamilymembers(new HashMap<>());


        ObjectMapper mapper=new ObjectMapper();

        String empJsonFormat=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);

        System.out.println(empJsonFormat);
    }
}
