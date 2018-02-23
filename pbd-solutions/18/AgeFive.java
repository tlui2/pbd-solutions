import java.util.Scanner;

public class AgeFive {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("What is your name idiot? ");
        String name = input.next();
        
        System.out.print("Hi " +name+ " how old are you? ");
        int age = input.nextInt();
        
      
        
        System.out.println("Did you know that in five years you will be " + (age + 5) +" and five years ago you were " + (age -5));}
}

