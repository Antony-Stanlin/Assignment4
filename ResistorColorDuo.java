import java.util.*;

public class ResistorColorDuo {
    static String color[]={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the colors: ");
        String s=sc.nextLine();
        
        System.out.println(new ResistorColorDuo().value(s));
        
        System.out.println();
        sc.close();
        

    }

    int value(String s){
        int count=0,sum=0;
        for(String str:split(s)){
            if(count>2)
                break;
            sum=(sum*10)+positon(str);
            count++;
        }
        return sum;

    }

    List<String> split(String s){
        String temp="";
        List<String> list=new ArrayList<>();
        for(int i=0;i<s.length();i++){
            if(s.charAt(i)=='-'){
                list.add(temp);
                temp="";
            }
            else{
                temp+=s.charAt(i);
            }
        }
        list.add(temp);
        return list;
    }

    int positon(String s){
        for(int i=0;i<color.length;i++)
            if(s.equalsIgnoreCase(color[i]))
                return i;

        return -1;
    }
}
