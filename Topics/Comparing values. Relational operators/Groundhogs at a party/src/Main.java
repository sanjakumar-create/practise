import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // put your code here
        // You can use scanner.nextBoolean() to read a boolean value
        int peanut=scanner.nextInt();
        boolean wd=scanner.nextBoolean();
        boolean succesparty;
        if(wd){
                succesparty=peanut>=15 && peanut<=25;

        }else{
            succesparty=peanut>=10 && peanut<=20;
        }
        System.out.println(succesparty);
    }
}