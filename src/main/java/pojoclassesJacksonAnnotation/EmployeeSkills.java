package pojoclassesJacksonAnnotation;

import com.fasterxml.jackson.annotation.JsonInclude;
import com.fasterxml.jackson.annotation.JsonIncludeProperties;

//here what values we include those only print in output, others wont come in console window
@JsonIncludeProperties(value={"name","skills"})
public class EmployeeSkills extends EmployeerWithJsonIncludeAnnotation
{
    private String skills;

    public String getSkills() {
        return skills;
    }

    public void setSkills(String skills) {
        this.skills = skills;
    }




}
