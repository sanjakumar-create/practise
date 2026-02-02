import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        //System.out.print("\n");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            //System.out.print(" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);
    }
}