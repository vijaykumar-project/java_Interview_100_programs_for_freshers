public class SumOfNatural {
    public static void main(String[] args) {
        int n=5;
        System.out.println(loop(n));
        System.out.println(formula(n));
    }
static int loop(int n){
    int sum=0;
    for(int i=1;i<=n;i++){
        sum+=i;
    }
return sum;
}

static int formula(int n){
   return  n*(n+1)/2;
}
}
