package week8a.mvc.model;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

/**
 * @author comp305
 */
public class PersonDAO {

      Connection connection;
      String url = "jdbc:mysql://localhost/ravel";
      String user = "comp305";
      String pwd = "comp305";

    public PersonDAO() throws SQLException {        
        connection = DriverManager.getConnection(url, user, pwd); 
    }

      
      
      public List<Person> findAll() throws SQLException
      {
          Statement statement = connection.createStatement();
          String sql = "SELECT * FROM person";
          
          ResultSet results = statement.executeQuery(sql);
          List personList = null;           
          while (results.next())
          {
              Integer personid = results.getInt("personid");
              Person p = new Person(personid);
              p.setName(results.getString("name"));
              p.setJobtitle(results.getString("jobtitle"));
              p.setFrequentflyer(results.getShort("frequentflyer"));
              personList.add(p);   
          }
          return personList;
      }
      
    
}
