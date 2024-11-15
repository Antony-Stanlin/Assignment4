import java.util.Scanner;

public class BottleSong {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the Start Bottle: ");
        int startBottle=sc.nextInt();

        System.out.print("Enter the Bottle Down: ");
        int bottleDown=sc.nextInt();

        String song="";

        for(int i=0;i<bottleDown;i++)
            song+=singSong(startBottle-i,startBottle-1-i);
        
        System.out.println(song);
        sc.close();
    }

    /**
     * @param startBottle
     * @param bottleDown
     * @return song
     */
    public static String singSong(int startBottle,int bottleDown){
        String number[]={"One","Two","Three","Four","Five","Six","Seven","Eight","Nine","Ten"};

        if(startBottle==1)
            return """
                %s green bottles hanging on the wall,
                %s green bottles hanging on the wall,
                And if one green bottle should accidentally fall,
                There'll be no green bottles hanging on the wall.
    
            """.formatted(number[startBottle-1], number[startBottle-1]);

        return """
        %s green bottles hanging on the wall,
        %s green bottles hanging on the wall,
        And if one green bottle should accidentally fall,
        There'll be %s green bottles hanging on the wall.

    """.formatted(number[startBottle-1], number[startBottle-1],number[bottleDown-1]);
    }
}
