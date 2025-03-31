
import java.util.Arrays;

public class RotateArrayByN {
    public static void main(String[] args) {
    int arr[]={1,2,3,4,5,6};
    int n=6;
    int k=n%arr.length;
    int start=0;
    int end=arr.length-1;

    swap(arr,start,end);
    swap(arr,start,k-1);
    swap(arr,k,end);
System.out.println(Arrays.toString(arr));
    }
    static void swap(int[]arr,int start,int end){
        while (start<end) {
            int temp=arr[start];
            arr[start++]=arr[end];
            arr[end--]=temp;
        }
    }

}
