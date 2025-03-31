public class SumOfPrimeFactor {
 public static void main(String[] args) {
    int n=45;
    int sum=0;
        while (n%2==0) {
            sum+=2;
            n/=2;
        }
   for (int i=3;i*i<=n;i+=2) {
    while (n % i ==0) {
        sum+=i;
        n/=i;
    }  
   }
    if (n > 2) {
        sum+=n;
    }
System.out.println(sum);
 }   
}
