import java.util.Scanner;

public class KindergartenGarden {

    public static void main(String ar[]){


        String patternString1="VRCGVVRVCGGCCGVRGCVCGCGV";
        String patternString2="VRCCCGCRRGVCGCRVVCVGCGCV";

        String a[]={"Alice","Bob","Charlie","David","Eve","Fred","Ginny","Harriet","Ileana","Joseph","Kincaid","Larry"};

        Scanner sc=new Scanner(System.in);
        KindergartenGarden kg=new KindergartenGarden();

        //user input
        System.out.print("Enter the name: ");
        String find=sc.nextLine();

        int index=kg.contain(a,find);

        while(index==-1){
            System.out.print("Enter the name properly: ");
            find=sc.nextLine();
            index=kg.contain(a,find);
        }
        index*=2;

        System.out.print(kg.match(patternString1.charAt(index))+","+kg.match(patternString1.charAt(index+1))+",");
        System.out.println(kg.match(patternString2.charAt(index))+","+kg.match(patternString2.charAt(index+1)));


        sc.close();
    }

    int contain(String a[],String s){

        for(int i=0;i<a.length;i++)
            if(a[i].equalsIgnoreCase(s))
                return i;
        return -1;
    }

    String match(char c){
        switch(c){
            case 'V':
                return "Violets";
            case 'R':
                return "Radish";
            case 'C':
                return "Clover";

        }
        return "Grass";
    }
}
