package week8a.mvc;

import java.sql.SQLException;
import java.util.List;
import week8a.mvc.model.Person;

/**
 *
 * @author comp305
 */
public class Controller {
    Model model;
    View view;
    
    
    public Controller(Model model, View view) {
        this.model = model;
        this.view = view;
    }
    
    public void run() throws SQLException
    {
            List<Person> personList = model.getPersonList();
            view.display(personList);

    }
}
