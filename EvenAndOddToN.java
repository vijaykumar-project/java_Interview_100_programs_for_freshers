public class EvenAndOddToN {
    public static void main(String[] args) {
        int n = 5;
        System.out.println("Sum of Even Numbers using Loop: " + sumUsingLoopEven(n));
        System.out.println("Sum of odd Numbers using Loop: " + sumUsingLoopOdd(n));

        System.out.println("Sum of Even Numbers using Formula: " + sumUsingFormulaEven(n));
        System.out.println("Sum of odd Numbers using Formula: " + sumUsingFormulaOdd(n));
    }
    static int sumUsingLoopEven(int n) {
        int sum = 0;
        for (int i = 1; i <= n; i++) {
            if (i % 2 == 0) {
                sum += i;
            }
        }
        return sum;
    }
    static int sumUsingLoopOdd(int n) {
    int sum=0;
    for (int i=1;i<=n;i++) {
        if (i%2!=0) {
            sum+=i;
        }
    }
return sum;    
}

    static int sumUsingFormulaEven(int n) {
        int m = n / 2; 
        return m * (m + 1);
    }
    static int sumUsingFormulaOdd(int n) {
    int m=(n+1)/2;
    return m*m;
    }

 

}
