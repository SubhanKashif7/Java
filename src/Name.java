import java.util.Scanner;
public class Name {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.print("Enter Your Name:  ");
        String name = input.next();
        System.out.println("Hello "+ name);
    }
}
