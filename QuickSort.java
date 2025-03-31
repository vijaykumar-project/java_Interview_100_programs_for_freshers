import java.util.Arrays;
public class QuickSort {
static void quickSort(int a[],int low ,int high){
if (low<high) {
    int pivotindex=partision(a,low,high);
    quickSort(a, low, pivotindex-1);
    quickSort(a,pivotindex+1,high);
}}
static int partision(int a[],int low,int high){
 int key=a[high];
 int i=low-1;
 for (int j=low;j<high;j++) {
    if (a[j]<key) {
        i++;
        int temp=a[i];
        a[i]=a[j];
        a[j]=temp;
    }
 }
 int temp=a[i+1];
 a[i+1]=a[high];
 a[high]=temp;
 return i+1;
}
     public static void main(String[] args) {
            int[]a={20,30,175,0,4,5,7,90};
            int low=0;
            int high=a.length-1;
            quickSort(a, low, high); 
            System.out.println(Arrays.toString(a));
                    }
            
                
}
