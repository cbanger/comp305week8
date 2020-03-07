
package week8a.mvc.model;

import java.util.Date;

/**
 *
 * @author comp305
 */
public class Person {
    Integer personid;
    String name;
    String jobtitle;
    Short frequentflyer;
    Date lastupdated;

    public Person(Integer personid) {
        this.personid = personid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getJobtitle() {
        return jobtitle;
    }

    public void setJobtitle(String jobtitle) {
        this.jobtitle = jobtitle;
    }

    public Short getFrequentflyer() {
        return frequentflyer;
    }

    public void setFrequentflyer(Short frequentflyer) {
        this.frequentflyer = frequentflyer;
    }

    public Integer getPersonid() {
        return personid;
    }

    public Date getLastupdated() {
        return lastupdated;
    }

    @Override
    public String toString() {
        return "Person{" + "personid=" + personid + ", name=" + name + ", jobtitle=" + jobtitle + ", frequentflyer=" + frequentflyer + ", lastupdated=" + lastupdated + '}';
    }

    
    
}
