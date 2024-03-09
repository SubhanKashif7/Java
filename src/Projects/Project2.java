package Projects;
import java.util.Scanner;
public class Project2 extends Project3{
    public static void main(String[] args) {
        int marks = 0;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Subject No");
        marks = input.nextInt();
        System.out.print("Enter Your Total Marks in Total Papers");
        int rmarks = 0;
        int tmarks = input.nextInt();

        for (int i = 0; i < marks; i++) {
            System.out.print("Enter Your Marks "+i+": ");
            int marks1 = input.nextInt();
            rmarks += marks1;

        }
        System.out.println(rmarks/tmarks*100);


    }
}
