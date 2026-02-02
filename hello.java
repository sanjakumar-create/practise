package practise.hellojava;



class Animal{
void bark(){
    System.out.println("The Animal is barking ");
}
void run(){
    System.out.println("The Animal is Running :");
}


}

class dog extends Animal{
    @Override void bark(){
        super.bark();
         //bark method from the base method is overriden here
         //adding the one more method
        
        System.out.println("hii this is the dog move method ");
         
    }


    void eat(){
        System.out.println("Hii this is method is responsible for the dog eating process");
    }
}


public class hello {

   void show(int n1){
         System.out.println("our first number is " +n1);
   }
void show(int n1,int n2){
    System.out.println("our two numebr is : " +  n1  + "  second number is : " +n2);
}

void show (int a,char b){
    System.out.println("This is a method overloading based on the basis of char int and character");
}
void show(char a,char b){
    System.out.println("This is the method overloading based on the  parameter type");
}

//now i am going to make method on the basis of the static method
//static method is like when if a method is static then we need not the make the object of that method we can call it by without making the object of that method



static void show(double a,double b){
    System.out.println("This is the show method based on the double parameter and  we can call it without making its object ");

}

// now i m going to make the operator overloading by just trying  learn it 
void add(int a,int b){
    int sum=a+b;
    System.out.println("So here is sum of two number is :" +sum);

}
void add(String a,String b){
    String con_str=a+b;
    System.out.println("our concated string is :"  +  con_str);

}





 



@SuppressWarnings("static-access")
public static void main(String args[]){

System.out.println("Hii ,Sanjay");

System.out.println(3+10);
System.out.println("1000");
int num1=10;
int num2=20;
int num3=num1+num2-3;
System.out.println(num1+num2);
System.out.println(num3);
byte b=122;
float f=2;
System.out.println(b);
System.out.println(f);




hello o = new hello();
o.show(3);
o.show(3,45);
o.show('c','d');
o.show(4,'v');
o.show(2.0,3.0);
o.add(100, 30);
o.add("sanjay ","Kumar");


//making the object of the class
dog s =new dog();
Animal t= new Animal();
s.bark();
s.eat();
s.run();
s.bark();
t.bark();

}


}
