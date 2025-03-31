public class SumOfEvenOddSqrt {
    public static void main(String[] args) {
        int n=5;
        SqrtEvenOddLoop(n);
    }
static void SqrtEvenOddLoop(int n){
long evenSqrt=0;
long oddSqrt=0;
    for(int i=1;i<=n;i++){
        if (i%2==0) {
            evenSqrt+=i*i;
        }else{
            oddSqrt+=i*i;
        }
    }
    System.out.println(evenSqrt);
    System.out.println(oddSqrt);
}
}
