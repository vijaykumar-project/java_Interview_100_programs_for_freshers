public class findMissingNum1ToN {
    public static void main(String[] args) {
        int a[] = {1,2,3,4,6,7,8,9};
        int n=a.length;
       int ExpectedNum=0;
        int Acutalsum=(n+1)*(n+2)/2;
        for(int num:a){
        ExpectedNum +=num ;
    }
    System.out.println("the missing number"+" "+(Acutalsum-ExpectedNum));
    }
}