public class PowerOfNum {
    public static void main(String[] args) {
        int base=3;
        int exponent=3;
        int result=1;
    for(int i=1;i<=exponent;i++){
        result*=base;
    }
    System.out.println(result);
    }
}
