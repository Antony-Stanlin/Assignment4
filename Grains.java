import java.math.BigInteger;
import java.util.Scanner;

public class Grains {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Square number: ");
        int n=sc.nextInt();

        System.out.println(BigInteger.valueOf(2).pow(n-1));
        System.out.println(BigInteger.valueOf(2).pow(n).subtract(BigInteger.ONE));

        sc.close();
    }
}
