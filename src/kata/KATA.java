/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package kata;

import java.util.Calendar;
import java.util.GregorianCalendar;

/**
 *
 * @author usuario
 */
public class KATA {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola Mundo");
        Person p1;

        //Date fecha;
        //fecha = new Date(64, 7, 3);
        Calendar fecha;
        fecha = GregorianCalendar.getInstance();
        fecha.set(1964, 7, 3);
        p1 = new Person("Enrique", "Ramon", fecha);

        System.out.println(p1.getFullName());
        System.out.println(p1.getBirthday().getTime());
        System.out.println("Edad : " + p1.getAge());

        System.out.println("Fin");
    }
}
