public class SquareRoot1toN {
    public static void main(String[] args) {
        int n=50;
        usingLoop(n);   
        usingFormula(n); 
}
    static void usingLoop(int n){
        int sum=0;
        for(int i=0;i<=n;i++){
            sum+=i*i;
        }
        System.out.println(sum);
    }
    static void usingFormula(int n){
        int sum=(n*(n+1)*(2*n+1))/6;
        System.out.println(sum);
    }
}
