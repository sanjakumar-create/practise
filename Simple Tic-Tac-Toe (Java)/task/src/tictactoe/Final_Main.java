package tictactoe;
import java.util.Scanner;
public class Final_Main {
    public static void main(String[] args) {
        // write your code here
        //System.out.println("hii Sanjay");

        //startignt the code first we calculate the count of both
        //x and O
        //case for all the case
        //if diff of x and o is greatn than 1 than it is impossible
        //we have to check for the eight  cases in all the direction
        //row wise coln and diagonal wise
        //no winner and no empty cell that means the draw

        //no winner and still present th empty cell that means game not finished
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        //now print the grid in the form the default
        System.out.println("---------");
        for (int i = 0; i < s.length(); i += 3) {
            System.out.print("| ");
            System.out.print(s.charAt(i) + " " + s.charAt(i + 1) + " " + s.charAt(i + 2) + " ");
            System.out.println('|');
        }
        System.out.println("---------");
        int x_count = 0, o_count = 0;
        for (int i = 0; i < s.length(); i++) {
            if (s.charAt(i) == 'X') {
                x_count++;
            } else if (s.charAt(i) == 'O') {

                o_count++;
            }
        }

        //System.out.println(x_count + " " + o_count);
        boolean x_win = false;
        boolean o_win = false;
        //now check for the eight cases

        //horozontal
        //1st line
        if (s.charAt(0) == s.charAt(1) && s.charAt(1) == s.charAt(2) && s.charAt(0)!='_') {
              if(s.charAt(0)=='X'){
                  x_win=true;
              } else  {
                  o_win=true;
              }
        }
        //2ndline
        if(s.charAt(3)==s.charAt(4)&& s.charAt(4)==s.charAt(5) && s.charAt(3)!='_'){
            if(s.charAt(3)=='X') x_win=true;
            else o_win=true;
        }
        //3rd line
        if(s.charAt(6)==s.charAt(7) && s.charAt(7)==s.charAt(8) && s.charAt(6)!='_'){
            if(s.charAt(6)=='X') x_win=true;
            else o_win=true;
        }
    //  vertical way we have to calculate the each column
    //first columen
    if(s.charAt(0)== s.charAt(3) && s.charAt(3) == s.charAt(6) && s.charAt(0)!='_'){
        if(s.charAt(0)=='X')x_win=true;
        else o_win=true;
    }
        //2nd column
        if(s.charAt(1)==s.charAt(4) && s.charAt(4)==s.charAt(7) && s.charAt(1)!='_'){
            if(s.charAt(1)=='X')x_win=true;
            else o_win=true;
        }
        //3rd column
        if(s.charAt(2)==s.charAt(5) && s.charAt(5)==s.charAt(8) && s.charAt(2)!='_'){
            if(s.charAt(2)=='X')x_win=true;
            else o_win=true;
        }
        //now checking for the diagonal cases
        //1st  diagonal case
        if(s.charAt(0)==s.charAt(4) && s.charAt(4)==s.charAt(8)&& s.charAt(0)!='_'){
            if(s.charAt(0)=='X') x_win=true;
            else o_win=true;
        }
        //2nd diagonal case
        if(s.charAt(2)==s.charAt(4)&&s.charAt(4)==s.charAt(6)&&s.charAt(2)!='_'){
            if(s.charAt(2)=='X')x_win=true;
            else o_win=true;
        }

        //now chek for all the cases
        if(Math.abs(o_count-x_count)>1 || x_win&&o_win){
            System.out.println("Impossible");
        } else if (x_win) {
            System.out.println("X wins");
        } else if (o_win) {
            System.out.println("O wins");
        }
        else if(s.contains("_")){
               System.out.println("Game not finished");
        }
        else {
            System.out.println("Draw");
        }

    }
}
