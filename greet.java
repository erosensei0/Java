import java.util.Scanner;

public class greet {
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        System.out.println("Please, Enter Your Name:");

        String Name= sc.nextLine();
        System.out.println("Hello " + Name + ", How are you?");


    
}
}