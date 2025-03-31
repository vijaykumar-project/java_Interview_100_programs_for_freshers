public class FindLargestThree {
    public static void main(String[] args) {
        int a=50,b=120,c=100;
        int largest=a;
    if (b>largest)largest=b;
    if(c>largest)largest=c;
    //largest=(a>b)?(b>c?a:c):(b>c?b:c);
    System.out.println(largest);
    }
}