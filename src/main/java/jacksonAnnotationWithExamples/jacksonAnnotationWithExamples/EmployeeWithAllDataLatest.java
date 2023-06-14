package jacksonAnnotationWithExamples.jacksonAnnotationWithExamples;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojoclassesJacksonAnnotation.EmployeerWithJsonIncludeAnnotationLatest;

import java.util.ArrayList;
import java.util.HashMap;

// if we dont give the value of Age by using setter method, it will print as zero which means its
// printing defalut value, which we dont want...so here we can avoid it by using @jsoninclude annotation

//vid-60
//vid-63
public class EmployeeWithAllDataLatest
{
    @Test
    public void test() throws JsonProcessingException {
        EmployeerWithJsonIncludeAnnotationLatest e=new EmployeerWithJsonIncludeAnnotationLatest();
        e.setName("Aaa");
        e.setAge(28);
       e.setAddress("bnglr");
        e.setMarried(false);
        //e.setMobileNo("45678");
        e.setFamilymembers(new HashMap<>());
        e.setSkills(new ArrayList<>());

        ObjectMapper mapper=new ObjectMapper();

        String empJsonFormat=mapper.writerWithDefaultPrettyPrinter().writeValueAsString(e);

        System.out.println(empJsonFormat);
    }
}
