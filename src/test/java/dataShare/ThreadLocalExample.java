package dataShare;

import org.junit.jupiter.api.Test;

public class ThreadLocalExample
{
    @Test
    public void example()
    {
        ThreadLocal counter1=new ThreadLocal();

        counter1.set("Amod");

        String name= (String) counter1.get();

        System.out.println(name);

        counter1.remove();

        System.out.println((String) counter1.get());

        ThreadLocal counter2=ThreadLocal.withInitial(()-> "Mukesh");

        System.out.println((String)counter2.get());

        ThreadLocal<String> counter3=new ThreadLocal<>();

        counter3.set("rahul");
        System.out.println(counter3.get());
    }
}
