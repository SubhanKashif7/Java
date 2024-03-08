import  java.util.Scanner;
public class CGPA_CALC {

    public static void out(Object output){
            System.out.println(output);
    }
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        out("Enter Number of Subjects");
        int numSubjects = input.nextInt();

        double totalCredits = 0;
        double totalGradePoints = 0;

        for (int i =1; i<=numSubjects; i++){
            out("Enter Credits for Subject "+i+":");
            int credits = input.nextInt();
            totalCredits += credits;

            out("Enter Grade points for subject"+i+":");
            double gradePoints  = input.nextDouble();
            totalGradePoints += (gradePoints*credits);
        };

        double cgpa = totalGradePoints/totalCredits;

        out("CGPA :  "+cgpa);

        input.close();

    }
}
