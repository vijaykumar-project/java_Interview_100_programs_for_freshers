public class methodOverloading {
 void m1(){
    System.out.println("i don't have anything");
 }   
 void m1(int a){
    System.out.println("i have int a "+a);
 }
 void m1(int a ,int b){
    System.out.println("i have in a "+a+" and int b "+b);
 }

 public static void main(String[] args) {
    methodOverloading mO=new methodOverloading();
    mO.m1();
    mO.m1(0);
    mO.m1(1, 2);
 }
}
