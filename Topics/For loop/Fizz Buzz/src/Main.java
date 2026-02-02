import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        //first take the input of the interval as starting and the end the point
        int a=scanner.nextInt();
        int b=scanner.nextInt();
        //String str;
        for(int i=a;i<=b;i++){
            if(i%3==0 && i%5==0) {
                System.out.println("FizzBuzz");
            } else if (i%5==0) {
                System.out.println("Buzz");
            } else if (i%3==0){
                System.out.println("Fizz");
                }
                else{
                    System.out.println(i);
                }
            }
        }
    }
