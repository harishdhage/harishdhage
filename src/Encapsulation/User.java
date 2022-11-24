package Encapsulation;

public class User {
    private String firstName, lastName;

    public String getFullName(){
        return firstName+" "+lastName;
    }

    public String getFirstName(){
        return firstName.toUpperCase();
    }

    public void setFirstName(String fName){
        firstName = fName;
    }

    public String getLastName(){
        return lastName.toUpperCase();
    }

    public void setLastName(String lName){
        lastName = lName;
    }
}
