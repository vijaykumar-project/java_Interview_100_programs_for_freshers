import java.util.Arrays;
public class SelectionSort {

    static void sort(int a[]){
        for (int i=0;i<a.length-1;i++) {
            int mid=i;
            for (int j = i+1; j <a.length; j++) {
                if (a[mid]>a[j]) {
                    mid=j;
                }
            }
            int temp=a[mid];
            a[mid]=a[i];
            a[i]=temp;       
        }
    }
        public static void main(String[] args) {
            int[]a={20,30,175,0,4,5,7,90};
            sort(a);
            System.out.println(Arrays.toString(a));
        }
}