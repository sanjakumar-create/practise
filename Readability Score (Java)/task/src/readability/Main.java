package readability;
import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String text = sc.nextLine();//taking the sentence as input
        //now split the sentence on the basis of .!and ?;
        String[] sentence = text.split("[.!?]");
        //now count the sentence and the words
        int countsentence = 0, countword = 0;
        for (String s : sentence) {
            s = s.trim();//remove the extra spaces;
            if (!s.equals("")) {//ignore empty parts
                String[] words = s.split(" ");
                countword += words.length;
                countsentence++;

            }


        }
        double average=(double)countword/countsentence;
        if(average>10){
            System.out.println("HARD");
        }else{
            System.out.println("EASY");
        }


    }
}
