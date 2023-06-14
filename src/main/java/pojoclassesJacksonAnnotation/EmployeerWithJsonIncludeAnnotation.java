package pojoclassesJacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonInclude;

import java.util.List;
import java.util.Map;

//vid-60,61,62
// if we dont give the value of Age by using setter method, it will print as zero which means its
// printing defalut value, which we dont want...so here we can avoid it by using @jsoninclude.include.non_default(means
//it does not print the fields which are not assigned anything
// annotation
//@JsonInclude(JsonInclude.Include.NON_DEFAULT)
//@JsonInclude(JsonInclude.Include.NON_NULL)//here if age is zero, json.non_default take it as default value
//and does not print it, but new born baby age is zero, so to avoid it, we use NON_null annotation
@JsonInclude(JsonInclude.Include.NON_EMPTY)//it does not print if the array are empty
public class EmployeerWithJsonIncludeAnnotation
{
    private String name;
    private int age;
    private boolean married;
    private String address;
    private String mobileNo;



    public Map<String, String> getFamilymembers() {
        return familymembers;
    }

    public void setFamilymembers(Map<String, String> familymembers) {
        this.familymembers = familymembers;
    }

    private List<String> skills;
    private Map<String,String> familymembers;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public boolean isMarried() {
        return married;
    }

    public void setMarried(boolean married) {
        this.married = married;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getMobileNo() {
        return mobileNo;
    }

    public void setMobileNo(String mobileNo) {
        this.mobileNo = mobileNo;
    }





}
