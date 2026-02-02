
package practise.hellojava;

import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args ){
        System.out.println("Hello Sijay");
       //here i m going to take the input string as text
        Scanner scanner=new Scanner(System.in);
        System.out.println("pelase enter the string :");
         String  str= scanner.nextLine();
         
         int n1=str.length()-2;
         System.out.println(n1);
       if(n1<=100){
           System.out.print("EASY");
       }
   else{
       System.out.println("HARD");
       }



       int n=scanner.nextInt();
        System.out.print("\n");
        int []arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=scanner.nextInt();
            System.out.print(" ");
        }
        int sum=0;
        for(int i=0;i<n;i++){
            sum+=arr[i];
        }
        System.out.println(sum);

    int []arr1={1,2,3,4,5};
    System.out.println("Plesse enter the number to rotate the array: ");
    int nm=scanner.nextInt(),l1=arr1.length;
    int []temp=new int[l1];
    for(int i=0;i<arr1.length;i++){
        temp[i]=arr1[(i+nm)%l1];

    }

    System.out.println(Arrays.toString(temp));


    }
    
}
