package jsonToPOJO;
//vid-59
import com.fasterxml.jackson.core.type.TypeReference;
import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojo.Address;

import java.io.File;
import java.io.IOException;
import java.util.Map;

//TypeReference is a class, and here i am not using Address pojo class, i am just getting the key value
//pairs from .json file......getting dynamic response without creating pojo class

public class updateJsonObjectDynamicPayloadWithoutPojo {
    @Test
    public void mthd() throws IOException {
        ObjectMapper objmaper = new ObjectMapper();

        Map<String,Object> addr = objmaper
                .readValue(new File("C:\\Users\\Nageena\\IdeaProjects\\RestAPIProject\\src\\test\\java\\jacksonTutorials\\address.json"),
                        new TypeReference<Map<String,Object>>() {
                        });

        System.out.println(addr.get("city"));

        addr.put("city","Delhi");
        //we can add new field as well
        addr.put("pin","1234");

        String updatedjson1=objmaper.writerWithDefaultPrettyPrinter().writeValueAsString(addr);

        System.out.println(updatedjson1);

    }
}