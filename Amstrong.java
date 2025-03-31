public class Amstrong {
    public static void main(String[] args) {
        int num=9474;
        int og=num;
        int sum=0;
        int digits=String.valueOf(num).length();
        while (num!=0) {
            int digit=num%10;
            sum+=Math.pow(digit, digits);
            num/=10;
        }
        System.out.println("Amstrong of "+og+" is "+(sum==og));
    }
}
