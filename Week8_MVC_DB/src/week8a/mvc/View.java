
package week8a.mvc;

import java.util.List;
import week8a.mvc.model.Person;

/**
 *
 * @author comp305
 */
public class View {

    void display(List<Person> personList) {
        
        for (Person person : personList) {
            System.out.println(person);
        }
        
    }
    
}
