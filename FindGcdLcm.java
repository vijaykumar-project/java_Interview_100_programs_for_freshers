public class FindGcdLcm {
    public static void main(String[] args) {
        
    int a =50,y=a;
    int b=54,x=b;

    while (b!=0) {
        int temp=b;
        b=a%b;
        a=temp;
    }

    int gcd=a;
    int lcm=(x*y)/gcd;
    System.out.println(gcd);
    System.err.println(lcm);
    }
}
