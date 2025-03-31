public class SumOfDigitUntilOne {
    public static void main(String[] args) {
        int n=541;
        if(n<0){
            System.out.println(n);
        }
        System.out.println(1+(n-1)%9);
    }
}
