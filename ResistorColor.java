import java.util.Scanner;

public class ResistorColor {
    static String color[]={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter ");
        String s=sc.nextLine();
        ResistorColor rc=new ResistorColor();

        int index=rc.contain(s);
        while(index==-1){
            System.out.print("Enter the color properly");
            s=sc.nextLine();
            index=rc.contain(s);
        }
        System.out.println(index);
        sc.close();
        
    }
    int contain(String s){
        for(int i=0;i<color.length;i++){
            if(s.equalsIgnoreCase(color[i])){
                return i;
            }
        }
        return -1;
    }
}
