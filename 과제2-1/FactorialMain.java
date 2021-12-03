//skeleton 사용안함
import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        getFactorial(number);
        scanner.close();
    }
    private static double getFactorial(final int n){
        if(n > 1) {
            double result = n * getFactorial(n - 1);
            System.out.printf("Factorial of  %d = %.0f\n", n, result);
            return result;
        }
        else if(n == 1){
            System.out.println("Factorial of " + n + " = 1");
            return 1;
        }
        else{
            return -1;
        }
    }
}

/*
//skeleton 살짝 변형해서 사용
import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        for(int i=1; i<=10; i++) {
            System.out.println("Enter a number:");
            int number = scanner.nextInt();
            getFactorial(number);
        }
        scanner.close();
    }
    private static double getFactorial(final int n){
        if(n > 1) {
            double result = n * getFactorial(n - 1);
            System.out.printf("Factorial of  %d = %.0f\n", n, result);
            return result;
        }
        else if(n == 1){
            System.out.println("Factorial of " + n + " = 1");
            return 1;
        }
        else{
            return -1;
        }
    }
}
*/

/*
//skeleton 어거지로 사용
import java.util.Scanner;

public class FactorialMain {
    public static void main(String[] args){
        Scanner scanner = new Scanner(System.in);
        System.out.println("Enter a number:");
        int number = scanner.nextInt();
        for(int i=1; i<=10; i++) {
            System.out.println("Factorial of " + i + " = " + getFactorial(i));
        }
        scanner.close();
    }
    private static long getFactorial(final int n){
        if(n > 1) {
            return n * getFactorial(n - 1);
        }
        else if(n == 1){
            return 1;
        }
        else{
            return -1;
        }
    }
}*/
