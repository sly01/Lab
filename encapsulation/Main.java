/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package encapsulation;

import java.util.ArrayList;

/**
 *
 * @author erkoc
 */
public class Main {

    public static void main(String[] args) {
        Person p1 = new Person("Ahmet", "Erkoc", 22);
        Person p2 = new Person("Fatih", "Ersinadim", 22);   
        Person p3 = new Person("Fehmi", "Erkoc", 13);
        Person p4 = new Person("Mehmet", "Erkoc", 53);
        Person p5 = new Person("Guzin", "Erkoc", 18);
        
        ArrayList person = new ArrayList();
        person.add(p1);
        person.add(p2);
        person.add(p3);
        person.add(p4);
        person.add(p5);
        
        for (Object p : person) {
            System.out.println(p);
        }
    }
}
