import java.util.Scanner;

class GPA {
  public static void main(String[] args) {
    Scanner sc= new Scanner(System.in);
    System.out.println("Enter the Marks you obtained for the 1st Subject : ");
    float marks1= sc.nextFloat();
    System.out.println("Enter the Marks you obtained for the 2st Subject : ");
    float marks2= sc.nextFloat();
    System.out.println("Enter the Marks you obtained for the 3st Subject : ");
    float marks3= sc.nextFloat();
    float sum = marks1+marks2+marks3;
    System.out.println("Total Makrs Obtained is: " + sum);
    float gpa= sum/30;
    System.out.println("The CGPA obtained is : ");
    System.out.println(gpa);
  }
}