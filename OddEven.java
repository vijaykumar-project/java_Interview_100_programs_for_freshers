public class OddEven {
static boolean  normal(int n){
   return n%2==0;
}  
static boolean  recursion(int n){
if (n==0)  return true;
if(n==1) return false;
return recursion(n-2);
}
public static void main(String[] args) {
int n=50;
System.out.println(normal(n));
System.out.println(recursion(n));
}
}
