package model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;
public class FormRegistration {

    @NotEmpty
    @Size(min = 5,max = 45)
    private String firstname;
    @NotEmpty
    @Size(min=5,max = 45)
    private String lastname;
    @Pattern(regexp = "(^$|[0-9]*$)",message = "invalid.phoneNumber")
    private String phoneNumber;
    @Min(18)
    private int age;
    @Pattern(regexp = "(^[a-z|A-Z|0-9]+[_|.]*[a-z|A-Z|0-9]*@[\\w\\W]+\\.[\\w\\W]+)",message = "invalid.email")
    private String email;

    public FormRegistration(String firstname, String lastname, String phoneNumber, int age, String email) {
        this.firstname = firstname;
        this.lastname = lastname;
        this.phoneNumber = phoneNumber;
        this.age = age;
        this.email = email;
    }

    public FormRegistration() {
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
