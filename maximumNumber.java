import java.util.Scanner;

public class maximumNumber {

    public static void maxNumber(int n){
        int copy = n;
        int divisor = 1;
        int maxNumber = 0;

        while (n/divisor > 0) {
            int left = n / (divisor * 10);
            int right = n % divisor;

            int subNumber = (left*divisor) + right;

            maxNumber = Math.max(maxNumber, subNumber);

            divisor *= 10;
        }

        System.out.println("Maximum sub number of this number: " + copy + " is: " + maxNumber);
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter a number: ");
        int n = sc.nextInt();
        maxNumber(n);
    }
    
}
