package jsonToPOJO;
//vid-58
//object mapper helps to convert json to Pojo and vice versa

import com.fasterxml.jackson.databind.ObjectMapper;
import org.testng.annotations.Test;
import pojo.Address;

import java.io.File;
import java.io.IOException;

public class JsonFileToPojoAddress {

    @Test
    public void mthd() throws IOException {
        ObjectMapper objmaper = new ObjectMapper();

       Address addr= objmaper
                .readValue(new File("C:\\Users\\Nageena\\IdeaProjects\\RestAPIProject\\src\\test\\java\\jacksonTutorials\\address.json"),
                        Address.class);

       System.out.println(addr.getHouseNo());
        System.out.println(addr.getCity());
        addr.setCity("Delhi");

        System.out.println(addr.getCity());

       String updatedjson1=objmaper.writeValueAsString(addr);
        // the value does not change in json file..its just mock json file
       System.out.println(updatedjson1);

       updatedjson1=objmaper.writerWithDefaultPrettyPrinter().writeValueAsString(addr);

       System.out.println(updatedjson1);
    }
}
