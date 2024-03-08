import javax.print.DocFlavor;
import java.util.Scanner;
public class PracticeNeew {


    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Name , Roll No , Marks , Grade");

        String name = sc.nextLine();
        int rollNo = sc.nextInt();
        int marks = sc.nextInt();
        String grade = sc.nextLine();


        System.out.println("the name is "+name+"the roll-no is"+rollNo+"the marks are"+marks+"the grade is"+grade);

    }
}
