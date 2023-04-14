import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        String firstname; 
        String lastname; 
        String course; 

        System.out.print("Enter First name: "); 
        firstname = input.next(); 

        System.out.print("Enter last name: "); 
        lastname = input.next(); 

        System.out.print("Enter course: "); 
        course = input.next(); 

        cap j1 = new cap(firstname, lastname, course); 

        j1.ifCourse();
    }
}
