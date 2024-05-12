
package models;


public class UserType {
    int id;
    String name;

    public UserType() {
        
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }
    
    public String toString(){return name;}
}
