package pojoExamples;
//pojo= plain old java object
import org.junit.jupiter.api.Test;
//vid-47
public class RetargetCompany2 {
    @Test
    public void mthd() {
        Employee2 rahul = new Employee2();


        rahul.setId(10);
        rahul.setDeptId(100);
        rahul.setAddress("KA");
        rahul.setGender("male");
        rahul.setMobNo("12345");

        Employee2 sai = new Employee2();

        sai.setId(20);
        sai.setDeptId(100);
        sai.setAddress("KA");
        sai.setGender("male");
        sai.setMobNo("12345");

        System.out.println(rahul.getId());
        System.out.println(sai.getDeptId());
    }
}
