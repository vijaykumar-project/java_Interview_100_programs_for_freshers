import java.util.Arrays;

public class MergeSort { 
    static void sort(int[] a, int left, int right) {
        if (left<right) {
            int mid=(left+right)/2;
            sort(a, left, mid);
            sort(a, mid+1, right);
            merge(a,left,mid,right);
                    }  
                }
static void merge(int[] a, int left, int mid, int right) {
    int n1=mid-left+1;
    int n2=right-mid;
    int l[]=new int[n1];
    int r[]=new int[n2];
    System.arraycopy(a,left, l, 0, n1);
    System.arraycopy(a,mid+1, r, 0, n2);
    int i=0,j=0,k=left;
while (i<n1&&j<n2) {
    a[k++]=(l[i]<=r[j])?l[i++]:r[j++];
}
while(i<n1) a[k++]=l[i++];

while(j<n2) a[k++]=r[j++];

}
            
public static void main(String[] args) {
int[]a={20,30,175,0,4,5,7,90};
int left=0,right=a.length-1;
sort(a,left,right);
System.out.println(Arrays.toString(a));
 }
}
