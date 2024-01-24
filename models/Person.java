package models;

public abstract class Person {
    
    // Attributes
    private String name;
    private final String role;
    private int password;
    private static int count = 0;

    // Constructor
    public Person(String name, String role, int password){
        this.name = name;
        this.role = role;
        this.password = password;
        count++;
    }

    // Setters
    public void setName(String name){
        this.name=name;    
    }

    public void setPass(int password){
        this.password=password;
    }

    // Getters
    public String getName(){
        return name;
    }

    public String getRole() {
        return role;
    }

    public int getPass(){
        return password;
    }

    public int getNoOfUsers(){
        return count;
    }

    // Methods 
    public void login(int id, int pass){
        // Implementation
    }

}
