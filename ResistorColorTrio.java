import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ResistorColorTrio {
    
    static String color[]={"black","brown","red","orange","yellow","green","blue","violet","grey","white"};
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the colors: ");
        String s=sc.nextLine();
        
        System.out.println(new ResistorColorTrio().value(s));

        
    }

    
    

    String value(String s){

        int count=0;
        long sum=0;
        String result;

        for(String str:split(s)){
            
            if(count==2){
                sum*=(long)Math.pow(10,positon(str));
                break;
            }
            sum=(sum*10)+positon(str);
            count++;
        }
        

        if(sum >= 1000000000){
            result = (sum/1000000000) + " gigaohms";
        }   
        else if(sum >= 1000000) {       
            result = (sum/1000000) + " megaohms";
        }
        else if(sum >= 1000) {
            result = (sum/1000) + " kiloohms";
        }
        else {
            result = sum + " ohms";
        }
        return result;

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
