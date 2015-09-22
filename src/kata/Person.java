/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Calendar;
import java.util.Date;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class Person {

    private final String name;
    private final String surname;
    private final Calendar birthday;
    private static final long MILLISECONDS_PER_YEAR = (long) (1000 * 60 * 60 * 24 * 365.25);

    public Person(String name, String surname, Calendar birthday) {
        this.name = name;
        this.surname = surname;
        this.birthday = birthday;
    }

    public String getName() {
        return name;
    }

    public String getSurnam() {
        return surname;
    }

    public Calendar getBirthday() {
        return birthday;
    }

    public String getFullName() {
        return name + " " + surname;
    }
    public int getAge(){
        Calendar today;
        today= GregorianCalendar.getInstance();
        return (int) miMetodo(today.getTimeInMillis()-birthday.getTimeInMillis());
    }
    public long miMetodo(long millis){
        return millis/MILLISECONDS_PER_YEAR;
    }
}
