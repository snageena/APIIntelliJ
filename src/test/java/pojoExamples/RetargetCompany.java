package pojoExamples;

import org.junit.jupiter.api.Test;
//vid-47
public class RetargetCompany {
    @Test
    public void mthd() {
        Employee rahul = new Employee();

        rahul.id = 10;
        rahul.deptId=100;
        rahul.address="KA";
        rahul.gender="male";
        rahul.mobNo="12345";

        Employee sai = new Employee();

        sai.id = 20;
        sai.deptId=100;
        sai.address="TA";
        sai.gender="male";
        sai.mobNo="12345";

        System.out.println(rahul.id);
        System.out.println(sai.id);
    }
}