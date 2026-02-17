package tictactoe;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // write your code here
        //System.out.println("X O X");
        //System.out.println("O X O");
        //System.out.println("X O X");
        Scanner sc=new Scanner(System.in);
        //String s= sc.nextLine();
        String text=sc.nextLine();//take full string as input

        System.out.println("---------");
        for(int i=0;i<9;i+=3){
            System.out.print("| ");
            System.out.print(text.charAt(i)+" "+text.charAt(i+1)+" "+text.charAt(i+2)+ " ");
            System.out.println("|");

        }
        System.out.println("---------");





    }
}
