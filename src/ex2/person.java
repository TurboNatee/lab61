package ex2;

public class person {
    String firstname, lastname;
    public person(){
        this("no name", "no lastname");
    }
    public person(String firstname, String lastname){
        setname(firstname, lastname);
    }
    public void setname(String firstname, String lastname){
        setFirstname(firstname);
        setLastname(lastname);
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    @Override
    public String toString() {
        return "person{" +
                "firstname='" + getFirstname() + '\'' +
                ", lastname='" + getLastname() + '\'' +
                '}';
    }
}
