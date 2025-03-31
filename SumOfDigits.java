public class SumOfDigits {
    public static void main(String[] args) {
        int num=4587;
        System.out.println (recursion(num));
        System.out.println(normal(num));   
    }    
    static int recursion(int num){

        if (num==0) return 0;
        return (num%10) + recursion(num/10);

    }    
    static int normal(int num){
    int digit=0;
    while(num!=0){
        digit+=num%10;
        num/=10;
    }
return digit;
}
}
