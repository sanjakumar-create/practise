import java.util.Scanner;
class Main {
    public static void main(String[] args) {
        // put your code here
        Scanner scanner=new Scanner(System.in);
        int n=scanner.nextInt();
        int []arr=new int[n];
        for(int i=0;i<n;i++) {
            arr[i] = scanner.nextInt();
        };
        int t=scanner.nextInt();
        int sum=0;
        for(int i=0;i<n;i++){
            if(arr[i]>t){
                sum+=arr[i];
            }
        }
        System.out.println(sum);

    }

}