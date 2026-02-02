 import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        // start coding here
        String text=scanner.nextLine();
        int l=text.length();
        if(l<=3){
            System.out.println("false");
        }else{
           System.out.println(text.endsWith("burg"));
        }


    }
}