import java.util.Scanner;

public class User {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.println("Please give me your info so I can steal your identity! ");
        
        System.out.println("");
        
        System.out.print("What is your first name?");
        String firstName = input.next();
        
        System.out.print("What is your last name? ");
        String lastName = input.next();
        
        System.out.print("What grade are you in? ");
        int grade = input.nextInt();
        
        System.out.print("What is your student ID?");
        int id = input.nextInt();
        
        System.out.print("What's your username?");
        String user = input.next();
        i
        System.out.print("What's your average in school?");
        double average = input.nextDouble();
        
        System.out.println("");
        
        System.out.println("Hacking ID....");
        
        
        System.out.print("Type password to continue.....");
        String password = input.next();
        
        
        
        System.out.println("");
        
        System.out.println("First Name: " + firstName);
        System.out.println("Last Name: " + lastName);
        System.out.println("Grade: " + grade);
        System.out.println("Student ID: " + id);
        System.out.println("Username: " + user);
        System.out.println("Average in school: " + average);}
}
