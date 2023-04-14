import java.util.Scanner; 

public class cap{
    Scanner input = new Scanner(System.in);

    private String firstname;
    private String lastname;
    private String course; 
    private int yearlevel; 

    public cap(String firstname, String lastname, String course){
        this.firstname = firstname; 
        this.lastname = lastname; 
        this.course = course; 
        this.yearlevel = yearlevel;
    }

    public String getFirstname(){
        return firstname; 
    }

    public String getLastname(){
        return lastname;
    }
    public String getCourse(){
        return course;
    }

    public void ifCourse(){
        if(getCourse().equals("BSIT")|| getCourse().equals("bsit")){
            System.out.print("Enter year level: "); 
            this.yearlevel =input.nextInt();
            ifyear();
        }
        else{
            System.out.print("Invalid course"); 
        }
    }

    public void ifyear(){
        if(this.yearlevel == 1){
            System.out.println("*STUDENT INFORMATION*"); 
            System.out.println("Your name is "+getFirstname().toUpperCase()+" "+getLastname().toUpperCase()); 
            System.out.println("You are "+getCourse()+ " "+this.yearlevel); 
        }else{
            System.out.print("Invaid year level"); 
        }
    }

}