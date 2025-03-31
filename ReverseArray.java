import java.util.Arrays;
public class ReverseArray {
    public static void main(String[] args) {
    int []a={0,1,5,89,5,6,2};
int start=0;
int end =a.length-1;
while(start < end){
    int temp=a[start];
    a[start++]=a[end];
    a[end--]=temp;
}
System.out.println(Arrays.toString(a));
}
}
