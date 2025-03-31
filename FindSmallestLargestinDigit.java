public class FindSmallestLargestinDigit {
    public static void main(String[] args) {
        int num=2306;
        int smallest=9;
        int largest=0;
        while(num!=0){
            int digit=num%10;
            if (digit>largest)largest=digit;           
            if (digit<smallest)smallest=digit;                
        num/=10;
        }
    System.out.println("the largest number is :: "+largest);
    System.out.println("the smallest number is :: "+smallest);
    }
}
