    public class SumOfPrimeUptoN {
        public static void main(String[] args) {
            int n=50;
            int sum=0;
            for(int i=2;i<=n;i++){
                if (isPrime(i))
                {
                    sum+=i;    
                }
            }
            System.out.println(sum);
        }
        static boolean isPrime(int n){
            if (n<2) return false;
            for (int i=2;i<=Math.sqrt(n);i++){
                if (n%i==0) {
                    return false;
                }
            }
    return true;
        }
    }
