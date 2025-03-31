public class FibonacciInRecursion {
public static void main(String[] args) {
int n=20;
System.out.println(fibbonacci(n));    
}   
static int fibbonacci(int n){
    if (n<=1) return n;
    return fibbonacci(n-1)+fibbonacci(n-2);

}
}
