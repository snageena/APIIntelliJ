package airlines;

import org.junit.jupiter.api.Test;

import java.util.HashMap;
import java.util.Map;

public class PayLoads
{
    @Test
        public static String getCreateAirlinePayloadfromString(String id,String name,String country,String logo,
                                                     String slogan,String head_quarters,String website,String established)
        {
        String payload =
                "{\n" +
                        "    \"id\": "+id+",\n" +
                        "    \"name\": \""+name+"\",\n" +
                        "    \"country\": \""+country+"\",\n" +
                        "    \"logo\": \""+logo+"\",\n" +
                        "    \"slogan\": \""+slogan+"\",\n" +
                        "    \"head_quaters\": \""+head_quarters+"\",\n" +
                        "    \"website\": \""+website+"\",\n" +
                        "    \"established\": \""+established+"\"\n" +
                        "}";
        return payload;
        }
        public static Map<String, Object> getCreateAirlinePayloadfromMap(String id,String name,String country,String logo,
                                                                         String slogan,String head_quarters,String website,String established)
        {
            Map<String, Object> payload=new HashMap<>();
            payload.put("id",id);
            payload.put("name",name);
            payload.put("country",country);
            payload.put("logo",logo);
            payload.put("slogan",slogan);
            payload.put("head_quarters",head_quarters);
            payload.put("website",website);
            payload.put("established",established);

            return payload;
        }
        
        
}
