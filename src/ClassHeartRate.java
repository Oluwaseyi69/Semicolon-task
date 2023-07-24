import java.time.LocalDate;
import java.time.Month;

public class ClassHeartRate {
    private String firstName;
    private String lastName;
    private LocalDate dateOfBirth;

    public void setFirstName(String firstname){
        this.firstName = firstname;
    }
    public String getFirstName(){
        return firstName;
    }


    public void setLastName(String LastName) {
        this.lastName = LastName;
    }
    public String getLastName(){
        return lastName;
    }
    public void setDateOfBirth(int day, String month, int year){
        dateOfBirth = LocalDate.of(year, Month.valueOf(month.toUpperCase()), day);
    }
    public LocalDate getDateOfBirth(){
        return dateOfBirth;
    }
    public String HeartRate(String firstname, String lastname, int day, String month, int year){
        this.lastName = lastname;
        return lastname;
    }

}
