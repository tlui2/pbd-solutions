import java.util.Scanner;

public class NameAgeSalary {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        
        System.out.print("Hey, what's your name? ");
        String name = input.next();
        
        System.out.print("Whats your age " +name+ "?  ");
        int age = input.nextInt();
        
        System.out.print("So you're "+ age + " whats your salary " + name +"? ");
        double salary = input.nextDouble();
        
       
        
        System.out.println("Wow you only make " + salary +" thats barely anything!");}
}
