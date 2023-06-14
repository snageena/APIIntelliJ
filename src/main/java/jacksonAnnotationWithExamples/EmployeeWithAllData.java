package jacksonAnnotationWithExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojoclassesJacksonAnnotation.EmployeerWithJsonIncludeAnnotation;

import java.util.ArrayList;
import java.util.HashMap;

// if we dont give the value of Age by using setter method, it will print as zero which means its
// printing defalut value, which we dont want...so here we can avoid it by using @jsoninclude annotation

//vid-60

public class EmployeeWithAllData
{
    @Test
    public void test() throws JsonProcessingException {
        EmployeerWithJsonIncludeAnnotation e=new EmployeerWithJsonIncludeAnnotation();
        e.setName("Aaa");
        e.setAge(28);
       e.setAddress("bnglr");
        e.setMarried(true);
        e.setMobileNo("45678");
        e.setFamilymembers(new HashMap<>());
       // e.setSkills(new ArrayList<>());

        ObjectMapper mapper=new ObjectMapper();

        String empJsonFormat=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);

        System.out.println(empJsonFormat);
    }
}
