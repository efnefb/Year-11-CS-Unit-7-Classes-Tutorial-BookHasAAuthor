public class Author {
    private String name;
    private String email;
    private char gender;

    public Author(String n, String em, char gen){
        name = n;
        email = em;
        gender = gen;
    }

    public String getName(){
        return name;
    }

    public String getEmail(){
        return email;
    }

    public void setEmail(String eml){
        email = eml;
    }

    public char getGender(){
        return gender;
    }

    public String toString(){
        return name +   " (" + gender + ") " + "at " + email;
    }
}
