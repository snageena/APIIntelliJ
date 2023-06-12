package dataShare;

import java.util.LinkedHashMap;

public class DataStoreAsMap
{
    //i am creating provate constructor here so that no one can create boject for thsi class
    private DataStoreAsMap(){};

    private static LinkedHashMap<String,Object> dataMap=new LinkedHashMap<>();
    public static void setValue(String key,Object value)
    {
        dataMap.put(key,value);

    }

    public static Object getValue(String key)
    {
        return dataMap.get(key);

    }


}
