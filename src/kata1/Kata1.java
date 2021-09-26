package kata1;

import java.util.Calendar;
import java.util.GregorianCalendar;

public class Kata1 {

    public static void main(String[] args) {
        Calendar date;
        date = GregorianCalendar.getInstance();
        date.set(1997, 8, 6);
        Person p = new Person("Oliver", date);
        System.out.println(p.getName()+ " tiene "+ p.getAge());
    }
    
}
