package Projects;
import java.util.Scanner;
public class Project1 {
    static void calc(int sub,int total){
        double res = (double) sub/total*100;
        System.out.println(res);
    };

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Enter FUll marks and Marks Obtained");
        int fullMarks = inp.nextInt();
        int marksObtained = inp.nextInt();

        calc(marksObtained,fullMarks);


    };
};
