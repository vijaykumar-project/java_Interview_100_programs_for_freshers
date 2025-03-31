public class AmstrongNumInRange {
    public static void main(String[] args) {
        int start =100;
        int end=170;
        if (start<end) {
        for (int i=start ;i<=end;i++) {
            if (isAmstrong(i)) {
                System.out.println(i+" this number is amstrong");   
            }
        }
    }else{
        System.out.println("the range is not correct");
    }
}
 static boolean isAmstrong(int n){
    int digit=String.valueOf(n).length();
    int sum=0;
    int og=n;
while (n!=0) {
    int f=n%10;
    sum+=(int)Math.pow(f, digit);
    n/=10;
}
return (sum==og);
}
}
