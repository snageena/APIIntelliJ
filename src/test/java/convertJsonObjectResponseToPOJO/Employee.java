package convertJsonObjectResponseToPOJO;
//vid-53
//  {
//    "first_name": "Amod",
//    "last_name": "mahadev",
//    "profession": "Software Engineer",
//    "age":30,
//    "salary": 30.45
//  }
//
public class Employee
{
    private String first_name;
    private String last_name;
    private String profession;
    private int age;

    public String getFirst_name() {
        return first_name;
    }

    public void setFirst_name(String first_name) {
        this.first_name = first_name;
    }

    public String getLast_name() {
        return last_name;
    }

    public void setLast_name(String last_name) {
        this.last_name = last_name;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getSalary() {
        return salary;
    }

    public void setSalary(int salary) {
        this.salary = salary;
    }

    private int salary;

}
