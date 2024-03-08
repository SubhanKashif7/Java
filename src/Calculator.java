import  java.util.Scanner;

public class Calculator {
    public static int sum(int dg1,int dg2){
        return  dg1+dg2;
    }

    public  static  int min(int dg1,int dg2){
        return  dg1-dg2;
    }

    public static int mul(int dg1,int dg2){
        return  dg1*dg2;
    }

    public static int div(int dg1,int dg2){
        if(dg2==0){
            System.out.println("ERROR : DIVISION BY 0");
            return  0;
        }
        return  dg1/dg2;
    }

    public static int mod(int dg1,int dg2){
        if (dg2 == 0) {
            System.out.println("Error: Division by zero");
            return 0; // or throw an exception
        }
        return dg1 % dg2;
    }

    public static int pow(int dg1,int dg2){
        return (int) Math.pow(dg1,dg2);
    }

    public static void main(String[] args) {
        Scanner inp = new Scanner(System.in);
        System.out.println("Welcome to Calculator Enter 1st digit,2nd digit,operationalSign");
        int dg1 = inp.nextInt();
        int dg2 = inp.nextInt();
        String op = inp.next();

        switch(op){
            case "+":
                System.out.println(sum(dg1,dg2));
                break;
            case "-":
                System.out.println(min(dg1,dg2));
                break;
            case "*":
                System.out.println(mul(dg1,dg2));
                break;
            case "/":
                System.out.println(div(dg1,dg2));
                break;
            case "%":
                System.out.println(mod(dg1,dg2));
                break;
            case "^":
                System.out.println(pow(dg1,dg2));
                break;
        }
    }
}
