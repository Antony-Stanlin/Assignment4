import java.util.Scanner;

public class RainDrops {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the number: ");
        int n=sc.nextInt();

        System.out.println(convertToSound(n));

        sc.close();
    }

    /**
     * @param n
     * @return Drop's sound
     */
    public static String convertToSound(int n){
        String sound="";

        if(n%3==0)
            sound+="Pling";
        
        if(n%5==0)
            sound+="Plang";

        if(n%7==0)
            sound+="Plong";

        if(sound.length()==1)
            return String.valueOf(n);
        
        return sound;
    }
}
