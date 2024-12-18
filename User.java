import java.io.IOException;
import java.time.LocalDate;

public class User {
    private String name;
    private LocalDate dob;

public User(){
    this.name=null;
    this.dob=LocalDate.now();
}

public User(String name,int year,int month,int day) { 
  this.name=name;
  this.dob=LocalDate.of(year,month,day);
 
}

public String getName(){
    return name;
}

public void setname(String name){
    this.name=name;
}

public LocalDate getDob(){
    return dob;
}

public void setdob(String name,int year,int month,int day){
    this.dob=LocalDate.of(year,month,day);    

}

public void displayInfo(){
    System.out.println("Name"+name);
    System.out.println("DAy"+dob);
}


public static void main(String[] args) throws IOException {
    // Create an instance of User
    User john = new User("John", 1954, 2, 18);
    john.displayInfo(); // Display user's info
}

}









