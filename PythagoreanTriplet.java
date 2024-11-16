import java.util.Scanner;

public class PythagoreanTriplet {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter a number: ");
        int num=sc.nextInt();
        for(int b=2;b<num;b++){
            for (int a = 1; a < b; a++) {
                if(a+b+(num-a-b)==num && (a*a+b*b==(num-a-b)*(num-a-b))){
                    System.out.println(a+" "+b+" "+(num-a-b));
                }
            }
        }

        sc.close();
    }
}
