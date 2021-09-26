package kata1;

import java.time.LocalDate;
import java.time.Period;



public class Person {
    private final String name;
    private final String birthdate;

    public Person(String name, String birthdate) {
        this.name = name;
        this.birthdate = birthdate;
    }

    public String getName() {
        return name;
    }

    public String getBirthdate() {
        return birthdate;
    }
    
    public int getAge(){
        return Period.between(LocalDate.parse(birthdate),LocalDate.now()).getYears();
    }
}

