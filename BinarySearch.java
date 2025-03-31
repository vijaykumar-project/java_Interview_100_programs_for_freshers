
import java.util.Arrays;
public class BinarySearch {
    public static void main(String[] args) {
        int[]a={20,30,175,0,4,5,7,90};
        Arrays.sort(a);
        int target=90;
        int start=0;
        int end=a.length-1;
        boolean irruka=false;

        while (start<=end) {
            int mid=(start+end)/2;
            if (a[mid]==target) {
                irruka=true;
                break;
            }else if(a[mid]<target) start=mid+1;
            else end=mid-1;
        }
    System.out.println(irruka);    
    }
    }

