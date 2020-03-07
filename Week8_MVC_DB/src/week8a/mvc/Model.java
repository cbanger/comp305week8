
package week8a.mvc;

import java.sql.SQLException;
import java.util.List;
import week8a.mvc.model.Person;
import week8a.mvc.model.PersonDAO;

/**
 *
 * @author comp305
 */
public class Model {

    PersonDAO dao;

    public Model() throws SQLException {
        dao = new PersonDAO();
    }


    
    
    List<Person> getPersonList() throws SQLException {
        return dao.findAll();
        
    }
    
}
