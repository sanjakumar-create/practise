import java.util.Scanner;

class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        // start coding here
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++){
       arr[i]=scanner.nextInt();
        }
        //now find the value of the sum of the given data
        int sum=0;
        for(int i=0;i<n;i++){
           if(arr[i]%6==0){
               sum+=arr[i];
           }
        }
        System.out.println(sum);

    }
}