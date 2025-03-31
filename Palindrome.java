public class Palindrome {
    public static void main(String[] args) {
        int num=1221;
        int og=num;
        int rev=0;
        while (num!=0) {
       rev=rev*10+num%10;
        num/=10;}
        System.out.println(og==rev);
    }
}
