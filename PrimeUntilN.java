public class PrimeUntilN {
    public static void main(String[] args) {
    int times=5542;
    for (int i=0;i<=times;i++){
        if(isPrime(i)){
            System.out.println("the prime number between "+times+" = "+i);
        }
    }
    }         
    static boolean isPrime(int num){
        if (num<=1)return false;
        for(int i=2;i<=Math.sqrt(num);i++){
            if (num%i==0) {
                return false;
            }
        }
        return  true;
    }
}
