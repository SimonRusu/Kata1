package kata1;

import java.util.Date;

public class Kata1 {

    public static void main(String[] args) {
        Person p = new Person("Oliver", new Date(97, 5, 8));
        System.out.println(p.getName()+ " tiene "+ p.getAge());
    }
    
}
