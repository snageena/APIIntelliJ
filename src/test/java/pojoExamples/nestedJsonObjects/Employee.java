package pojoExamples.nestedJsonObjects;
//vid-50
//{
//    "first_name": "Amod",
//    "last_name": "mahadev",
//    "profession": "Software Engineer",
//    "address":{
//      "houseNo": 404,
//      "StreetName": "Not found street",
//      "city":"bnglr",
//      "state": "KA",
//      "country":"ind"
//    }
public class Employee
{
    private String firstName;
    private String lastName;
    private String profession;
    private  Address address;
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getProfession() {
        return profession;
    }

    public void setProfession(String profession) {
        this.profession = profession;
    }

    public Address getAddress() {
        return address;
    }

    public void setAddress(Address address) {
        this.address = address;
    }





}
