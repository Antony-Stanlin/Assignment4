import java.util.Scanner;

public class RnaTranscription {
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);

        System.out.print("Enter the DNA: ");
        String dna=sc.nextLine();

        System.out.println(dnaToRna(dna));
        
        sc.close();

    }

    public static String dnaToRna(String dna){

        String rna="";

        for(char c:dna.toCharArray()){
            switch (c) {
                case 'G':
                    rna+="C";
                    break;
                case 'C':
                    rna+="G";
                    break;
                case 'A':
                    rna+="U";
                    break;

                case 'T':
                    rna+="A";
                    break;
            
                default:
                    break;
            }
        }
        return rna;
    }
}
