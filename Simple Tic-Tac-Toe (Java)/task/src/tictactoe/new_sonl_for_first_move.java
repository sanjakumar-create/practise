package tictactoe;
import java.util.Scanner;
class new_son_for_first_move{
    //function to print the  2 d natirx
    public  static void print(char[][] c){
        //first print the uppe rboundary
        System.out.println("_________");
        for(int i=0;i<3;i++){
            System.out.print("| ");
            for(int j=0;j<3;j++){
                System.out.print(c[i][j]+" ");

            }
            System.out.println("|");
        }
        System.out.println("_________");

    }
    public static void main(String[] args){
        //System.out.println("hiii");
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        char[][] c=new char[3][3];
        //now filling th string to the 2d char matrix
        int index=0;
        for(int i=0;i<3;i++){
            for(int j=0;j<3;j++){
                char ch=s.charAt(index);
                index++;
                if(ch=='_'){//if the char is _ then keep the box there blanks;
                    c[i][j]=' ';
                }
                else {
                    c[i][j]=ch;
                }
            }
        }
        //print the grid
        print(c);
        //now ask the user to enter the column and row and chek the validations
        while (true){
            String val=sc.nextLine();
            //now split it in terms of sapce
            String []lst=val.split(" ");
            //now check for the size of the list such that ask the user to enter the valid number
            if(lst.length>2){
                System.out.println("You should enter numbers!");
                continue;
            }
            int row,col;
            //assigned th row and column from the list
            try{
                row=Integer.parseInt(lst[0]);
                col=Integer.parseInt(lst[1]);
            } catch (NumberFormatException e) {
                System.out.println("You should enter numbers!");
                continue;
            }
            //now check the range
            if(row<1||col>3||row>3||col<1){
                System.out.println("Coordinates should be from 1 to 3");
                continue;
            }
            //now adjust the row and col for the right traversal
            row--;
            col--;
            //now fill the space if it is vacacant if not vacacnt print the info

            if(c[row][col]!=' '){
               System.out.println("This cell is occupied! Choose another one!");
               continue;
            }
             c[row][col]='X';
            break;

        }
        //now print the updated field
        print(c);

    }


}