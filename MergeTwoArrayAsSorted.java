
import java.util.Arrays;
public class MergeTwoArrayAsSorted {
    public static void main(String[] args) {
        int a[]={1,5,6,1,2,7,2};
        int b[]={9,7,5,3,6,1,2};
        Arrays.sort(a);
        Arrays.sort(b);
int res[]=new int[a.length+b.length];
int i=0,j=0,k=0;
while (i<a.length&&j<b.length) {
    res[k++]=(a[i]<=b[j])?a[i++]:b[j++];
}
while(i<a.length) res[k++]=a[i++];
while(j<b.length) res[k++]=b[j++];

System.out.println(Arrays.toString(res));   
}

}
