package dataShare;

import java.util.LinkedHashMap;
// vid-44
// here we are creating 2 threads for testmoduleonewithThreadLocalDataMap and testmoduleTwoWithThreadlocaldataMap
//created classes by using below methodology...now even we do paralled testing using classes
// thread1 and thread2 get 2 unique booking id's and they are accesed by respective threads only
// so we dont get issue...while accessing booking id's

public class ThreadLocalDataStoreAsMap
{
    private ThreadLocalDataStoreAsMap()
    {

    };

    private static LinkedHashMap<String,Object> dataMap1= new LinkedHashMap<String,Object>();

    private static ThreadLocal<LinkedHashMap<String,Object>> dataMap=
            ThreadLocal.withInitial(()->new LinkedHashMap<String,Object>());

    public static void setValue(String key,Object value)
    {
        dataMap.get().put(key,value);

    }

    public static Object getValue(String key)
    {
        return dataMap.get().get(key);

    }

}
