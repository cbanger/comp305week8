
package week8a;

import java.sql.SQLException;
import week8a.mvc.Controller;
import week8a.mvc.Model;
import week8a.mvc.View;

/**
 *
 * @author comp305
 */
public class Week8a {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        try {
            Controller controller;
            Model model;
            View view;
            model = new Model();
            view = new View();
            controller = new Controller(model,view);
        } catch (SQLException ex) {
            System.out.println(ex.getMessage());
        }
                
        
    }    
}
